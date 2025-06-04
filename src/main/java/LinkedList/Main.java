package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);

        // Get methods
        System.out.println("Get methods: ");
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();

        System.out.println();

        // Append
        System.out.println("Appending: ");
        myLinkedList.append(2);
        myLinkedList.printList();

        System.out.println();

        // Remove last
        System.out.println("Removing last: ");
        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeLast().value);
        // (1) Item - Return 1 Node
        System.out.println(myLinkedList.removeLast().value);
        // (0) Items - Returns null
        System.out.println(myLinkedList.removeLast());

        System.out.println();

        // Prepend
        System.out.println("Prepending");
        myLinkedList = new LinkedList(2);
        myLinkedList.append(3);
        myLinkedList.prepend(1);
        myLinkedList.printList();

        System.out.println();

        // Remove first
        System.out.println("Removing first");
        // (3) Items - Returns 1 Node
        System.out.println(myLinkedList.removeFirst().value);
        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeFirst().value);
        // (1) Item - Returns 3 Node
        System.out.println(myLinkedList.removeFirst().value);
        // (0) Items - Returns null
        System.out.println(myLinkedList.removeFirst());

        System.out.println();

        // Get
        System.out.println("Getting by index");
        myLinkedList = new LinkedList(2);
        myLinkedList.append(3);
        myLinkedList.prepend(1);
        System.out.println(myLinkedList.get(3)); // null
        System.out.println(myLinkedList.get(2).value); // 3
        System.out.println(myLinkedList.get(1).value); // 2
        System.out.println(myLinkedList.get(0).value); // 1
        System.out.println(myLinkedList.get(-1)); // null

        System.out.println();

        // Set
        System.out.println("Setting by index");
        myLinkedList = new LinkedList(2);
        myLinkedList.append(3);
        myLinkedList.prepend(1);
        System.out.println(myLinkedList.set(3, 300)); // false
        System.out.println(myLinkedList.set(2, 200));// true
        System.out.println(myLinkedList.set(1, 100)); // true
        System.out.println(myLinkedList.set(0, 999)); // true
        System.out.println(myLinkedList.get(2).value); // 200
        System.out.println(myLinkedList.get(1).value); // 100
        System.out.println(myLinkedList.get(0).value); // 999
        System.out.println(myLinkedList.set(-1, -100)); // false

        System.out.println();

        // Insert
        System.out.println("Inserting");
        myLinkedList = new LinkedList(2);
        myLinkedList.append(3);
        myLinkedList.prepend(1);
        System.out.println(myLinkedList.insert(4, 555)); // false
        System.out.println(myLinkedList.insert(-1, -111)); // false
        System.out.println(myLinkedList.insert(3, 444)); // true
        System.out.println(myLinkedList.insert(0, 0)); // true
        System.out.println(myLinkedList.insert(1, 111)); // true
        myLinkedList.printList();

        // Remove
        System.out.println("Removing");
        myLinkedList = new LinkedList(2);
        myLinkedList.append(3);
        myLinkedList.prepend(1);
        System.out.println(myLinkedList.remove(3)); // null
        System.out.println(myLinkedList.remove(-1)); // null
        System.out.println(myLinkedList.remove(1).value); // 2
        myLinkedList.insert(1, 2); // Insert 2 back
        System.out.println(myLinkedList.remove(0).value); // 1
        myLinkedList.prepend(1); // Prepend 1 back
        System.out.println(myLinkedList.remove(2).value); // 3

        System.out.println();

        // Reverse
        System.out.println("Reversing");
        myLinkedList = new LinkedList(2);
        myLinkedList.append(3);
        myLinkedList.prepend(1);
        myLinkedList.printList();
        System.out.println();
        myLinkedList.reverse();
        myLinkedList.printList();
        System.out.println();
        myLinkedList = new LinkedList(2);
        myLinkedList.reverse();
        myLinkedList.printList();
        myLinkedList.removeFirst();
        myLinkedList.reverse();
        myLinkedList.printList();
    }
}
