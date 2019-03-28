public class Node {
    private Node left, right;
    private int data;
    private static int nodeCount;
    private  boolean  isEmpty;

    public Node() {
        left = null;
        right = null;
        nodeCount = 0;
        isEmpty = true;
    }

    private Node(int data) {
        this.data = data;
        nodeCount++;
        isEmpty= false;
    }

    public void insert(int value) {
        if(value <= data) {
            if (left == null) {
                left = new Node(value);
            } else {
                left.insert(value);
            }
        }
        else  {
            if (right == null) {
                right = new Node(value);
            } else {
                right.insert(value);
            }
        }
    }

    public boolean contains(int value) {
        if (value == data) {
            return true;
        } else if (value < data) {
            if (left == null) {
                return false;
            } else {
                return left.contains(value);
            }
        } else {
            if (right == null) {
                return false;
            } else {
                return right.contains(value);
            }
        }
    }
    public void printNodeCount(){
        System.out.println("There is "+ nodeCount+ " Nodes.");
    }
    public void printInOrder(){
        if(left != null){
            left.printInOrder();
        }
        if(!isEmpty) {
            System.out.println(data);
        }
        if(right != null){
            right.printInOrder();
        }
    }
    public  void printPreOrder(){
        if(!isEmpty){
            System.out.println(data);
        }
        if(left != null){
            left.printPreOrder();
        }
        if (right != null){
            right.printPreOrder();
        }
    }
    public void printPostOrder(){
        if(left != null){
            left.printPostOrder();
        }
        if(right != null){
            right.printPostOrder();
        }
        if (!isEmpty){
            System.out.println(data);
        }
    }
}

