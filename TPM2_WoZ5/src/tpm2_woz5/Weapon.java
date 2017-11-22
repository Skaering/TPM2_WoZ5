/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpm2_woz5;

/**
 *
 * @author skaering
 */
public class Weapon {
    private String nameWeapon;
    private int dammageWeapon; 

    public Weapon(String name, int dammage) {
        this.nameWeapon = name;
        this.dammageWeapon = dammage;
    }

    public String getName() {
        return nameWeapon;
    }

    public int getDammage() {
        return dammageWeapon;
    }

    public void setName(String name) {
        this.nameWeapon = name;
    }

    public void setDammage(int dammage) {
        this.dammageWeapon = dammage;
    }
    
}
