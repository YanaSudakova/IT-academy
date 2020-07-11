package homework8;

//1. Написать класс Person который содержит поля:
// 1.1. Строку nick - псевдоним пользователя
// 1.2. Строку password - пароль
//4. При помощи рандома генерируем 1_000_000 объектов Person. LinkedList. Если компьютер глючит сделать 100_000

import java.util.LinkedList;

public class Person {
    private String nick;
    private String password;


    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
