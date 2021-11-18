/* @author nghiacubu */


package com.GUI.component;

import com.GUI.swing.Button;


public class ModelButton {
    String ma;
    Button btn;

    public ModelButton(String ma, Button btn) {
        this.ma = ma;
        this.btn = btn;
    }
    
    
    
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
    
}
