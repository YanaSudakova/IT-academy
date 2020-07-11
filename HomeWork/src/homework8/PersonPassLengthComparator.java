package homework8;

//6. Создать класс PersonPassLengthComparator который наследует интерфейс Comparator из jdk. Данный класс должен сравнивать длинну пароля пользователей.

import java.util.Comparator;

public class PersonPassLengthComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getPassword().compareTo(o2.getPassword());
    }
}
