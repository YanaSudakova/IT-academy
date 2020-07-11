package homework8;

//7. Создать класс AnimalAgeComparator который наследует интерфейс Comparator из jdk. Данный класс должен сравнивать возраст животных.

import java.util.Comparator;

public class AnimalAgeComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getAge() - o2.getAge();
    }
}
