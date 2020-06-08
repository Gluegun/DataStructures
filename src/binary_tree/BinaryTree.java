package binary_tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

    static class Node {
        String data;
        Node left;
        Node right;

        Node(String data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data='" + data + '\'' +
                    '}';
        }
    }

    public Node root;

    public void addNode(String data) {
        //TODO
        Node node = new Node(data);
        if (root == null) {
            root = node;
        } else {
            Node focusNode = root;

            Node parent;
            while (true) {
                parent = focusNode;
                if (data.compareTo(focusNode.data) < focusNode.data.compareTo(data)) {
                    focusNode = focusNode.left;
                    if (focusNode == null) {
                        parent.left = node;
                        return;
                    }
                } else {

                    focusNode = focusNode.right;

                    if (focusNode == null) {
                        parent.right = node;
                        return;
                    }
                }
            }
        }
    }

    public void inOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            inOrderTraverseTree(focusNode.left);

            System.out.println(focusNode);

            inOrderTraverseTree(focusNode.right);

        }


    }

    public void preOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {

            System.out.println(focusNode);

            preOrderTraverseTree(focusNode.left);

            preOrderTraverseTree(focusNode.right);

        }
    }

    public void postOrderTraversalTree(Node focusNode) {
        if (focusNode != null) {

            postOrderTraversalTree(focusNode.left);

            postOrderTraversalTree(focusNode.right);

            System.out.println(focusNode);
        }


    }

    public Node findNode(String data) {

        Node focusNode = root;

        while (!focusNode.data.equals(data)) {
            if (data.compareTo(focusNode.data) < focusNode.data.compareTo(data)) {
                focusNode = focusNode.left;
            } else {
                focusNode = focusNode.right;
            }
            if (focusNode == null) {
                return null;
            }
        }
        return focusNode;
    }


    public List<Node> searchNodes(String data) {

        List<Node> nodes = new ArrayList<>();

        Node focusNode = root;

        while (!focusNode.data.equals(data)) {
            if (data.compareTo(focusNode.data) < focusNode.data.compareTo(data)) {
                focusNode = focusNode.left;
                nodes.add(focusNode);
            } else {
                focusNode = focusNode.right;
                nodes.add(focusNode);
            }
            if (focusNode == null) {
                return null;
            }
        }
        return nodes;
    }
}


