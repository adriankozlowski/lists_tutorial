package singlyListedList;

public class SinglyLinkedList {

    /**
     * Nie potrzebujemy gettera ani settera, ponieważ nie chcemy
     * aby klient programista wiedział w jaki sposób
     * obsługujemy naszą listę.
     */
    private Node head;

    /**
     * Nie potrzebujemy gettera ani settera, ponieważ nie chcemy
     * aby klient programista wiedział w jaki sposób
     * obsługujemy naszą listę.
     */
    private Node tail;

    /**
     * Nie potrzebujemy gettera ani settera, ponieważ nie chcemy
     * aby klient programista wiedział w jaki sposób
     * obsługujemy naszą listę.
     */
    private int size = 0;

    /**
     * Metoda dodaje do listy kolejną wartość
     * @param value wartość, kótra ma zostać dodana
     */
    public void add(Integer value){
        Node node = new Node(value);
        //sprawdzam, czy w naszej liście już coś jest
        if(head == null){
            //jeżeli lista jest pusta, to dodajemy pierwszy element.
            head = node;
        }
        //Analogicznie sprawdzamy, czy dodany element jest również ostatni.
        if(tail == null){
            tail = node;
        }else {
            tail.setNext(node);
            tail = node;
        }
        //zwiększam ilość elementów w liście.
        size++;
    }

    /**
     * zwraca ilość elementów w liście.
     * @return
     */
    public int size(){
        return size;
    }

    public Node getFirst(){
        return head;
    }
}
