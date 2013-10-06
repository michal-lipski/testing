package hero;

import java.util.List;

import ch.lambdaj.Lambda;
import com.google.common.collect.Lists;

import static ch.lambdaj.Lambda.*;
import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.CoreMatchers.equalTo;

public class HeroRepository {

    List<Hero> heroes = newArrayList();

    public List<Hero> fetchAll() {
        return Lists.newArrayList();
    }

    public Hero save(Hero hero) {
        heroes.add(hero);
        return hero;
    }

    public List<Hero> findByName(String name) {
        return filter(having(on(Hero.class).getAlias(), equalTo(name)), heroes);
        //return heroes;
    }
}
