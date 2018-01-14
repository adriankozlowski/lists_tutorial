package pl;

public class Node {
    private Node next;
    private Node previous;
    private Integer value;

    public Node(Integer value) {
        this.value = value;
    }

    public Integer getValue() {

        return value;
    }

    public Node setValue(Integer value) {
        this.value = value;
        return this;
    }

    public Node getNext() {
        return next;
    }

    public Node setNext(Node next) {
        this.next = next;
        return this;
    }

    public Node getPrevious() {
        return previous;
    }

    public Node setPrevious(Node previous) {
        this.previous = previous;
        return this;
    }
}
