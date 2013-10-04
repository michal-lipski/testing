package production_logic_in_test;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;
//TODO change to hero
public class PersonTest {

//test against implementation
//100% coverage but functionality is not tested
    @Test
    public void says_hello_with_name() {
        Person bob = new Person("Bob");

        String helloFromBob = bob.sayHello();

        assertThat(helloFromBob).isEqualTo("Hello from " + bob.getName());
    }

    private class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String sayHello() {
            return "Hello from " + name;
        }

        public String getName() {
            return name;
        }
    }
}
