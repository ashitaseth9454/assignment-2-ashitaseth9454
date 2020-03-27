/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue mpq = new MyPriorityQueue();
        mpq.push("ashi", 1);
        mpq.push("anshika", 2);
        mpq.push("anamika", 3);
        mpq.display();
    }
}
