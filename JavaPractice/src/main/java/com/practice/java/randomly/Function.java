package com.practice.java.randomly;

public class Function {
    public long myFunction(long number){
        if (number != 0) {
            return number + myFunction(number - 1);
        } else {
            return number;
        }
    }
}
