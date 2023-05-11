package javaDSA;

import java.util.LinkedList;
import java.util.Queue;

public class Trees {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static int idx=-1;
    public static Node buildTree( int nodes []){
        idx++;
        if(nodes[idx]==-1){
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left=buildTree(nodes);
        newNode.right=buildTree(nodes);

        return newNode;
    }
    public static void prorder(Node root){
        if(root==null){
            System.out.print(-1+" ");
            return;
        }
        System.out.print(root.data+" ");
        prorder(root.left);
        prorder(root.right);
    }
    public static void inorder(Node root){
        if(root==null){
            System.out.print(-1+" ");
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null){
            System.out.print(-1+" ");
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelorder(Node root){
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node temp=q.poll();
            if(temp==null){
                System.out.println();
                if(q.isEmpty()) break;
                else{
                    q.add(null);
                    continue;
                }
            }
            System.out.print(temp.data+" ");
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
        }
    }
    public static int countNodes(Node root){
        if(root==null)  return 0;
        int lt=countNodes(root.left);
        int rt=countNodes(root.right);
        return lt+rt+1;
    }
    public static int sumNodes(Node root){
        if(root==null)  return 0;
        return sumNodes(root.left) + sumNodes(root.right) + root.data;
    }
    public static int heightOfTree(Node root){
        if(root==null)  return 0;
        return Math.max(heightOfTree(root.left),heightOfTree(root.right))+1;
    }

    public static int diameterOfTree(Node root){ //O(n^2)
        if(root==null) return 0;
        int leftdia=diameterOfTree(root.left);
        int rightdia=diameterOfTree(root.right);
        int height=heightOfTree(root.left)+heightOfTree(root.right)+1;
        return Math.max(Math.max(leftdia,rightdia),height);
    }
    static class TreeDia{
        int height;
        int dia;
        TreeDia(int height, int dia){
            this.height=height;
            this.dia=dia;
        }
    }
    public static TreeDia Diameter(Node root){
        if(root==null){
            return new TreeDia(0,0);
        }
        TreeDia left=Diameter(root.left);
        TreeDia right=Diameter(root.right);
        int nodeHeight=Math.max(left.height,right.height)+1;
        int myHeight=left.height+right.height+1;
        int nodeDiameter=Math.max(Math.max(left.dia,right.dia),myHeight);
        return new TreeDia(nodeHeight,nodeDiameter);
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=buildTree(nodes);
        System.out.println(Diameter(root).dia);
    }
}
