package fail_readability_13;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.Test;

public class HeroesTest {

    private HeroesRepository repository = new HeroesRepository();

    //TODO move to real Hero
    @Test
    public void find_users_by_name() {
        Hero spiderman = repository.save(new Hero("Spiderman"));
        Hero superman = repository.save(new Hero("Superman"));

        List<Hero> heroes = repository.findByName("Spiderman");

        assertThat(heroes).contains(spiderman).doesNotContain(superman);
    }

    @Test
    public void find_users_by_name_better() {
        Hero spiderman = repository.save(namedHero("spiderman"));
        Hero superman = repository.save(namedHero("superman"));

        List<Hero> marvellHeroes = repository.findByName("spiderman");

//        assertThat(marvellHeroes).containsOnly(spiderman);
        assertThat(marvellHeroes).contains(spiderman).doesNotContain(superman);
    }

    private Hero namedHero(final String name) {
        return new Hero(name) {
            @Override
            public String toString() {
                return name;
            }
        };
    }

    @Test
    public void find_users_by_name_overriding_error_message() {
        Hero spiderman = repository.save(new Hero("Spiderman"));
        Hero superman = repository.save(new Hero("Superman"));

        List<Hero> heroes = repository.findByName("Spiderman");

        assertThat(heroes).overridingErrorMessage("Expecting Marvell heroes to contain %s only", spiderman.getName()).contains(spiderman)
                .doesNotContain(superman);
    }
}
