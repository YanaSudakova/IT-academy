package homework8;

//4. При помощи рандома генерируем 1_000_000 объектов Person. LinkedList. Если компьютер глючит сделать 100_000
//8. Отсортировать списки при помощи созданный компараторов
//9. Замерить скорость наполнения LinkedList и ArrayList.
// Скорость наполнения - это разница между количеством миллисекунд между началом вставки в список первого элемента, и количеством миллесукунд после конца вставки последного элемента.
// В комментарии написать количество миллисекунд. Для получения текущего количества миллесекунд использовать метод из jdk System.currentTimeMillis().
//10. Удалить все элементы из списка Person при помощи iterator
//12. Замерить скорость удаления LinkedList и ArrayList. В комментарии написать количество миллисекунд.

import java.util.Iterator;
import java.util.LinkedList;

public class PersonMain {
    public static void main(String[] args) {
        LinkedList<Person> persons = new LinkedList<>();
        PersonPassLengthComparator comparator = new PersonPassLengthComparator();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {

            Person person = new Person();
            String password = RandomString.random(10);
            person.setPassword(password);
            String nick = RandomString.random(10);
            person.setNick(nick);
            persons.add(person);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Linked list took : " + (endTime - startTime) + " ms");//18664

        persons.sort(comparator);

        long startTimeDelete = System.currentTimeMillis();

        Iterator<Person> i = persons.iterator();
        while (i.hasNext()) {
            i.next();
            i.remove();
        }

        long endTimeDelete = System.currentTimeMillis();
        System.out.println("Linked list delete elements took " + (endTimeDelete - startTimeDelete) + " ms"); //33
    }
}
