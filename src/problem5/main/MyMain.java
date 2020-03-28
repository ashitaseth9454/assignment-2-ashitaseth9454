/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

//executable class
public class MyMain {
    public static void main(String[] args) {
        MyCircularQueue mcq = new MyCircularQueue();
        Student stu1 = new Student("ashi", 0, 1);
        Student stu2 = new Student("anamika", 2, 4);
        Student stu3 = new Student("anshika", 2, 1);
        Student stu4 = new Student("nihaarika", 0, 1);
        mcq.insert(stu1);
        mcq.insert(stu2);
        mcq.insert(stu3);
        mcq.insert(stu4);
        Student remove = mcq.remove();
        if (remove != null) {
            System.out.println("removed student-" + remove.getName());
        }
        remove = mcq.remove();

        if (remove != null) {
            System.out.println("removed student-" + remove.getName());
        }
        remove = mcq.remove();

        if (remove != null) {
            System.out.println("removed student-" + remove.getName());
        }
        remove = mcq.remove();

        if (remove != null) {
            System.out.println("removed student-" + remove.getName());
        }
        mcq.display();



    }
}
