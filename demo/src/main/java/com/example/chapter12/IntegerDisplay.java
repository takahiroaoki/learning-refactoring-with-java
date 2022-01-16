package com.example.chapter12;

import java.util.Scanner;

public class IntegerDisplay {

    private Model _model;
    private Scanner _scanner;

    private IntegerDisplay(boolean prodFlg) {
        _model = new Model(0);
        _scanner = new Scanner(System.in);

        // Only in a product environment.
        while (prodFlg) {
            System.out.println("Current Value: " + _model.getValue());
            System.out.println("Input next command, '+' to add, '-' to subtract, 'q' to quit");
            
            
            String command = _scanner.nextLine();
            if (command.equals("+")) {
                _model.addValue();
            } else if (command.equals("-")) {
                _model.subtractValue();
            } else if (command.equals("q")) {
                System.out.println("O.K. See you again.");
                break;
            } else {
                System.out.println("Error: Only '+', '-' or 'q' are allowed.");
            }
        }        
        _scanner.close();
    }

    public static IntegerDisplay createProdIntegerDisplay() {
        return new IntegerDisplay(true);
    }

    public static IntegerDisplay createTestIntegerDisplay() {
        return new IntegerDisplay(false);
    }

    public int getValue() {
        return _model.getValue();
    }

    public void setValue(int value) {
        _model.setValue(value);
    }
}
