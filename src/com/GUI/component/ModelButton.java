/* @author nghiacubu */


package com.GUI.component;

import com.GUI.swing.Button;


public class ModelButton {
    int ma;
    Button btn;

    public ModelButton(int ma, Button btn) {
        this.ma = ma;
        this.btn = btn;
    }
    
    
    
    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
    
}
