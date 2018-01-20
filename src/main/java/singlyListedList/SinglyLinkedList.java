package singlyListedList;

import java.util.Iterator;

public class SinglyLinkedList implements Iterable<Integer> {

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
     *
     * @param value wartość, kótra ma zostać dodana
     */
    public void add(Integer value) {
        Node node = new Node(value);
        //sprawdzam, czy w naszej liście już coś jest
        if (head == null) {
            //jeżeli lista jest pusta, to dodajemy pierwszy element.
            head = node;
        }
        //Analogicznie sprawdzamy, czy dodany element jest również ostatni.
        if (tail == null) {
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
        //zwiększam ilość elementów w liście.
        size++;
    }

    /**
     * Metoda usuwa podany w parametrze element.
     * @param element Node, który chcemy usunąć
     */
    public void remove(Node element) {
        Node tmp = head;
        Node prev = null;

        while (tmp != null) {
            if (tmp == element) {
                //jeżeli head jest tym elementem, to trzeba go przesunąć
                if (head == tmp) {
                    head = tmp.getNext();
                    size--;
                    return;
                }
                prev.setNext(tmp.getNext());
                size--;
                return;
            } else {
                prev = tmp;
                tmp = tmp.getNext();
            }
        }
    }

    /**
     * zwraca ilość elementów w liście.
     *
     * @return
     */
    public int size() {
        return size;
    }

    public Node getFirst() {
        return head;
    }

    /**
     * Pobiera element z indeksem podanym w parametrze
     *
     * @param i
     * @return
     */
    public Node getElementAt(int i) {
        int index = 0;
        if(i == 0){
            return head;
        }
        Node next = head;
        while (index <= i) {
            if (index == i) {
                return next;
            }
            index++;
            if(next.getNext()!=null) {
                next = next.getNext();
            }
        }
        return null;
    }

    /**
     * Zwraca listę z odwrotną kolejnością.
     * @return odwrócona lista.
     */
    public SinglyLinkedList reverse(){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        for (int i = this.size-1; i>=0 ;i--) {
            singlyLinkedList.add(getElementAt(i).getValue());
        }
        return singlyLinkedList;
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node naNastepnąIterację = head;
            Node aktualnyDoZwrócenia = head;
           public boolean hasNext() {//
                return naNastepnąIterację != null;
            }

            public Integer next() {
                aktualnyDoZwrócenia = naNastepnąIterację;
                naNastepnąIterację = aktualnyDoZwrócenia.getNext();
                return aktualnyDoZwrócenia.getValue();
            }
        };
    }
}
