/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree mbst = new MyBinarySearchTree();
        mbst.insert(85);
        mbst.insert(35);
        mbst.insert(40);
        mbst.insert(16);
        mbst.insert(21);
        mbst.insert(10);
        mbst.insert(21);
        mbst.insert(2);
        mbst.display(mbst.getRoot(), mbst.getM());
        mbst.newDisplay();

    }
}
