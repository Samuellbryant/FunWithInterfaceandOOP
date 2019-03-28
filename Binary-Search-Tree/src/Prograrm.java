public class Prograrm {

    public static void main(String[] args ){
        Node node = new Node();
        node.insert(21);
        node.insert(21);
        node.insert(22);
        node.insert(5);
        node.insert(21);
        System.out.println(node.contains(5));
        System.out.println(node.contains(6));
        System.out.println("\nIn Order:");
        node.printInOrder();
        System.out.println("\nPre Order:");
        node.printPreOrder();
        System.out.println("\nPost Order:");
        node.printPostOrder();
        node.printNodeCount();

    }
}
