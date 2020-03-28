package problem4.binarySearchTree;

import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;

public class MyBinarySearchTree {
    private MyQueue mq;
    private TreeNode root;

    public MyBinarySearchTree(MyQueue queue) {
        this.mq = queue;
    }

    public void insert(int data) {
        TreeNode node = new TreeNode(data);


    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
}
