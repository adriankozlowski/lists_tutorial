package pl;

public class Main {
    public static void main(String[] args) {
        Node firstNode = new Node(8);
        Node secondNode = new Node(3);
        Node thirdNode = new Node(11);
        Node fourthNode = new Node(29);


        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);
        thirdNode.setNext(fourthNode);

        pritntNodes(firstNode);
    }

    private static void pritntNodes(Node node) {
        Node tmpNode = node;
        while (tmpNode != null) {
            System.out.println(tmpNode.getValue());
            tmpNode = tmpNode.getNext();
        }

    }
}
