package calculator;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class Calculator {

    public String calculate(String[] expression) {
        String a = expression [0]; //
        String b = expression [2]; //
        String operation = expression [1]; //

        double DoubleA = Double.parseDouble(a); // double DoubleA = String->Double
        double DoubleB = Double.parseDouble(b); // double DoubleB = String->Double
        double result = 0;

        /*if(operation.equals("+")) {     // operation.equals("+") -> sravnienie s +
            result = DoubleA + DoubleB;
        }else if(operation.equals("-")) { // operation.equals("-") -> sravnienie s -
            result = DoubleA - DoubleB;
        }else if(operation.equals("*")) { // operation.equals("*") -> sravnienie s *
            result = DoubleA * DoubleB;
        }else if(operation.equals("/")) { // operation.equals("/") -> sravnienie s /
            result = DoubleA / DoubleB;
        }*/

        switch (operation){
            case "+":
                result = DoubleA + DoubleB;
                break;
            case "-":
                result = DoubleA - DoubleB;
                break;
            case "*":
                result = DoubleA * DoubleB;
                break;
            case "/":
                result = DoubleA / DoubleB;
                break;
            default:
                return "ERROR";
        }
        return String.valueOf(result); // Double->String
    }

}
