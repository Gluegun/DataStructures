package double_linked_list;

public class DLMain {
    public static void main(String[] args) {

        DoubleLinkedList dl = new DoubleLinkedList();

        dl.addToHead(new ListItem("one"));
        dl.addToHead(new ListItem("two"));
        dl.addToHead(new ListItem("three"));
        dl.addToHead(new ListItem("four"));
        dl.addToHead(new ListItem("five"));
        dl.addToTail(new ListItem("zero"));

        System.out.println("head element is: " + dl.getHeadElement().getData());
        System.out.println("tail element is: " + dl.getTailElement().getData());
        System.out.println(dl);

        System.out.println("removing head element (which is "
                + dl.getHeadElement().getData() + ")");
        dl.removeHeadElement();
        System.out.println(dl);

        System.out.println("removing tail element (which is "
                + dl.getTailElement().getData() + ")");
        dl.removeTailElement();
        System.out.println(dl);

        System.out.println(dl.popHeadElement().getData());
        System.out.println(dl);

        System.out.println(dl.popTailElement().getData());
        System.out.println(dl);


    }
}
