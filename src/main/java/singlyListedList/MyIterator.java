package singlyListedList;

import java.util.Iterator;

public class MyIterator implements Iterator<Integer> {

    private Node head;

    public MyIterator(Node head) {
        this.head = head;
    }

    public boolean hasNext() {
        return head!=null;
    }

    public Integer next() {
        Node tmp = head;
        head = head.getNext();
        return tmp.getValue();
    }
}
