/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import problem4.linkedlist.LinkedList;

public class MyQueue {
    LinkedList ll = new LinkedList();

    public int peek(int data) {
        if (ll.search(data) == null) {
            return -1;
        }
        return ll.search(data).getData();
    }

    public void addqueue(int data) {
        ll.addLast(data);

    }


}
