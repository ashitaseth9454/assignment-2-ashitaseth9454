/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;

public class MyPriorityQueue {
    Node front;

    public MyPriorityQueue() {
        this.front = null;
    }

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public void push(String name, int rollNo) {
        Node node = new Node(name, rollNo);
        Node temp = front;
        Node prev = null;
        if (front == null) {
            front = node;
        } else {
            if (front.getRollNo() > rollNo) {
                node.setNext(front);
                front = node;
            } else {
                while (temp.getNext() != null && temp.getRollNo() < rollNo) {
                    temp = temp.getNext();
                }
                node.setNext(temp.getNext());
                temp.setNext(node);
            }
        }
    }


    public void display() {
        Node node = front;
        while (node != null) {
            System.out.println("name=" + node.getName() + "roll number=" + node.getRollNo());
            node = node.getNext();
        }
    }
}