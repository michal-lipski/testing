package $4_contextual_test;


import hero.Hero;
import hero.HeroBuilder;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static com.google.common.collect.Maps.newHashMap;
import static org.assertj.core.api.Assertions.assertThat;

public class FightDuringNight {

    private Map<String,String> fightContext;

    @Before
    public void setupNightContext() {
        fightContext = newHashMap();
        fightContext.put("timeOfDay", "night");
    }

    @Test
    public void superman_loses_during_night_with_equal_power() {
        Hero superman = new HeroBuilder().createHero().alias("Superman").power(3);
        Hero lexLuthor = new HeroBuilder().createHero().realLastName("Lex").realLastName("Luthor").power(3);

        boolean supermanWon = superman.fight(lexLuthor, fightContext);

        assertThat(supermanWon).isFalse();
    }

}