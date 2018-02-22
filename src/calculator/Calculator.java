package calculator;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */

public class Calculator {

    public String calculate(String[] expression) {

        if (expression.length == 3) {
            String numberFirst = expression[0];
            String numberSecond = expression[2];
            String operation = expression[1];

            double doubleNumberFirst = Double.parseDouble(numberFirst);
            double doubleNumberSecond = Double.parseDouble(numberSecond);
            double result;


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

        if (expression.length == 5) {
            String numberFirst = expression[0];
            String operation = expression[1];
            String numberSecond = expression[2];
            String operation2 = expression[3];
            String numberThird = expression[4];

            double doubleNumberFirst = Double.parseDouble(numberFirst);
            double doubleNumberSecond = Double.parseDouble(numberSecond);
            double doubleNumberThird = Double.parseDouble(numberThird);
            double result;


            switch (operation) {
                case "+":
                    switch (operation2) {
                        case "+":
                            result = doubleNumberFirst + doubleNumberSecond + doubleNumberThird;
                            break;
                        case "-":
                            result = doubleNumberFirst + doubleNumberSecond - doubleNumberThird;
                            break;
                        case "*":
                            result = doubleNumberFirst + (doubleNumberSecond * doubleNumberThird);
                            break;
                        case "/":
                            result = doubleNumberFirst + (doubleNumberSecond / doubleNumberThird);
                            break;
                        default:
                            return "ERROR";
                    }
                    break;
                case "-":
                    switch (operation2) {
                        case "+":
                            result = doubleNumberFirst - doubleNumberSecond + doubleNumberThird;
                            break;
                        case "-":
                            result = doubleNumberFirst - doubleNumberSecond - doubleNumberThird;
                            break;
                        case "*":
                            result = doubleNumberFirst - (doubleNumberSecond * doubleNumberThird);
                            break;
                        case "/":
                            result = doubleNumberFirst - (doubleNumberSecond / doubleNumberThird);
                            break;
                        default:
                            return "ERROR";
                    }
                    break;
                case "*":
                    switch (operation2) {
                        case "+":
                            result = (doubleNumberFirst * doubleNumberSecond) + doubleNumberThird;
                            break;
                        case "-":
                            result = (doubleNumberFirst * doubleNumberSecond) - doubleNumberThird;
                            break;
                        case "*":
                            result = doubleNumberFirst * doubleNumberSecond * doubleNumberThird;
                            break;
                        case "/":
                            result = doubleNumberFirst * doubleNumberSecond / doubleNumberThird;
                            break;
                        default:
                            return "ERROR";
                    }
                    break;
                case "/":
                    switch (operation2) {
                        case "+":
                            result = (doubleNumberFirst / doubleNumberSecond) + doubleNumberThird;
                            break;
                        case "-":
                            result = (doubleNumberFirst / doubleNumberSecond) - doubleNumberThird;
                            break;
                        case "*":
                            result = doubleNumberFirst / doubleNumberSecond * doubleNumberThird;
                            break;
                        case "/":
                            result = doubleNumberFirst / doubleNumberSecond / doubleNumberThird;
                            break;
                        default:
                            return "ERROR";
                    }
                    break;
                default:
                    return "ERROR";

            }
            return String.valueOf(result);
        }

        return "Sorry!";
    }

}

