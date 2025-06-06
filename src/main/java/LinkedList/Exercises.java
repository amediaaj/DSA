package LinkedList;

public class Exercises {

    public static LinkedList.Node findMiddleNode(LinkedList linkedList) {
        LinkedList.Node fast = linkedList.get(0), slow = fast;

        fast = linkedList.get(0);

        if(fast == null) {
            return null;
        }

        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

}
