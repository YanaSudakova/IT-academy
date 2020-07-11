package homework8;

//2. Написать класс Animal:
// 2.1. Число age - возраст
// 2.2. Строка nick - кличка
//5. При помощи рандома генерируем 1_000_000 объектов Animal. ArrayList. Если компьютер глючит сделать 100_000

public class Animal {
    private int age;
    private String nick;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
}
