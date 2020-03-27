/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree mbst = new MyBinarySearchTree();
        mbst.insert(85);
        mbst.insert(35);
        mbst.insert(40);
        mbst.insert(16);
        mbst.insert(21);
        mbst.insert(10);
        System.out.println("root" + mbst.getRoot().getData());
        System.out.println("preorder traversal");





    }
}
