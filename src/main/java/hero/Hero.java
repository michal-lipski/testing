package hero;

import java.util.List;

public class Hero {

    private String alias;
    private String realFirstName;
    private String realLastName;
    private HeroOrigin origin;
    private List<String> symbols;
    public int numberOfFightsWon;
    private int power;

    public String getAlias() {
        return alias;
    }

    public Hero alias(String alias) {
        this.alias = alias;
        return this;
    }

    public String getRealFirstName() {
        return realFirstName;
    }

    public Hero realFirstName(String realFirstName) {
        this.realFirstName = realFirstName;
        return this;
    }

    public String getRealLastName() {
        return realLastName;
    }

    public Hero realLastName(String realLastName) {
        this.realLastName = realLastName;
        return this;
    }

    public HeroOrigin getOrigin() {
        return origin;
    }

    public Hero origin(HeroOrigin origin) {
        this.origin = origin;
        return this;
    }

    public List<String> getSymbols() {
        return symbols;
    }

    public Hero symbols(List<String> symbols) {
        this.symbols = symbols;
        return this;
    }

    public Hero power(int power) {
        this.power = power;
        return this;
    }

    public boolean fight(Hero oponent) {
        return this.power > oponent.power;
    }
}
