import org.joda.time.LocalDate;

public class User {

    private String name;
    private String surname;
    private String city;
    private Integer age;

    private LocalDate loginDate;

    public User() {
    }

    public User(String name, String surname, String city, Integer age, LocalDate loginDate) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.age = age;
        this.loginDate = loginDate;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCity() {
        return city;
    }

    public LocalDate getLoginDate() {
        return loginDate;
    }

    public Integer getAge() {
        return age;
    }

    public User age(int age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return name + surname + city + age + loginDate;
    }
}
