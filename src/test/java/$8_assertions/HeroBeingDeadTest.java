package $8_assertions;

import static com.googlecode.catchexception.CatchException.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

import hero.Hero;

import hero.HeroBuilder;
import org.junit.Ignore;
import org.junit.Test;

public class HeroBeingDeadTest {

    @Test
    public void hero_cannot_fight_when_is_dead() throws Exception {
        Hero hero = new HeroBuilder().createHero().health(0);

        try {
            hero.fight(anyHero());
            //fail("Exception was not thrown");
        } catch (Hero.DeadException exception) {
            //expected DeadException
        }
    }


    @Test(expected = Hero.DeadException.class)
    public void hero_cannot_fight_when_is_dead_v2() throws Exception {
        Hero hero = new HeroBuilder().createHero().health(0);

        hero.fight(anyHero());

        //exception expected
    }

    @Test
    public void hero_cannot_fight_when_is_dead_v3() throws Exception {
        Hero hero = new HeroBuilder().createHero().health(0);

        catchException(hero).fight(anyHero());

        assertThat(caughtException()).isExactlyInstanceOf(Hero.DeadException.class);
    }


    private Hero anyHero() {
        return new HeroBuilder().createHero();
    }
}
