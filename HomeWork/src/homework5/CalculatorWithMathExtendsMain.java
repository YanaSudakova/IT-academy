package homework5;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {

        CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();

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
