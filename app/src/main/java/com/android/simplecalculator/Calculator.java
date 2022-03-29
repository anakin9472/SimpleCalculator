package com.android.simplecalculator;

import org.mariuszgromada.math.mxparser.Expression;

public class Calculator {
    private static Calculator calculator;

    private Calculator() {

    }

    public enum Operator {
        ADD, SUB, MUL, DIV, LOGARIT, EXP, FACTORIAL
    }

    public static Calculator getInstance() {
        if (calculator == null) {
            calculator = new Calculator();
        }
        return calculator;
    }

    public String doCalculate(String num1, String num2, Operator operator) {
        String op = "";
        switch (operator) {
            case ADD: {
                op = "+";
                break;
            }
            case SUB: {
                op = "-";
                break;
            }
            case MUL: {
                op = "*";
                break;
            }
            case DIV: {
                op = "/";
                break;
            }
            case LOGARIT: {
                op = String.format("log(%s, %s)", num1, num2);
                num1 = "";
                num2 = "";
                break;
            }
            case EXP: {
                op = "^";
                break;
            }
            case FACTORIAL: {
                op = "!";
                num2 = "";
                break;
            }
        }
        String input = num1 + op + num2;
        Expression expression = new Expression(input);
        String result = String.valueOf(expression.calculate());
        return result;
    }
}
