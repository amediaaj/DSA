package LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        private Node(int value) {
            this.value = value;
        }
    }

    //   +===================================================+
    //   | Description:                                      |
    //   | - Constructor for the LinkedList class.           |
    //   | - Initializes the linked list with a single node. |
    //   |                                                   |
    //   | Parameters:                                       |
    //   | - value: The integer value of the first node in   |
    //   |   the newly created linked list.                  |
    //   |                                                   |
    //   | Behavior:                                         |
    //   | - A new Node is created with the given value.     |
    //   | - This node is set as both the head and tail of   |
    //   |   the list, indicating it is the only node in the |
    //   |   list at creation.                               |
    //   | - The length of the list is initialized to 1.     |
    //   +===================================================+
    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value) {
        Node newNode = new Node(value);

        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        length++;
    }

    public Node removeLast(){
        // Edge case when we started with empty LinkedList
        if (length == 0) return null;

        Node temp = head;
        Node pre = head;

        // On each iteration,
        //  pre ends up one node behind temp.
        // Loop ends when temp is at the end,
        //  and pre is second to end (unless length 1 array linked list)
        while(temp.next != null) {
            pre = temp;
            temp = temp.next;
        }

        // Now pre is second to end (unless length 1 linked list),
        //  and temp is at the end.
        // Update tail to pre, and set tail's next to null
        tail = pre;
        tail.next = null;
        length--;

        // Edge case when we started with 1 Node
        if(length == 0) {
            head = null;
            tail = null;
        }

        // Return the removed node
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);

        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        length++;
    }

    public Node removeFirst() {
        // Edge case when we started with empty LinkedList
        if(length == 0) return null;

        Node temp = head;
        head = head.next;

        // Removing so set next to null
        temp.next = null;

        length--;

        // Edge case when we started with 1 Node
        if(length == 0) {
            tail = null;
        }

        return temp;
    }

    public Node get(int index) {
        if(index < 0 || index >= length) {
            return null;
        }

        Node temp = head;

        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public boolean set(int index, int value) {
       Node temp = get(index);

       if(temp != null) {
           temp.value = value;
           return true;
        }

       return false;
    }

    public boolean insert(int index, int value) {
        if(index < 0 || index > length) {
            return false;
        }

        if(index == 0) {
            prepend(value);
            return true;
        }

        if(index == length){
            append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;

        return true;
    }

    public Node remove(int index) {
        if(index < 0 || index >= length) {
            return null;
        }

        if(index == 0) {
            return removeFirst();
        }

        if(index == length-1){
            return removeLast();
        }

        Node pre = get(index - 1);
        Node temp = pre.next;
        pre.next = temp.next;

        temp.next = null;
        length--;

        return temp;
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;

        Node before = null;
        Node after;

        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
}
