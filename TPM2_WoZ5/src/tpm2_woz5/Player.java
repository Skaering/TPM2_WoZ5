/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpm2_woz5;

import java.util.ArrayList;


/**
 *
 * @author Nathan
 */
public class Player {
    private String pseudoPlayer;
    private ArrayList<Weapon> weaponPlayer;
    private int strengthPlayer;

    public Player(String pseudo, ArrayList<Weapon> weapon, int strength) {
        this.pseudoPlayer = pseudo;
        this.weaponPlayer = weapon;
        this.strengthPlayer = strength;
    }

    public String getPseudoPlayer() {
        return pseudoPlayer;
    }

    public ArrayList<Weapon> getWeaponPlayer() {
        return weaponPlayer;
    }

    public int getStrengthPlayer() {
        return strengthPlayer;
    }

    public void setPseudoPlayer(String pseudoPlayer) {
        this.pseudoPlayer = pseudoPlayer;
    }

    public void setWeaponPlayer(ArrayList<Weapon> weaponPlayer) {
        this.weaponPlayer = weaponPlayer;
    }

    public void setStrengthPlayer(int strengthPlayer) {
        this.strengthPlayer = strengthPlayer;
    }
    

}
