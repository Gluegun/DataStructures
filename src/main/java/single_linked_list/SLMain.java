package single_linked_list;

public class SLMain {
    public static void main(String[] args) {

        SingleLinkedList linkedList = new SingleLinkedList();
        linkedList.push(new ListItem("one"));
        linkedList.push(new ListItem("two"));
        linkedList.push(new ListItem("three"));
        linkedList.push(new ListItem("four"));

        System.out.println(linkedList.size());
        System.out.println(linkedList);
        linkedList.removeLast();
        System.out.println(linkedList);


    }
}
