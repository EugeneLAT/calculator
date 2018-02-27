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
//(expecsion.lenght + 1)/2
        if (expression.length == 7){
            Integer[] allNumbers = new Integer[expression.length]; // allNumbers[size]
            Character[] allSign; // allSign[sign]
            int size = (expression.length + 1)/2 ;
            int [] nums = new int [size];
            for(int i =0; i < size;i+=1){

                nums[i] = Integer.parseInt(expression[i*2]);
            }

            for(int i =1; i > expression.length;i+=1){
                char sign[];
                sign[i] = expression[i];
            }
        }
        return "Sorry!";
    }

}

