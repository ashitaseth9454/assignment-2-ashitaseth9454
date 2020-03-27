/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;
import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;


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
        System.out.println("pre-order traversal");
        MyMain mm = new MyMain();
        mm.pre(mbst.getRoot());
        System.out.println();
        System.out.println("post order traversal");
        mm.post(mbst.getRoot());
        System.out.println("a is yes");
        System.out.println("b is no");
    }

    public void pre(TreeNode node) {
        if (node != null) {
            System.out.println(node.getData());
            pre(node.getLeft());
            pre(node.getRight());
        }
    }

    public void post(TreeNode node) {
        if (node != null) {
            post(node.getLeft());
            post(node.getRight());
        }



    }
}
