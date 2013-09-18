import static ch.lambdaj.Lambda.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.List;

import ch.lambdaj.Lambda;

public class ActiveUsersService {


    public List<User> getOldUsers(ArrayList<User> users) {
        return Lambda.filter(having(on(User.class).getAge(), greaterThan(30)), users);
    }
}
