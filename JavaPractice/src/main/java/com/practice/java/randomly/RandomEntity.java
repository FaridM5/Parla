package com.practice.java.randomly;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RandomEntity {
    private String randomName;
    private String randomSurname;
    private int age;
    private int anyNumber;
}
