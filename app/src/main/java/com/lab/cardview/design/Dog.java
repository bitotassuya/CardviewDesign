package com.lab.cardview.design;
/*
  @author Mr.Jirapong Jareansong
  @version 2018.02.17
 */

import java.util.ArrayList;
import java.util.List;


public class Dog {
    private int resId;
    private String breed;
    private String description;

    List<Dog> dogs = new ArrayList<>();

    Dog() {

    }

    Dog(int resId, String breed, String description) {
        this.resId = resId;
        this.breed = breed;
        this.description = description;
    }
    Dog(int resId, String breed) {
        this.resId = resId;
        this.breed = breed;

    }


    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(List<Dog> dogs) {
        this.dogs = dogs;
    }
}
