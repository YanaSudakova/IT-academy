package homework5.color;

//1. Создать класс Color. Класс должен содержать:
//1.0 Все поля должны быть приватными, все методы должны быть публичны, конструкторы должен быть публичными. Статических методов быть не должно.
//1.1 Создать конструктор который будет принимать параметр int. Туда мы будем передавать номер цвета.
//1.2 Внутри класса создать константы цветов радуги которые будут содержать номера цветов (http://cyclowiki.org/wiki/%D0%9A%D0%B0%D0%B6%D0%B4%D1%8B%D0%B9_%D0%BE%D1%85%D0%BE%D1%82%D0%BD%D0%B8%D0%BA_%D0%B6%D0%B5%D0%BB%D0%B0%D0%B5%D1%82_%D0%B7%D0%BD%D0%B0%D1%82%D1%8C,_%D0%B3%D0%B4%D0%B5_%D1%81%D0%B8%D0%B4%D0%B8%D1%82_%D1%84%D0%B0%D0%B7%D0%B0%D0%BD). Например RED = 1;
//1.3 Создать методы getNumber() и getName(). Метод getNumber должен вернуть номер цвета который мы передали в конструктор.
// Метод getName должен возвращать название цвета ввиде строки на русском, если цвет нам не известен возвращать строку "неизвестно" .
// В методе getName должен использоваться switch и константы объявленные при выполнении первого пункта. Внимание никакой печати в консоль внутри класс Color быть не должно.

public class Color {

    private int number;

    private static final int RED = 1;
    private static final int ORANGE = 2;
    private static final int YELLOW = 3;
    private static final int GREEN = 4;
    private static final int BLUE = 5;
    private static final int DARK_BLUE = 6;
    private static final int VIOLET = 7;


    public Color(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        switch (number) {
            case RED:
                return "красный";
            case ORANGE:
                return "оранжевый";
            case YELLOW:
                return "жёлтый";
            case GREEN:
                return "зелёный";
            case BLUE:
                return "голубой";
            case DARK_BLUE:
                return "синий";
            case VIOLET:
                return "фиолетовый";
            default:
                return "неизвестно";
        }
    }
}


