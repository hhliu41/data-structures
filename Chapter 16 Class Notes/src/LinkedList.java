import java.util.NoSuchElementException;

/**
 * A linked list is a sequence of nodes with efficient
 * element insertion and removal. This class
 * contains a subset of the methods of the standard
 * java.util.LinkedList class.
*/
public class LinkedList
{
    //first refers to the first node in the list
    // if the list is empty, first is null
    private Node first;


    /**
        Constructs an empty linked list.
    */
    public LinkedList() {
        this.first = null;
    }




    /**
        Returns the first element in the linked list.
        @return the first element in the linked list
    */

    public Object getFirst() {
        if (this.first == null) {
            throw new NoSuchElementException();
        }
        return this.first.data;
    }

    /**
        Removes the first element in the linked list.
        @return the removed element
    */

    public Object removeFirst() {
        if (this.first == null) {
            throw new NoSuchElementException();
        }
        Object temp = this.first.data;
        this.first = this.first.next;
        return temp;
    }




    /**
        Adds an element to the front of the linked list.
        @param element the element to add
    */

    public void addFirst (Object element) {
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = this.first;
        this.first = newNode;
    }




    /**
        Returns an iterator for iterating through this list.
        @return an iterator for iterating through this list
    */

    public ListIterator listIterator() {
        return new LinkedListIterator();
    }

    public String toString() {
        ListIterator listIterator = listIterator();

        String allElements = "[";
        
        while (listIterator.hasNext()) {
            allElements += listIterator.next() + ", ";
        }
        return allElements + "]";
    }




    //Class Node
    // Node is static because it does NOT need to access anything in LinkedList
    static class Node {
        public Node next;
        public Object data;
    }


    class LinkedListIterator implements ListIterator
    {
      //private data
        private Node position;
        private Node previous;
        private boolean isAfterNext;

        /**
            Constructs an iterator that points to the front
            of the linked list.
        */

        public LinkedListIterator (){
            this.position = null;
            this.previous = null;
            this.isAfterNext = false;
        }

        /**
            Moves the iterator past the next element.
            @return the traversed element
        */

        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            this.previous = this.position;

            if (this.position == null) {
                this.position = first;
            }
            else {
                this.position = this.position.next;
            }

            this.isAfterNext = true;

            return this.position.data;
        }

        /**
            Tests if there is an element after the iterator position.
            @return true if there is an element after the iterator position
        */

        public boolean hasNext() {
            if (this.position == null) {
                return first != null;
            }

            return this.position.next != null;
        }

        /**
            Adds an element before the iterator position
            and moves the iterator past the inserted element.
            @param element the element to add
        */

        public void add(Object element) {
            if (this.position == null) {
                addFirst(element);
                this.position = first;
            }
            else {
                Node newNode = new Node();
                newNode.data = element;
                newNode.next = this.position.next;

                this.position.next = newNode;
                this.position = newNode;
            }
            this.isAfterNext = false;
        }

        /**
            Removes the last traversed element. This method may
            only be called after a call to the next() method.
        */

        public void remove() {
            if (!this.isAfterNext) {
                throw new IllegalStateException();
            }

            if (this.position == first) {
                removeFirst();
                this.position = null;
            }
            else {
                this.previous.next = this.position.next;
                this.position = this.previous;
            }

            this.isAfterNext = false;
        }


        /**
            Sets the last traversed element to a different value.
            @param element the element to set
        */

        public void set(Object element) {
            if (!this.isAfterNext) {
                throw new IllegalStateException();
            }
            
            this.position.data = element;
            // We don't have to reset isAfterNext because the structure of the list has not changed.
        }




    }//LinkedListIterator
}//LinkedList
