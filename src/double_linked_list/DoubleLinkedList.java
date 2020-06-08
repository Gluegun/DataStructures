package double_linked_list;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class DoubleLinkedList {

    private ListItem head; //head //first
    private ListItem tail; //tail  //last
    private int size;

    public ListItem getHeadElement() {
        return head;
    }

    public ListItem getTailElement() {
        return tail;
    }

    public ListItem get(int index) {

        int currentIndex = 0;
        ListItem temp = head;

        while (temp != null) {
            if (currentIndex == index) {
                return temp;
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
        throw new NoSuchElementException();
    }

    private void remove(int index) {
        int currentIndex = 0;
        ListItem temp = head;
        while (temp != null) {
            if ((currentIndex + 1) == index) {
                temp.setNext(temp.getNext().getNext());
                size--;
                return;
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
    }

    public ListItem popHeadElement() {
        if (size == 0) {
            return null;
        }

        ListItem temp;
        temp = head;

        head = head.getNext();
        size--;

        if (size == 0) {
            tail = null;

        } else {
            head.setPrev(null);
        }
        return temp;
    }

    public ListItem popTailElement() {
        //TODO
        if (size == 0) {
            return null;
        }
        ListItem temp;
        temp = tail;

        if (size == 1) {
            head = null;
            tail = null;
        } else {

            tail.getPrev().setNext(null);
            tail = tail.getPrev();
        }
        size--;
        return temp;
    }

    public void removeHeadElement() {
        //TODO
        if (size == 0) {
            throw new NoSuchElementException();
        }

        head = head.getNext();
        size--;

        if (size == 0) {

            tail = null;
        } else {
            head.setPrev(null);
        }
    }


    public void removeTailElement() {
        //TODO
        if (size != 0) {
            if (size == 1) {
                head = null;
                tail = null;
            } else {
                tail.getPrev().setNext(null);
                tail = tail.getPrev();
            }
            size--;
        } else {
            throw new NoSuchElementException();

        }
    }

    public void addToHead(ListItem item) {
        //TODO

        if (size == 0) {
            head = item;
        } else {
            tail.setNext(item);
            item.setPrev(tail);
        }
        tail = item;
        size++;
    }

    public void addToTail(ListItem item) {
        //TODO
        ListItem temp = head;
        head = item;
        head.setNext(temp);

        if (size == 0) {
            tail = head;
        } else {
            temp.setPrev(head);
        }
        size++;

    }

    public int size() {
        return size;
    }

    public String toString() {

        String[] result = new String[size];
        int index = 0;

        ListItem temp = head;
        while (temp != null) {

            result[index++] = temp.getData();
            temp = temp.getNext();
        }

        return Arrays.toString(result);
    }
}