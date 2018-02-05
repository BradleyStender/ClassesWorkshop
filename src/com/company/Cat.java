package com.company;

import java.util.Scanner;


public class Cat extends Pet {

    private boolean likesCatnip;
    private boolean usesLitterbox;
    private String furType;
    Scanner input = new Scanner(System.in);
    String catAge;
    int catYears;

    public Cat(String ownerName, String petName, String homeAddress, int age, char gender, boolean likesCatnip, boolean usesLitterbox, String furType) {

        super(ownerName, petName, homeAddress, age, gender);

        this.likesCatnip = likesCatnip;
        this.usesLitterbox = usesLitterbox;
        this.furType = furType;
    }

    public Cat() {

        System.out.println("What is your cats name?");
        String name = input.nextLine();
        System.out.println("        ");
        System.out.println("How old is " + name + "?");
        int age = input.nextInt();
        catYears = (age - 2) * 4 + 24;

        switch (age) {

            case 1:
                catAge = name + " is 1 in human years and 19 in cat years.";
                break;
            case 2:
                catAge = name + " is 2 in human years and 24 in cat years.";
                break;
            case 3:
                catAge = name + " is 3 in human years and " + catYears + " in cat years.";
                break;
            case 4:
                catAge = name + " is 4 in human years and " + catYears + " in cat years.";
                break;
            case 5:
                catAge = name + " is 5 in human years and " + catYears + " in cat years.";
                break;
            case 6:
                catAge = name + " is 6 in human years and " + catYears + " in cat years.";
                break;
            case 7:
                catAge = name + " is 7 in human years and " + catYears + " in cat years.";
                break;
            case 8:
                catAge = name + " is 8 in human years and " + catYears + " in cat years.";
                break;
            case 9:
                catAge = name + " is 9 in human years and " + catYears + " in cat years.";
                break;
            case 10:
                catAge = name + " is 10 in human years and " + catYears + " in cat years.";
                break;
            case 11:
                catAge = name + " is 11 in human years and " + catYears + " in cat years.";
                break;
            case 12:
                catAge = name + " is 12 in human years and " + catYears + " in cat years.";
                break;
            case 13:
                catAge = name + " is 13 in human years and " + catYears + " in cat years.";
                break;
            case 14:
                catAge = name + " is 14 in human years and " + catYears + " in cat years.";
                break;


        }
        System.out.println(catAge);


    }


    public boolean isLikesCatnip() {
        return likesCatnip;
    }

    public void setLikesCatnip(boolean likesCatnip) {
        this.likesCatnip = likesCatnip;
    }

    public boolean isUsesLitterbox() {
        return usesLitterbox;
    }

    public void setUsesLitterbox(boolean usesLitterbox) {
        this.usesLitterbox = usesLitterbox;
    }

    public String getFurType() {
        return furType;
    }

    public void setFurType(String furType) {
        this.furType = furType;
    }

//    @Override
//    protected String makeSound() {
//        return "MEOWWWWWW!!!!!!!!";
//    }
}
//Cat Age
//  human |   Cat
//    0   =   0
//    1   =   19
//    2   =   24
//    3+  =   (human age - 2) * 4 + 24