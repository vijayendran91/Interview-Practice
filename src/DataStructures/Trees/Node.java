package DataStructures.Trees;

/**
 * Created by vijay on 10/24/16.
 */
public class Node {

    int data=0;
    Node parent;
    Node left_child=null;
    Node right_child=null;

    Node(int data, Node left, Node right)
    {
        this.data=data;
        this.left_child=left;
        this.right_child=right;
    }

    public Node(Node parent) {
        this.parent=parent;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft_child() {
        return left_child;
    }

    public void setLeft_child(Node left_child) {
        this.left_child = left_child;
    }

    public Node getRight_child() {
        return right_child;
    }

    public void setRight_child(Node right_child) {
        this.right_child = right_child;
    }



}
