package com.example.calcolatrice20;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {
    private int v1; //Numero 1
    private String operation = ""; //Operazione da eseguire
    private int inseriti=0;
    @FXML
    private TextField riqId;

    @FXML
    protected void onCasele1() {
        riqId.appendText("1");
    }
    @FXML
    protected void onCasele2() {
        riqId.appendText("2");
    }

    @FXML
    protected void onCasele3() {
        riqId.appendText("3");
    }

    @FXML
    protected void onCasele4() {
        riqId.appendText("4");
    }

    @FXML
    protected void onCasele5() {
        riqId.appendText("5");
    }

    @FXML
    protected void onCasele6() {
        riqId.appendText("6");
    }

    @FXML
    protected void onCasele7() {
        riqId.appendText("7");
    }

    @FXML
    protected void onCasele8() {
        riqId.appendText("8");
    }

    @FXML
    protected void onCasele9() {
        riqId.appendText("9");
    }

    @FXML
    protected void onCasele0() {
        riqId.appendText("0");
    }

    @FXML
    protected void onCasele00() {
        riqId.appendText("00");
    }
    @FXML
    protected void cAll() {
        riqId.setText("");
        v1 = 0;
        operation = "";
        inseriti=0;
    }
    @FXML
    protected void c() {
        String numCorrente = riqId.getText();
        if (!numCorrente.isEmpty()) {
            riqId.setText(numCorrente.substring(0, numCorrente.length() - 1));
        }
    }
    @FXML
    protected void onPiu() {
        if (inseriti==0)
            v1=Integer.parseInt(riqId.getText());
        else
            v1=v1+Integer.parseInt(riqId.getText());
        riqId.setText("");
        operation="+";
        inseriti++;
    }
    @FXML
    protected void onMeno() {
        if (inseriti==0)
            v1=Integer.parseInt(riqId.getText());
        else
            v1 =v1-Integer.parseInt(riqId.getText());
        riqId.setText("");
        operation = "-";
        inseriti++;
    }

    @FXML
    protected void onPer() {
        if (inseriti==0)
            v1=Integer.parseInt(riqId.getText());
        else
            v1 =v1*Integer.parseInt(riqId.getText());
        riqId.setText("");
        operation = "*";
        inseriti++;
    }

    @FXML
    protected void onDiviso() {
        if (inseriti==0)
            v1=Integer.parseInt(riqId.getText());
        else{
            if (v1==0 && Integer.parseInt(riqId.getText())==0) {
                riqId.setText("Indeterminato");
            }
            else if (Integer.parseInt(riqId.getText()) == 0) {
                riqId.setText("Impossibile");
            } else {
                v1 =v1/Integer.parseInt(riqId.getText());
            }
        }
        riqId.setText("");
        operation = "/";
        inseriti++;
    }
    @FXML
    protected void onUguale() {
        int v2 = Integer.parseInt(riqId.getText());
        int result;
        switch (operation) {
            case "+":
                result = v1 + v2;
                break;
            case "-":
                result = v1 - v2;
                break;
            case "*":
                result = v1 * v2;
                break;
            case "/":
                if (v1==0 && v2==0) {
                    riqId.setText("Indeterminato");
                    return;
                }
                if (v2 == 0) {
                    riqId.setText("Impossibile");
                    return;
                } else {
                    result = v1 / v2;
                }
                break;
            default:
                return;
        }
        riqId.setText(String.valueOf(result));
    }
}
