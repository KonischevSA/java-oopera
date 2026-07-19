package persons;

import java.util.Objects;

public class Person {
    protected String name;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }

    protected String surname;
    protected Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        int hash = 17;

        if (name != null) {
            hash += name.hashCode();
        }
        hash *= 31;

        if (surname != null) {
            hash += surname.hashCode();
        }

        return hash;
    }
}
