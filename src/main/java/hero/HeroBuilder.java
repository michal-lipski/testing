package hero;

import java.util.List;

public class HeroBuilder {
    private String alias;
    private String realFirstName;
    private String realLastName;
    private HeroOrigin origin;
    private List<String> symbols;
    private int numberOfFightsWon;
    private int power;

    public HeroBuilder setAlias(String alias) {
        this.alias = alias;
        return this;
    }

    public HeroBuilder setRealFirstName(String realFirstName) {
        this.realFirstName = realFirstName;
        return this;
    }

    public HeroBuilder setRealLastName(String realLastName) {
        this.realLastName = realLastName;
        return this;
    }

    public HeroBuilder setOrigin(HeroOrigin origin) {
        this.origin = origin;
        return this;
    }

    public HeroBuilder setSymbols(List<String> symbols) {
        this.symbols = symbols;
        return this;
    }

    public HeroBuilder setNumberOfFightsWon(int numberOfFightsWon) {
        this.numberOfFightsWon = numberOfFightsWon;
        return this;
    }

    public HeroBuilder setPower(int power) {
        this.power = power;
        return this;
    }

    public Hero createHero() {
        return new Hero();
    }
}