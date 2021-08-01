package pl.roszczyna.teaching.flow_control;

import org.springframework.boot.SpringApplication;
import pl.roszczyna.teaching.TeachingApplication;

import java.util.List;

public class Demo {

    public static void main(String[] args) {
        /*
        The first thing you need is variable assignment. Java is statically typed, so assign using the type or
        the keyword var as of Java 11.
         */

        int aNumber = 5;
        var anotherNumber = 6;

        /*
        Use conditional statements when you need to split execution based on logical condition occurring or not.
        There are the following conditional statements:
        1. if - else
        2. switch
        3. Ternary operation
         */

        var conditionalNumber = 4;
        if(conditionalNumber == 7) {
            System.out.println("My number is seven");
        } else {
            System.out.println("My number is something else");
        }

        switch (conditionalNumber) {
            case 7:
                System.out.println("I am number seven");
                break;
            default:
                System.out.println("I am something else");
        }

        var assignedOnConditionNumber = conditionalNumber == 4 ? 5 : 6;
        System.out.println("The assigned conditional number is " + assignedOnConditionNumber);

        /*
        Use loops in order to iterate or repeat tasks. You can shun the while, do-while and standard for loop.
        Focus on for-each loop and forEach method.
         */
        // These are the less used cases
        var counter = 0;

        while(counter < 5) {
            System.out.println("Counter while is: " + counter);
            counter++;
        }

        counter = 5;
        do {
            System.out.println("Counter do-while is: " + counter);
            counter++;
        } while(counter < 5);

        for(int i = 0; i < 5; i ++) {
            System.out.println("Iteration number: " + i);
        }

        //These are the more frequent cases
        var students = List.of(
                "Arthur Pendragon",
                "Peter Parker",
                "Yuuji Itadori",
                "Izuku Midoriya"
        );

        for(String student : students) {
            System.out.println("Student is: " + student);
        }

        // or better yet
        students.forEach(student -> System.out.println(student));
        // or shorter yet
        students.forEach(System.out::println);
        // streams version - we will get to them
        students.stream().forEach(System.out::println);

    }

}
