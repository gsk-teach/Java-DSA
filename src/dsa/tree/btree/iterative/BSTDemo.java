package dsa.tree.btree.iterative;

class BSTNode{
    int value;
    BSTNode left;
    BSTNode right;

    BSTNode(int val){
        this.value = val;
        this.left = null;
        this.right = null;

    }
}

class BinarySearchTree{
    BSTNode root = null;

    public void traverseInOrder(){

    }


    public void insert(int val){
        BSTNode newNode = new BSTNode(val);

        // if tree is empty
        if(this.root == null)
            this.root = newNode;

        // if tree is not empty
        BSTNode currentNode = this.root;
        BSTNode parent = this.root;

        while(currentNode != null){
            parent = currentNode;
            currentNode = val < currentNode.value ? currentNode.left : currentNode.right;
        }

        if(val < parent.value){
            parent.left = newNode;
        }else if(val > parent.value){
            parent.right = newNode;
        }
        // we do not handle else as we do not insert a number which is already exists in tree

    }

}


public class BSTDemo {
    public static void main(String[] args) {

        // to demo recursive approach
        BinarySearchTree tree1 = new BinarySearchTree();
        tree1.traverseInOrder();
        System.out.println();
        tree1.insert(6);
        tree1.insert(4);
        tree1.insert(8);
        tree1.insert(3);
        tree1.insert(5);
        tree1.insert(7);
        tree1.insert(9);

        // 6
        // 4 8
        // 3,5  7,9
        //

        tree1.traverseInOrder();
        System.out.println();


    }
}
