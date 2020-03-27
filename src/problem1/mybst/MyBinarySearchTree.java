/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    TreeNode root;
    int m = 0, c = 0;

    public MyBinarySearchTree() {
        this.root = root;
    }

    public void insert(int data) {
        TreeNode newnode = new TreeNode(data);
        if (root == null) {
            root = newnode;
        } else {
            TreeNode temp = root;
            TreeNode parent = null;
            while (temp != null) {
                parent = temp;
                if (newnode.getData() >= temp.getData()) {
                    temp = temp.getRight();
                } else {
                    temp = temp.getLeft();
                }
                if (newnode.getData() <= parent.getData()) {
                    parent.setLeft(newnode);
                } else {
                    parent.setRight(newnode);
                }
            }
        }
    }

    public int getM() {
        return m;
    }

    public void display(TreeNode node, int level) {
        if (node.getLeft() == null) {
            c++;

        }
        if (m < level) {
            System.out.println(node.getData());
            m = level;
        }
        display(node.getLeft(), level + 1);
        display(node.getRight(), level + 1);
    }

    public void newDisplay() {
        System.out.println("empty left childs" + c);
    }

    public TreeNode getRoot() {
        return root;

    }
}
