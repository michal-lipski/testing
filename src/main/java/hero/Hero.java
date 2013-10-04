package hero;

import java.util.List;
import java.util.Map;

public class Hero {

    private String alias;
    private String realFirstName;
    private String realLastName;
    private HeroOrigin origin;
    private List<String> symbols;
    public int numberOfFightsWon;
    private int power;
    private String weapon;
    private int health;

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

    public boolean fight(Hero opponent) {
        boolean won = this.power > opponent.power;
        if (won) {
            numberOfFightsWon++;
        }
        return won;
    }

    public boolean fight(Hero opponent, Map<String, String> fightContext) {
        if ("Superman".equals(this.alias) && "kryptonite".equals(opponent.weapon)) {
            return false;
        }
        if (this.power == opponent.power) {
            return "day".equals(fightContext.get("timeOfDay"));
        }
        return this.power > opponent.power;
    }

    public Hero weapon(String weapon) {
        this.weapon = weapon;
        return this;
    }

    public void inflictDamage(int damage) {
        if (damage > 5) {
            health--;
        }
    }

    public Hero health(int health) {
        this.health = health;
        return this;
    }

    public int getHealth() {
        return health;
    }
}
