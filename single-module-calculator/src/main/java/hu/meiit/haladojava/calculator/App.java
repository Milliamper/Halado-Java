package hu.meiit.haladojava.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static final String errorSign = "-";

    public static String roundToOneDecimal(String result) {
        double resultAsDouble = Double.parseDouble(result);
        DecimalFormat roundToOneDecimal = new DecimalFormat("##.0");
        return roundToOneDecimal.format(resultAsDouble);
    }

    public static void main(String[] args) {

        String result;

        try {
            String userInput = readUserInput();
            String[] parts = splitUserInputAmongWhitespace(userInput);
            checkingCorrectInput(parts);
            result = executeCalculation(convertUserInputIntoExpression(parts));

            System.out.println(roundToOneDecimal(result));

        } catch (Exception e) {
            System.out.println(errorSign);
        }
    }

    private static String executeCalculation(Expression expression) {

        String result = errorSign;

        DoTheCalculation calculator = new DoTheCalculation();

        switch (expression.getOperator()) {
            case "+":
                result = String.valueOf(calculator.add(expression.getOperand1(), expression.getOperand2()));
                break;
            case "-":
                result = String.valueOf(calculator.subtract(expression.getOperand1(), expression.getOperand2()));
                break;
            case "/":
                if (expression.getOperand1() == 0 || expression.getOperand2() == 0) {
                    break;
                } else {
                    result = String.valueOf(calculator.divide(expression.getOperand1(), expression.getOperand2()));
                }
                break;
            case "*":
                result = String.valueOf(calculator.multiply(expression.getOperand1(), expression.getOperand2()));
                break;
            default:
                result = errorSign;
                break;
        }
        return result;
    }

    private static Expression convertUserInputIntoExpression(String[] parts) {
        return new Expression(Double.parseDouble(parts[0]), Double.parseDouble(parts[2]), parts[1]);
    }

    private static String readUserInput() {
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();

        return expression;
    }

    private static String[] splitUserInputAmongWhitespace(String userInput) {

        String[] expression = new String[5];


        if (userInput.contains(" ")) {
            expression = userInput.split(" ");
        } else {
            expression = userInput.split("");
        }

        return expression;
    }

    private static void checkingCorrectInput(String[] elements) throws Exception {
        // ha nem 2 operandus és 1 operátort ad meg a user
        if (elements.length != 3) {
            throw new Exception("Wrong input\nCorrect input looks something like this: 3 + 5");
        }
    }
}
