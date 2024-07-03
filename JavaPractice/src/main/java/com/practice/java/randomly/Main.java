package com.practice.java.randomly;

public class Main {
    public static void main(String[] args){
        RandomEntity randomEntity = new RandomEntity("Farid", "Mammadli", 5, 600);

        randomEntity.getInitials(randomEntity.getRandomName(),randomEntity.getRandomSurname());
    }
}
