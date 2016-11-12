package DataStructures.Trees;

import java.util.Scanner;

/**
 * Created by vijay on 10/24/16.
 */
public class BinarySearchTree {
    static Node root;
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        root=new Node(null);
        System.out.println("Enter the number of values");
        int count=scan.nextInt();
        root.setData(scan.nextInt());
        for(int i=0;i<count-1;i++)
        {
            int value=scan.nextInt();
            fillTree(root,value);
        }
        printValues(root);
    }

    private static void fillTree(Node root,int value) {

        if(value>root.getData())
        {
            if(root.getRight_child()==null)
            {
                Node temp=new Node(root);
                root.setRight_child(temp);
                temp.setData(value);
            }
            else
            {
                fillTree(root.getRight_child(),value);
            }
        }
        else if(value<=root.getData())
        {
            if(root.getLeft_child()==null)
            {
                Node temp=new Node(root);
                root.setLeft_child(temp);
                temp.setData(value);
            }
            else
            {
                fillTree(root.getLeft_child(),value);
            }
        }

    }

    private static void printValues(Node root) {

        if (root == null)
        { return; }

        System.out.println("Presently in "+root.getData());
        printValues(root.getLeft_child());
        System.out.println(root.data);
        printValues(root.getRight_child());




    }
}
