/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.node.Node;
import problem5.student.Student;

//to implement circular queue
public class MyCircularQueue {
    Node front, rear;


    public MyCircularQueue() {
        front = rear = null;
    }

    public void insert(Student stu) {
        if (stu.getAppearingCounter() > 2) {
            System.out.println(stu.getName() + " cannot insert");
        } else {
            Node node = new Node(stu);
            if (front == null) {
                front = node;
            } else {
                rear.setNext(node);
                rear = node;
                rear.setNext(front);
            }

        }


    }

}
