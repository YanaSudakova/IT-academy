package homework5;

//Создать класс CalculatorWithMathCopy (скопировать базовые математические операции из CalculatorWithOperator)
//Изучить библиотеку (класс) Math из jdk. (https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html)
//В классе CalculatorWithMathCopy должны присутствовать 4 метода (деления, умножение, вычитание, сложение) данные методы можно скопировать из класса CalculatorWithOperator.
//В методах (Возведение в степень, Модуль числа, Корень из числа) можно использовать только вызовы  методов библиотеки Math, все методы в данном классе НЕ статические
// Повторить пункты 3-5 с классом CalculatorWithMathCopy:
//3. Создать класс CalculatorWithOperator, все методы в данном классе НЕ статические. В классе CalculatorWithOperator должны присутствовать 4 метода (деления, умножение, вычитание, сложение)
// каждый из этих методов должен принимать два параметра (определитесь с их типами) и должны возвращать результать (определиться с возвращаемым типом результата) при помощи ключевого слово return.
// Также должно быть ещё 3 метода (Возведение в степень, Модуль числа, Корень из числа). В методах можно использовать оператор + / * -. Использование библиотеки Math ЗАПРЕЩЕНО!.
//4. В отдельном классе, создать мэйн метод. Внутри данного метода создать экземпляр класса CalculatorWithOperator сохранив его в переменную.
// При помощи методов созданного объекта вичислить результат выражения 4.1 + 15 * 7 + (28 / 5) ^ 2. Результат записать в переменную (определить самый подходящий тип переменной).
// Вывести сохранённый результат в консоль.
//4. Далее сохранённый результат попробовать поделить на 0 (если возникнет ошибка закомментировать и прокоментировать почему)
//5. Далее сохранённый результат попробовать поделить на 0.0d  (если возникнет ошибка закомментировать и прокоментировать почему)

public class CalculatorWithMathCopy {
    public  double plus (double a, double b ){
        return a + b;
    }
    public double minus (double a, double b){
        return a - b;
    }
    public double divide (double a, double b){
        return a / b;
    }
    public double multiply (double a, double b){
        return a * b;
    }
    public double square (double a){
        return Math.sqrt(a);
    }
    public double power (double a, double b){
        return Math.pow(a, b);
    }
    public double abs (double a){
        return Math.abs(a);
    }
}
