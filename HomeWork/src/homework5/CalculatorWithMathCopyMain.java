package homework5;

//4. В отдельном классе, создать мэйн метод. Внутри данного метода создать экземпляр класса CalculatorWithMathCopy сохранив его в переменную.
// При помощи методов созданного объекта вичислить результат выражения 4.1 + 15 * 7 + (28 / 5) ^ 2. Результат записать в переменную (определить самый подходящий тип переменной).
// Вывести сохранённый результат в консоль.
//4. Далее сохранённый результат попробовать поделить на 0 (если возникнет ошибка закомментировать и прокоментировать почему)
//5. Далее сохранённый результат попробовать поделить на 0.0d  (если возникнет ошибка закомментировать и прокоментировать почему)

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {

        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();

        double divide = calculator.divide(28, 5);
        double power = calculator.power(divide, 2);
        double multiple = calculator.multiply(15, 7);
        double plus = calculator.plus(4.1, multiple);
        double result = calculator.plus(plus, power);

        System.out.println(result);
        System.out.println(result / 0);
        System.out.println(result / 0.0d);
        //В Java тип double имеет специальные значения для понятий «плюс бесконечность» и «минус бесконечность».
        // Положительное число, разделенное на 0.0, дает «плюс бесконечность», а отрицательное – «минус бесконечность»

    }
}
