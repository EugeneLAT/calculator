package calculator;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class Calculator {

    public String calculate(String[] expression) {
        String numberFirst = expression[0];
        String numberSecond = expression[2];
        String operation = expression[1]; // + - / *

        double doubleNumberFirst = Double.parseDouble(numberFirst); // double DoubleA = String->Double
        double doubleNumberSecond = Double.parseDouble(numberSecond); // double DoubleB = String->Double
        double result;

        if (expression.length == 3) {

            switch (operation) {
                case "+":
                    result = doubleNumberFirst + doubleNumberSecond;
                    break;
                case "-":
                    result = doubleNumberFirst - doubleNumberSecond;
                    break;
                case "*":
                    result = doubleNumberFirst * doubleNumberSecond;
                    break;
                case "/":
                    result = doubleNumberFirst / doubleNumberSecond;
                    break;
                default:
                    return "ERROR";

            }
            return String.valueOf(result); // Double->String
        }



        return "0";
    }
}
