package $8_assertions;

import static $8_assertions.StructureTest.HeroAssertion.assertThatHero;
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

        assertThatHero(hero)
                .hasAlias("Superman")
                .isCalled("Clark", "Kent")
                .comesFrom(new HeroOrigin(87, "Krypton"))
                .hasSymbols("blue costume", "red cape", "S-shield");
    }


    static class HeroAssertion {

        public static HeroAssertion assertThatHero(Hero hero) {
            return new HeroAssertion(hero);
        }

        private Hero hero;

        public HeroAssertion(Hero hero) {
            this.hero = hero;
        }

        public HeroAssertion hasAlias(String alias) {
            assertThat(hero.getAlias()).isEqualTo(alias);
            return this;
        }

        public HeroAssertion isCalled(String firstName, String lastName) {
            assertThat(hero.getRealFirstName()).isEqualTo(firstName);
            assertThat(hero.getRealLastName()).isEqualTo(lastName);
            return this;
        }

        public HeroAssertion comesFrom(HeroOrigin origin) {
            assertThat(hero.getOrigin()).isEqualTo(origin);
            return this;
        }

        public HeroAssertion hasSymbols(String... symbols) {
            assertThat(hero.getSymbols()).containsExactly(symbols);
            return this;
        }
    }
}
