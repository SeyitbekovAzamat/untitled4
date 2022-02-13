package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1500);
        boss.setDamage(75);

        Weapon weapon = new Weapon("blunt weapons", "hammer");
        boss.setWeapon(weapon);

        System.out.println(boss.info());

        Skeleton juniorSkeleton = new Skeleton();
        juniorSkeleton.setHealth(500);
        juniorSkeleton.setDamage(25);
        juniorSkeleton.setNumbersOfArrows(30);

        Weapon weaponSkeleton = new Weapon("Rifle", "Compound Bow");
        juniorSkeleton.setWeapon(weaponSkeleton);
        System.out.println(juniorSkeleton.info());

        Skeleton seniorSkeleton = new Skeleton();
        seniorSkeleton.setHealth(500);
        seniorSkeleton.setDamage(25);
        seniorSkeleton.setNumbersOfArrows(30);

        Weapon weaponseniorSkeleton = new Weapon("Rifle", "Compound Bow");
        seniorSkeleton.setWeapon(weaponSkeleton);
        System.out.println(seniorSkeleton.info());
    }
}
