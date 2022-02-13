package com.company;

public class Weapon {
    private String typeOfWeapon;
    private String weapons;

    public Weapon(String typeOfWeapon, String weapons) {
        this.typeOfWeapon = typeOfWeapon;
        this.weapons = weapons;
    }

    public String getTypeOfWeapon() {
        return typeOfWeapon;
    }

    public void setTypeOfWeapon(String typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
    }

    public String getWeapons() {
        return weapons;
    }

    public void setWeapons(String weapons) {
        this.weapons = weapons;
    }
}