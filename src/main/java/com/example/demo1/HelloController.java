package com.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.text.DecimalFormat;
import java.util.Objects;

public class HelloController {

    //Defining the variables
    @FXML
    private Label display;

    String flag; //Stores the operator: +, -, *, /

    String num1; //Stores the 1st operand

    String num2; //Stores the 2nd operand

    String numIterative = "";

    Boolean afterTheOperator; //This flag lets the Onclick functions of the number buttons know that
                                //an operator button has been pressed, and they need to replace the displayed number
                                //entirely instead of appending digits to it.

    Boolean equals;         //This flag lets the Onclick functions of the number buttons know that the "=" button
                            //has been pressed, and they need to replace the displayed number
                            //entirely instead of appending digits to it.

    //onClick methods
    @FXML
    protected void onButton1Click() {

        if (Double.parseDouble(display.getText()) == 0 || afterTheOperator || equals) { //If either "0" is being
                                    //displayed or an operator button's been pressed or the "=" button's been pressed
            display.setText("1"); //Resets the displayed number to the button's digit
            afterTheOperator = false; //Sets the operator flag to "false" after the 1st press to allow for
                                         // appending digits
            equals = false; //Sets the "=" flag to "false" after the 1st press to allow for appending digits
        }
        else {
            String num = display.getText(); //Gets the number that's already on the display
            num = num + "1"; //Appends its value to it
            display.setText(num); //Displays the resulting number
        }
    }

    @FXML
    protected void onButton2Click() {
        if (Double.parseDouble(display.getText()) == 0 || afterTheOperator || equals) {
            display.setText("2");
            afterTheOperator = false;
            equals = false;
        }
        else {
            String num = display.getText();
            num = num + "2";
            display.setText(num);
        }
    }

    @FXML
    protected void onButton3Click() {
        if (Double.parseDouble(display.getText()) == 0 || afterTheOperator || equals) {
            display.setText("3");
            afterTheOperator = false;
            equals = false;
        }
        else {
            String num = display.getText();
            num = num + "3";
            display.setText(num);
        }
    }

    @FXML
    protected void onButton4Click() {
        if (Double.parseDouble(display.getText()) == 0 || afterTheOperator || equals) {
            display.setText("4");
            afterTheOperator = false;
            equals = false;
        }
        else {
            String num = display.getText();
            num = num + "4";
            display.setText(num);
        }
    }

    @FXML
    protected void onButton5Click() {
        if (Double.parseDouble(display.getText()) == 0 || afterTheOperator || equals) {
            display.setText("5");
            afterTheOperator = false;
            equals = false;
        }
        else {
            String num = display.getText();
            num = num + "5";
            display.setText(num);
        }
    }

    @FXML
    protected void onButton6Click() {
        if (Double.parseDouble(display.getText()) == 0 || afterTheOperator || equals) {
            display.setText("6");
            afterTheOperator = false;
            equals = false;
        }
        else {
            String num = display.getText();
            num = num + "6";
            display.setText(num);
        }
    }

    @FXML
    protected void onButton7Click() {
        if (Double.parseDouble(display.getText()) == 0 || afterTheOperator || equals) {
            display.setText("7");
            afterTheOperator = false;
            equals = false;
        }
        else {
            String num = display.getText();
            num = num + "7";
            display.setText(num);
        }
    }

    @FXML
    protected void onButton8Click() {
        if (Double.parseDouble(display.getText()) == 0 || afterTheOperator || equals) {
            display.setText("8");
            afterTheOperator = false;
            equals = false;
        }
        else {
            String num = display.getText();
            num = num + "8";
            display.setText(num);
        }
    }

    @FXML
    protected void onButton9Click() {
        if (Double.parseDouble(display.getText()) == 0 || afterTheOperator || equals) {
            display.setText("9");
            afterTheOperator = false;
            equals = false;
        }
        else {
            String num = display.getText();
            num = num + "9";
            display.setText(num);
        }
    }

    @FXML
    protected void onButton0Click() {
        if (Double.parseDouble(display.getText()) == 0 || afterTheOperator || equals) {
            display.setText("0");
            afterTheOperator = false;
            equals = false;
        }
        else {
            String num = display.getText();
            num = num + "0";
            display.setText(num);
        }
    }

    @FXML
    protected void onButtonCClick() {   //Clears the display and resets all flags
        display.setText("0");
        flag = "";
        afterTheOperator = false;
        equals = false;
        numIterative = "";
    }

    public void onButtonAddClick(){
        num1 = display.getText();       //Stores the current displayed number in the global variable num1
        flag = "+";                     //Sets the operator flag to the corresponding operator sign
        afterTheOperator = true;        //This lets the digit buttons know that they have to overwrite the number
                                        //displayed
        numIterative = "";
    }

    public void onButtonSubtractClick(){
//        onButtonEqualsClick();
        num1 = display.getText();
        flag = "-";
        afterTheOperator = true;
        numIterative = "";

    }

    public void onButtonMultiplyClick(){
        num1 = display.getText();
        flag = "*";
        afterTheOperator = true;
        numIterative = "";
    }

    public void onButtonDivideClick(){
        num1 = display.getText();
        flag = "/";
        afterTheOperator = true;
        numIterative = "";
    }

    public void onButtonEqualsClick() {         //The "=" button
//        if (Objects.equals(flag, "+")) {     //Checks what the operator flag is set to (+)
//            num2 = display.getText();    //Stores the currently displayed number into the local variable num2
//            double result = Double.parseDouble(num1) + Double.parseDouble(num2);    //Converts the stored Strings
//                                                //to double and calculates the result
//            String stringRes = Double.toString(result);     //Converts the result back to String
//            DecimalFormat format = new DecimalFormat("0.###########");      //Defines and Stores the desired
//                                                                                   //number format
//            display.setText(format.format(Double.valueOf(stringRes)));      //Converts the String back to double,
//                                                                    //formats and converts it yet again back to String
//                                                                    //then outputs said String to the display
//                                                                    //overwriting any existing number there
////            flag = "";      //Resets the operator flag
//            equals = true;  //Sets the equals flag to true, this lets the digit buttons know to overwrite the number
//                            //displayed on the first press
//        }

        if (Objects.equals(flag, "+")) {
            if (!Objects.equals(numIterative, "")){
                num1 = display.getText();
                double result = Double.parseDouble(num1) + Double.parseDouble(numIterative);
                String stringRes = Double.toString(result);
                DecimalFormat format = new DecimalFormat("0.###########");
                display.setText(format.format(Double.valueOf(stringRes)));
//            flag = "";
                equals = true;

            }
            if (Objects.equals(numIterative, "")) {
                num2 = display.getText();
                double result = Double.parseDouble(num1) + Double.parseDouble(num2);
                String stringRes = Double.toString(result);
                DecimalFormat format = new DecimalFormat("0.###########");
                display.setText(format.format(Double.valueOf(stringRes)));
//            flag = "";
                equals = true;
                numIterative = num2;
                num2 = "";
            }
        }


        if (Objects.equals(flag, "-")) {
            if (!Objects.equals(numIterative, "")){
                num1 = display.getText();
                double result = Double.parseDouble(num1) - Double.parseDouble(numIterative);
                String stringRes = Double.toString(result);
                DecimalFormat format = new DecimalFormat("0.###########");
                display.setText(format.format(Double.valueOf(stringRes)));
//            flag = "";
                equals = true;

            }
            if (Objects.equals(numIterative, "")) {
                num2 = display.getText();
                double result = Double.parseDouble(num1) - Double.parseDouble(num2);
                String stringRes = Double.toString(result);
                DecimalFormat format = new DecimalFormat("0.###########");
                display.setText(format.format(Double.valueOf(stringRes)));
//            flag = "";
                equals = true;
                numIterative = num2;
                num2 = "";
            }
        }

        if (Objects.equals(flag, "*")) {

            if (!Objects.equals(numIterative, "")){
                num1 = display.getText();
                double result = Double.parseDouble(num1) * Double.parseDouble(numIterative);
                String stringRes = Double.toString(result);
                DecimalFormat format = new DecimalFormat("0.###########");
                display.setText(format.format(Double.valueOf(stringRes)));
//            flag = "";
                equals = true;

            }
            if (Objects.equals(numIterative, "")) {
                num2 = display.getText();
                double result = Double.parseDouble(num1) * Double.parseDouble(num2);
                String stringRes = Double.toString(result);
                DecimalFormat format = new DecimalFormat("0.###########");
                display.setText(format.format(Double.valueOf(stringRes)));
//            flag = "";
                equals = true;
                numIterative = num2;
                num2 = "";
            }

        }

        if (Objects.equals(flag, "/")) {
            if (!Objects.equals(numIterative, "")){
                num1 = display.getText();
                double result = Double.parseDouble(num1) / Double.parseDouble(numIterative);
                String stringRes = Double.toString(result);
                DecimalFormat format = new DecimalFormat("0.###########");
                display.setText(format.format(Double.valueOf(stringRes)));
//            flag = "";
                equals = true;

            }
            if (Objects.equals(numIterative, "")) {
                num2 = display.getText();
                double result = Double.parseDouble(num1) / Double.parseDouble(num2);
                String stringRes = Double.toString(result);
                DecimalFormat format = new DecimalFormat("0.###########");
                display.setText(format.format(Double.valueOf(stringRes)));
//            flag = "";
                equals = true;
                numIterative = num2;
                num2 = "";
            }
        }
    }

    public void onButtonRepeatSwitchClick(){

    }

    public void onButtonNegativeClick(){
        double displayed = Double.parseDouble(display.getText());

        if (displayed < 0) {

            double displayedPos = Math.abs(displayed);
            DecimalFormat format = new DecimalFormat("0.###########");
            display.setText(format.format(Double.valueOf(displayedPos)));
        }

        if (displayed > 0) {

            double displayedNeg = -displayed;
            DecimalFormat format = new DecimalFormat("0.###########");
            display.setText(format.format(Double.valueOf(displayedNeg)));
        }

    }

    public void onButtonPointClick(){

    }

    public void onButtonBackspaceClick(){

    }
}