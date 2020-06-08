package binary_tree;

public class BTMain {
    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();

        binaryTree.addNode("1");
        binaryTree.addNode("3");
        binaryTree.addNode("6");
        binaryTree.addNode("4");
        binaryTree.addNode("2");
        binaryTree.addNode("7");
        binaryTree.addNode("1");


        binaryTree.inOrderTraverseTree(binaryTree.root);

        System.out.println(binaryTree.searchNodes("1"));

        Node node = new Node("Lolkek");


        System.out.println(node);

    }
}


