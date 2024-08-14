package dsa.tree.btree.recursive;

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

    public void rTraverseBSTInOrder(){
        // using recursive approach
        this.rTraverseInOder(this.root);
    }

    private void rTraverseInOder(BSTNode current){
        if(current != null){
            rTraverseInOder(current.left);
            System.out.print(current.value + " ");
            rTraverseInOder(current.right);
        }
    }

    public void rTraverseBSTPreOrder(){
        // using recursive approach
        this.rTraversePreOder(this.root);
    }
    private void rTraversePreOder(BSTNode current){
        if(current != null){
            System.out.print(current.value + " ");
            rTraversePreOder(current.left);
            rTraversePreOder(current.right);
        }
    }

    public void rTraverseBSTPostOrder(){
        // using recursive approach
        this.rTraversePostOder(this.root);
    }
    private void rTraversePostOder(BSTNode current){
        if(current != null){
            rTraversePostOder(current.left);
            rTraversePostOder(current.right);
            System.out.print(current.value + " ");

        }
    }

    public void rInsert(int val){
        // using recursive approach
        this.root = rInsert(this.root, val);
    }

    private BSTNode rInsert(BSTNode currentNode, int val){
        BSTNode newNode = new BSTNode(val);

        // if tree is empty
        if(currentNode == null){
            return newNode;
        }

        if(val < currentNode.value){
            currentNode.left = rInsert(currentNode.left, val);
        }else if(val > currentNode.value){
            currentNode.right = rInsert(currentNode.right, val);
        }
        // we do not need else part (val already exists). We do not insert same number twice
        return currentNode;
    }


}


public class BSTDemo {
    public static void main(String[] args) {

        // to demo recursive approach
        BinarySearchTree tree1 = new BinarySearchTree();

        tree1.rInsert(6);
        tree1.rInsert(4);
        tree1.rInsert(8);
        tree1.rInsert(3);
        tree1.rInsert(5);
        tree1.rInsert(7);
        tree1.rInsert(9);

        // 6
        // 4 8
        // 3,5  7,9
        //

        tree1.rTraverseBSTInOrder();
        System.out.println();

        tree1.rTraverseBSTPreOrder();
        System.out.println();


        tree1.rTraverseBSTPostOrder();
        System.out.println();

    }
}
