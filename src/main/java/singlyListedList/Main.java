package singlyListedList;


import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.add(1);
        singlyLinkedList.add(3);
        singlyLinkedList.add(4);
        singlyLinkedList.add(6);

//        Node toRemove = singlyLinkedList.getElementAt(1);

//        singlyLinkedList.remove(toRemove);

//        printNodes(singlyLinkedList.getFirst());
//        printNodes(singlyLinkedList.reverse().getFirst());

            Iterator<Integer> iterator = singlyLinkedList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        iterator = singlyLinkedList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
            iterator = singlyLinkedList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        iterator = singlyLinkedList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    private static void printNodes(Node node) {
        Node tmpNode = node;
        while (tmpNode != null) {
            System.out.println(tmpNode.getValue());
            tmpNode = tmpNode.getNext();
        }

    }
}
