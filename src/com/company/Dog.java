package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dog extends Pet {

    private boolean likesWalks;
    private boolean canFetch;
    private String coatType;
    private Scanner input = new Scanner(System.in);
    private Scanner coat = new Scanner(System.in);

    public Dog() {

//        do {
//            try {
                System.out.println("What is your dog's name?");
                setPetName(input.nextLine());
                System.out.println("Does " + getPetName() + " like to take walks? True or False");
                setLikesWalks(input.nextBoolean());
//                System.out.println("Can" + " " + getPetName() + " " + "fetch? True or False.");
//                setCanFetch(input.nextBoolean());
//                System.out.println("what type of coat does " + " " + getPetName() + " " + " have?");
//                setCoatType(coat.nextLine());
//                System.out.println("how old is " + "" + getPetName() + "?");
//                setAge(input.nextInt());
//
//            } catch (InputMismatchException ime) {
//                System.out.println("This is not a true or false statement. please. try again!");
//            }
//        } while (setLikesWalks(true || false) && setCanFetch(true || false));
//
//
    }

    public boolean isLikesWalks() {
        return likesWalks;
    }

    public boolean setLikesWalks(boolean likesWalks) {
        this.likesWalks = likesWalks;
        return likesWalks;
    }

    public boolean isCanFetch() {

        return canFetch;
    }

    public boolean setCanFetch(boolean canFetch) {
        this.canFetch = canFetch;
        return canFetch;
    }

    public String getCoatType() {
        return coatType;
    }

    public void setCoatType(String coatType) {
        this.coatType = coatType;
    }

    @Override
    protected String  makeSound() {
        return super.makeSound();
    }





}
