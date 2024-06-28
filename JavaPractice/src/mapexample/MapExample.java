package mapexample;

import java.util.*;

class Student{
    String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Performance{
    int performance;

    public Performance(int performance) {
        this.performance = performance;
    }

    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }

}


public class MapExample {
    public static void main(String[] args){
        Student student1 = new Student("Farid");
        Performance performance1 = new Performance(100);
        Map<Student, Performance> record1 = new HashMap<>();
        record1.put(student1,performance1);

        for (Map.Entry<Student, Performance> entry : record1.entrySet()) {
            System.out.println("Student: " + entry.getKey().getName() + ", Performance: " + entry.getValue().getPerformance());
        }

        ArrayList<Map<Student,Performance>> studentlist = new ArrayList<>();
        studentlist.add(record1);





    }
}
