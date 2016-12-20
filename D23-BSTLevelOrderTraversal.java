import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{
static Queue<Node> q = new LinkedList<Node>();
static void levelOrder(Node root){
   if (root == null) return; /* because of the void funcrion */

   System.out.print(root.data + " ");

   if (root.left != null)
       q.add(root.left);

   if (root.right != null)
       q.add(root.right);

   if (q.isEmpty()) return; /*because of the void function*/

   root = q.poll(); /* return and remove the head of the list, return null if the List is Empty */

   levelOrder(root);
            
}
       public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}