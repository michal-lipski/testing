package $3_given_when_then;

import static com.google.common.collect.Lists.newArrayList;
import static org.assertj.core.api.Assertions.assertThat;

import hero.HeroBuilder;
import org.junit.Test;

import hero.Hero;

public class HeroFightTest {

    public static final int MIN_DAMAGE = 500;

    @Test
    public void hero_with_greater_power_should_win() {
        Hero superman = new HeroBuilder().createHero().power(5);
        Hero lexLuthor = new HeroBuilder().createHero().power(4);

        boolean supermanWon = superman.fight(lexLuthor);

        assertThat(supermanWon).isTrue();
    }

    @Test
    public void hero_who_was_damaged_has_lower_health(){
        Hero lexLuthor = new HeroBuilder().createHero().health(10);

        lexLuthor.inflictDamage(MIN_DAMAGE);

        assertThat(lexLuthor.getHealth()).isEqualTo(9);
    }

    @Test
    public void increase_number_of_won_fights(){
        Hero superman = new HeroBuilder().createHero().power(5);
        Hero lexLuthor = new HeroBuilder().createHero().power(4);

        superman.fight(lexLuthor);

        assertThat(superman.numberOfFightsWon).isEqualTo(1);
        assertThat(lexLuthor.numberOfFightsWon).isEqualTo(0);
    }

    @Test
    public void new_hero_should_have_zero_fights_won(){
        Hero superman = new HeroBuilder().createHero();

        assertThat(superman.numberOfFightsWon).isEqualTo(0);
    }

}
