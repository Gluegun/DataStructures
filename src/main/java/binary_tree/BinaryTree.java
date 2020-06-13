package binary_tree;

public class BinaryTree {

    private Node root;

    public Node getRoot() {
        return root;
    }


    public void addNode(String data) {

        Node node = new Node(data);

        if (root == null) {

            root = node;

        } else {

            Node focusNode = root;

            Node parent;
            Node toSet;

            while (true) {

                parent = focusNode;

                if (data.compareTo(focusNode.getData()) < focusNode.getData().compareTo(data)) {

                    focusNode = focusNode.getLeft();

                    if (focusNode == null) {
                        parent.setLeft(node);
                        parent.getLeft().setParent(parent);

                        return;
                    }

                } else {

                    focusNode = focusNode.getRight();

                    if (focusNode == null) {

                        parent.setRight(node);
                        parent.getRight().setParent(parent);

                        return;
                    }
                }
            }
        }
    }

    public Node findNode(String data) {

        Node focusNode = root;
        while (!focusNode.getData().equals(data)) {

            if (data.compareTo(focusNode.getData()) < focusNode.getData().compareTo(data)) {
                focusNode = focusNode.getLeft();
            } else {
                focusNode = focusNode.getRight();
            }
            if (focusNode == null) {
                return null;
            }
        }
        return focusNode;
    }

    public void inOrderTraverseTree(Node node) {

        if(node != null) {

            inOrderTraverseTree(node.getLeft());

            System.out.println(node.getData());

            inOrderTraverseTree(node.getRight());

        }
    }
}
