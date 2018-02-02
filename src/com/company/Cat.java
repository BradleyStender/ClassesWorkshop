package com.company;
import java.util.Scanner;

public class Cat extends Pet {

private String coatType;
private boolean likesBaths;
private  String color;
private boolean ownsCat;


Scanner input = new Scanner(System.in);

    public Cat(String ownerName, String petName, String homeAddress, int age, char gender) {
        super(ownerName, petName, homeAddress, age, gender);
    }

    public Cat() {

//        System.out.println("Do you own a cat? True or false.");
//        setOwnsCat(input.nextBoolean());





    }

    public String getCoatType() {
        return coatType;
    }

    public void setCoatType(String coatType) {
        this.coatType = coatType;
    }

    public boolean isLikesBaths() {
        return likesBaths;
    }

    public void setLikesBaths(boolean likesBaths) {
        this.likesBaths = likesBaths;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOwnsCat() {
        return ownsCat;
    }

    public void setOwnsCat(boolean ownsCat) {
        this.ownsCat = ownsCat;
    }


    protected String makeSound() {
        return "MeOw";
    }



}
