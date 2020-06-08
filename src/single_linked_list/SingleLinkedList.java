package single_linked_list;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class SingleLinkedList {
    private ListItem top;
    private int size;

    public void push(ListItem item) {
        if (top != null) {
            item.setNext(top);
        }
        top = item;
        size++;
    }

    public ListItem pop() {
        ListItem item = top;
        if (top != null) {
            top = top.getNext();
            item.setNext(null);
        }
        size--;
        return item;
    }


    public void removeTop() {
        if (top != null) {
            top = top.getNext();
        }
    }

    public int size() {
        return size;
    }

    public String toString() {

        String[] result = new String[size];
        int index = 0;

        ListItem temp = top;
        while (temp != null) {
            result[index++] = temp.getData();
            temp = temp.getNext();
        }

        return Arrays.toString(result);
    }

    public String get(int index) {

        int currentIndex = 0;
        ListItem temp = top;

        while (temp != null) {
            if (currentIndex == index) {
                return temp.getData();
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
        throw new NoSuchElementException();
    }

    public void removeLast() {
        remove(size - 1);
    }

    private void remove(int index) {
        int currentIndex = 0;
        ListItem temp = top;
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
}