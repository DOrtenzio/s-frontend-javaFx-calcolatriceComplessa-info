package com.example.calcolatrice20;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField riqId;

    @FXML
    protected void onCasele1() {
        riqId.setText(riqId.getText()+1);
    }
    @FXML
    protected void onCasele2() {
        riqId.setText(riqId.getText()+2);
    }
    @FXML
    protected void onCasele3() {
        riqId.setText(riqId.getText()+3);
    }
    @FXML
    protected void onCasele4() {
        riqId.setText(riqId.getText()+4);
    }
    @FXML
    protected void onCasele5() {
        riqId.setText(riqId.getText()+5);
    }
    @FXML
    protected void onCasele6() {
        riqId.setText(riqId.getText()+6);
    }
    @FXML
    protected void onCasele7() {
        riqId.setText(riqId.getText()+7);
    }
    @FXML
    protected void onCasele8() {
        riqId.setText(riqId.getText()+8);
    }
    @FXML
    protected void onCasele9() {
        riqId.setText(riqId.getText()+9);
    }
    @FXML
    protected void onCasele0() {
        riqId.setText(riqId.getText()+0);
    }
    @FXML
    protected void onCasele00() {
        riqId.setText(riqId.getText()+"00");
    }
    @FXML
    protected void c() {
        String s="";
        for (int i=0;i<riqId.getText().length()-1;i++){
            s=s+riqId.getText().charAt(i);
        }
        riqId.setText(s);

    }
    @FXML
    protected void cAll() {
        riqId.setText("0");

    }
    @FXML
    protected void onPiu() {
        int v1=Integer.parseInt(riqId.getText());
        riqId.setText("0");
        int v2=Integer.parseInt(riqId.getText());
        riqId.setText(String.valueOf(v1+v2));

    }
    @FXML
    protected void onMeno() {
        int v1=Integer.parseInt(riqId.getText());
        riqId.setText("0");
        int v2=Integer.parseInt(riqId.getText());
        riqId.setText(String.valueOf(v1-v2));
    }
    @FXML
    protected void onPer() {
        int v1=Integer.parseInt(riqId.getText());
        riqId.setText("0");
        int v2=Integer.parseInt(riqId.getText());
        riqId.setText(String.valueOf(v1*v2));
    }
    @FXML
    protected void onDiviso() {
        int v1=Integer.parseInt(riqId.getText());
        riqId.setText("0");
        int v2=Integer.parseInt(riqId.getText());
        if (v1==0 && v2==0)
            riqId.setText("Indeterminato");
        else if (v2==0)
            riqId.setText("Impossibile");
        else
            riqId.setText(String.valueOf(v1/v2));

    }
}