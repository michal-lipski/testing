package $8_assertions;

import static org.assertj.core.api.Assertions.*;
import hero.Hero;
import hero.HeroOrigin;
import hero.HeroService;

import org.junit.Test;

public class StructureTest {

    private HeroService heroService = new HeroService();

    @Test
    public void hero_has_complete_structure() {
        Hero hero = heroService.getHero(1);

        assertThat(hero.getAlias()).isEqualTo("Superman2");
        assertThat(hero.getRealFirstName()).isEqualTo("Clark");
        assertThat(hero.getRealLastName()).isEqualTo("Kent");
        assertThat(hero.getOrigin()).isEqualTo(new HeroOrigin(87, "Krypton"));
        assertThat(hero.getSymbols()).containsExactly("blue costume", "red cape", "S-shield");
    }

}
