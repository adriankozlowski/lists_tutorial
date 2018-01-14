package singlyListedList;


public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.add(1);
        singlyLinkedList.add(3);
        singlyLinkedList.add(4);
        singlyLinkedList.add(6);

        printNodes(singlyLinkedList.getFirst());
    }

    private static void printNodes(Node node) {
        Node tmpNode = node;
        while (tmpNode != null) {
            System.out.println(tmpNode.getValue());
            tmpNode = tmpNode.getNext();
        }

    }
}
