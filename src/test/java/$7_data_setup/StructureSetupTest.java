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
        Hero anyHero = aHero().withAlias("Batman").build();

        String epitaph = epitaphWriter.epitaphFor(anyHero);

        assertThat(epitaph).isEqualTo("Batman is dead");
    }

    @Test
    public void epitaph_for_hero_from_Germany() {
        Hero heroFromGermany = aHero()
                .withAlias("Doctor Octopus")
                .from(HeroOrigin.GERMANY).build();

        String epitaph = epitaphWriter.epitaphFor(heroFromGermany);

        assertThat(epitaph).isEqualTo("Doctor Octopus ist tot");
    }

    @Test
    public void epitaph_for_hero_known_by_his_real_name() {
        Hero heroWithNoAlias = aHero().named("Sherlock", "Holmes").build();

        String epitaph = epitaphWriter.epitaphFor(heroWithNoAlias);

        assertThat(epitaph).isEqualTo("Sherlock Holmes is dead");
    }

    private static HeroBuilder aHero() {
        return new HeroBuilder();
    }

    private static class HeroBuilder {
        private String alias;
        private HeroOrigin origin = new HeroOrigin(1, "anyOrigin");
        private String firstName = "anyFirstName";
        private String lastName = "anyLastName";

        public HeroBuilder withAlias(String alias) {
            this.alias = alias;
            return this;
        }

        public HeroBuilder from(HeroOrigin origin) {
            this.origin = origin;
            return this;
        }

        public HeroBuilder named(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            return this;
        }

        public Hero build() {
            return new hero.HeroBuilder().createHero()
                    .alias(alias)
                    .realFirstName(firstName)
                    .realLastName(lastName)
                    .origin(origin);
        }
    }
}
