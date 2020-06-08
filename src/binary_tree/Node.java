package binary_tree;

public class Node {
    private String data;

    private Node parent;
    private Node left;
    private Node right;

    //TODO: create and implement methods
    public Node(String data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "Node{" +
                "data='" + data + '\'' +
                ", parent=" + parent +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}