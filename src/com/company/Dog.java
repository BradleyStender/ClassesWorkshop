package com.company;

import java.util.Scanner;

public class Dog extends Pet {

    private boolean likesWalks;
    private boolean canFetch;
    private String coatType;
    private Scanner input = new Scanner(System.in);
    //  protected int dogyears = age * 7;

    public Dog(String ownerName, String petName, String homeAddress, int age, char gender) {
        super(ownerName, petName, homeAddress, age, gender);
    }

    public Dog() {
        super();

        System.out.println("what is your dogs name?");
        String name = input.nextLine();
        System.out.println("How old is " + name +   "?");
        int age = input.nextInt();
        System.out.println(name + " is " + age + " in human years and " + age * 7 + " in dog years.");
    }


    public boolean isLikesWalks() {
        return likesWalks;
    }

    public void setLikesWalks(boolean likesWalks) {
        this.likesWalks = likesWalks;
    }

    public boolean isCanFetch() {
        return canFetch;
    }

    public void setCanFetch(boolean canFetch) {
        this.canFetch = canFetch;
    }

    public String getCoatType() {
        return coatType;
    }

    public void setCoatType(String coatType) {
        this.coatType = coatType;
    }

//    @Override
//    protected String makeSound() {
//        return super.makeSound() + "BUT dogs bark";
//    }





}
