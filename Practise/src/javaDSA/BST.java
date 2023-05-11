package javaDSA;

class BST{
    static class node{
        int data;
        node left;
        node right;
        node( int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static node construct( node root , int val){
        if(root==null){
            root= new node(val);
            return root;
        }
        if(root.data>val)   root.left=construct(root.left,val);
        else                root.right=construct(root.right,val);
        return root;
    }
    public static void inorder( node root){
        if(root==null)  return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static node deleteNode( node root, int val){ //recursively deleting node
        if(val<root.data){
            root.left=deleteNode(root.left,val);//storing into root.left is like maintaing parent for the curr node
        }else if( root.data < val){
            root.right=deleteNode(root.right,val);
        }else{// value at node found
            // leaf node
            if(root.left==null && root.right==null){
                return null;// returning nulll to its parent hence node deleted.
            }
            //case 2 node with one child.
            if(root.left==null)         return root.right;
            else if(root.right== null)  return root.left;
            // case 3 node with 2 child
            node IP= inorderPredecessor( root.left);
            //root.data= IP.data; //Approach 1 Swap of data
            root.left=deleteNode(root.left, IP.data);
            //Approach 2 Insertion od Node IP
            IP.left=root.left;
            IP.right=root.right;
            return IP;
        }
        return root;
    }
    public static node inorderPredecessor(node root){
        while (root.right!=null){
            root=root.right;
        }
        return root;
    }

    public static void main(String[] args) {
        int nodes[]= {8,5,3,1,4,6,10,11,14};
        node root = null;
        for( int val: nodes){
            root=construct(root,val);
        }
        inorder(root);
        System.out.println();
        deleteNode(root,5);//swaping data of node
        inorder(root);
    }
}