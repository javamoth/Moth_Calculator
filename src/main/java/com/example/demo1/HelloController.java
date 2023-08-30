package com.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label display;
    @FXML
    private Button button0, button1, button2, button3, button4, button5,
            button6, button7, button8, button9, buttonAdd, buttonSubtract,
            buttonDivide, buttonMultiply, buttonEquals, buttonC;

    @FXML
    protected void onHelloButtonClick() {
        display.setText("Welcome to JavaFX Application!");
        button0.setText("!!!");
    }

    @FXML
    protected double onAddButtonClick(double number) {
        return number;
    }

    @FXML
    protected void onButton1Click() {
        if (Double.parseDouble(display.getText()) == 0) {
            display.setText("1");
        }
        else {
            String num = display.getText();
            num = num + "1";
            display.setText(num);
        }
    }

    @FXML
    protected void onButton2Click() {
        if (Double.parseDouble(display.getText()) == 0) {
            display.setText("2");
        }
        else {
            String num = display.getText();
            num = num + "2";
            display.setText(num);
        }
    }

    @FXML
    protected void onButton3Click() {
        if (Double.parseDouble(display.getText()) == 0) {
            display.setText("3");
        }
        else {
            String num = display.getText();
            num = num + "3";
            display.setText(num);
        }
    }

    @FXML
    protected void onButton4Click() {
        if (Double.parseDouble(display.getText()) == 0) {
            display.setText("4");
        }
        else {
            String num = display.getText();
            num = num + "4";
            display.setText(num);
        }
    }

    @FXML
    protected void onButton5Click() {
        if (Double.parseDouble(display.getText()) == 0) {
            display.setText("5");
        }
        else {
            String num = display.getText();
            num = num + "5";
            display.setText(num);
        }
    }

    @FXML
    protected void onButton6Click() {
        if (Double.parseDouble(display.getText()) == 0) {
            display.setText("6");
        }
        else {
            String num = display.getText();
            num = num + "6";
            display.setText(num);
        }
    }

    @FXML
    protected void onButton7Click() {
        if (Double.parseDouble(display.getText()) == 0) {
            display.setText("7");
        }
        else {
            String num = display.getText();
            num = num + "7";
            display.setText(num);
        }
    }

    @FXML
    protected void onButton8Click() {
        if (Double.parseDouble(display.getText()) == 0) {
            display.setText("8");
        }
        else {
            String num = display.getText();
            num = num + "8";
            display.setText(num);
        }
    }

    @FXML
    protected void onButton9Click() {
        if (Double.parseDouble(display.getText()) == 0) {
            display.setText("9");
        }
        else {
            String num = display.getText();
            num = num + "9";
            display.setText(num);
        }
    }

    @FXML
    protected void onButton0Click() {
        if (Double.parseDouble(display.getText()) == 0) {
            display.setText("0");
        }
        else {
            String num = display.getText();
            num = num + "0";
            display.setText(num);
        }
    }


    @FXML
    protected void onButtonCClick() {
        display.setText("0");
    }
}