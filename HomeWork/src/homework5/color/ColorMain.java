package homework5.color;

//В отдельном классе, создать мэйн метод. Внутри данного метода создать экземпляр Color. В конструктор передать число 3.
// Далее вывести в консоль номер цвета и его названия используя результат выполнения методов getNumber и getName.

public class ColorMain {
    public static void main(String[] args) {

        Color color = new Color(3);

        System.out.println("Цвет - " + color.getName() + ", номер - " + color.getNumber());
    }
}
