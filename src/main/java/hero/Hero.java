package hero;

import java.util.List;

public class Hero {

    private String name;
    private String realFirstName;
    private String realLastName;
    private HeroOrigin origin;
    private List<String> symbols;

    public String getName() {
        return name;
    }

    public Hero name(String name) {
        this.name = name;
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

}
