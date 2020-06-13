package binary_tree;

public class BTMain {
    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();

        bt.addNode("4");
        bt.addNode("5");
        bt.addNode("3");
        bt.addNode("6");
        bt.addNode("1");
        bt.addNode("2");


        System.out.println(bt.findNode("6").getParent().getData());


    }
}


