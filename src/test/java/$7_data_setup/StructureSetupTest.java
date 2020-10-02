package $7_data_setup;

import static org.assertj.core.api.Assertions.*;

import data_setup.EpitaphWriter;
import hero.Hero;
import hero.HeroOrigin;

import org.junit.Test;

public class StructureSetupTest {

    private EpitaphWriter epitaphWriter = new EpitaphWriter();

    @Test
    public void epitaph_for_any_hero() {
        Hero anyHero = new Hero("Batman", "anyFirstName", "anyLastName", new HeroOrigin(1, "anyOrigin"));

        String epitaph = epitaphWriter.epitaphFor(anyHero);

        assertThat(epitaph).isEqualTo("Batman is dead");
    }

    @Test
    public void epitaph_for_hero_from_Germany() {
        Hero heroFromGermany = new Hero("Doctor Octopus", "anyFirstName", "anyLastName", HeroOrigin.GERMANY);

        String epitaph = epitaphWriter.epitaphFor(heroFromGermany);

        assertThat(epitaph).isEqualTo("Doctor Octopus ist tot");
    }

    @Test
    public void epitaph_for_hero_known_by_his_real_name() {
        Hero heroWithNoAlias = new Hero(null, "Sherlock", "Holmes", new HeroOrigin(1, "anyOrigin"));

        String epitaph = epitaphWriter.epitaphFor(heroWithNoAlias);

        assertThat(epitaph).isEqualTo("Sherlock Holmes is dead");
    }

}
