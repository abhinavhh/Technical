package StudyPlan.Tree;

import java.util.Scanner;

class Node{
    int key;
    Node right;
    Node left;

    public Node(int key){
        this.key = key;
        right = null;
        left = null;
    }
}

class BinaryTree{
    Node root;

    public BinaryTree(){
        root = null;
    }

    public void insert(int key){

        root = insertRec(root, key);
    }
    
    public Node insertRec(Node root, int key){
        if(root == null){
            root = new Node(key);
            return root;
        }
        if(key < root.key){
            root.left = insertRec(root.left, key);
        }
        else if(key > root.key){
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    public void inorderTraverse(){
        inorderTraverseRec(root);
    }

    public void inorderTraverseRec(Node root){
        if(root != null){
            inorderTraverseRec(root.left);
            System.out.print(root.key + " ");
            inorderTraverseRec(root.right);
        }
    }
}

public class Main{
    public static void main(String args[]){
        
        BinaryTree tree = new BinaryTree();
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the number of nodes: ");
            int n = s.nextInt();

            for(int i = 0 ; i < n ; i++){
                int j = s.nextInt();
                tree.insert(j);
            }
        }
        tree.inorderTraverse();
    }
}