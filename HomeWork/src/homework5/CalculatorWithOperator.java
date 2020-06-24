package homework5;

//Создать класс CalculatorWithOperator, все методы в данном классе НЕ статические.
// В классе CalculatorWithOperator должны присутствовать 4 метода (деления, умножение, вычитание, сложение) каждый из этих методов должен принимать два параметра (определитесь с их типами)
// и должны возвращать результать (определиться с возвращаемым типом результата) при помощи ключевого слово return.
// Также должно быть ещё 3 метода (Возведение в степень, Модуль числа, Корень из числа).
// В методах можно использовать оператор + / * -. Использование библиотеки Math ЗАПРЕЩЕНО!.

public class CalculatorWithOperator {
    public double plus(double a, double b) {
        return a + b;
    }

    public double minus(double a, double b) {
        return a - b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double square(double a) {
        double temp;

        double squareRoot = a / 2;

        do {
            temp = squareRoot;
            squareRoot = (temp + (a / temp)) / 2;
        } while ((temp - squareRoot) != 0);

        return squareRoot;
    }

    public double abs(double a) {
        if (a < 0) {
            a *= -1;
        }
        return a;
    }

    public double power(double a, double b) {
        double result = a;
        for (double i = 1; i < b; i++) {
            result *= a;
        }
        return result;
    }
}
