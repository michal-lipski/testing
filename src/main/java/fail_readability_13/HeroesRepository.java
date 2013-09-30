package fail_readability_13;

import static com.google.common.collect.Lists.*;

import java.util.List;

public class HeroesRepository {

    List<Hero> heroes = newArrayList();

    public Hero save(Hero hero) {
        heroes.add(hero);
        return hero;
    }

    public List<Hero> findByName(String name) {
//        return Lambda.filter(having(on(Hero.class).getName(), equalTo(name)), heroes);
        return heroes;
    }
}
