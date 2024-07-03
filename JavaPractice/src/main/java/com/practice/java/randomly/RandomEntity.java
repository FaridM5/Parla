package com.practice.java.randomly;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RandomEntity {
    public String randomName;
    public String randomSurname;
    private int age;
    private int anyNumber;

    public void setAge(int age){
        if(age<0){
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age=age;
    }

    public String getInitials(String firstName, String lastName) {
        if (((firstName == null) && (lastName == null)) || ( firstName.isEmpty() && lastName.isEmpty())) {
            throw new IllegalArgumentException("Any argument is not provided correctly");
        }

        char firstInitial = firstName.charAt(0);
        char secondInitial = lastName.charAt(0);

//        System.out.printf("%s%s\n",firstInitial,secondInitial);
        String result = (String.valueOf(firstInitial) + secondInitial);
        return result;
    }
}
