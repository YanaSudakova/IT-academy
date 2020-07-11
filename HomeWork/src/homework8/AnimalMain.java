package homework8;

//5. При помощи рандома генерируем 1_000_000 объектов Animal. ArrayList. Если компьютер глючит сделать 100_000
//8. Отсортировать списки при помощи созданный компараторов
//9. Замерить скорость наполнения LinkedList и ArrayList.
// Скорость наполнения - это разница между количеством миллисекунд между началом вставки в список первого элемента, и количеством миллесукунд после конца вставки последного элемента.
// В комментарии написать количество миллисекунд. Для получения текущего количества миллесекунд использовать метод из jdk System.currentTimeMillis().
//11. Удалить все элементы из списка Animal при помощи любого из циклов.
// 12. Замерить скорость удаления LinkedList и ArrayList. В комментарии написать количество миллисекунд.

import java.util.ArrayList;
import java.util.Random;

public class AnimalMain {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        AnimalAgeComparator comparator = new AnimalAgeComparator();

        Random randomAge = new Random();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            Animal animal = new Animal();
            int age = randomAge.nextInt(100);
            animal.setAge(age);
            String nick = RandomString.random(10);
            animal.setNick(nick);
            animals.add(animal);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Array list took : " + (endTime - startTime) + " ms"); //9482

        animals.sort(comparator);

        try {
            for (Animal animal : animals) {
                animals.remove(animal);
            }
        } catch (Exception e) {
            System.out.println("Ошибка! В Java нельзя удаляеть элемент напрямую из коллекции во время использования итератора. " +
                    "Т.к. в этом случае появляется неопределенность, откуда итератор должен продолжать и какие последующие элементы должен пройти, выбрасывается исключение. ");
        }
    }

}
