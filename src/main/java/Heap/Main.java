package Heap;

public class Main {
    public static void main(String[] args) {
        Heap myHeap = new Heap();

        // Inserting
        myHeap.insert(99);
        myHeap.insert(72);
        myHeap.insert(61);
        myHeap.insert(58);
        System.out.println(myHeap.getHeap());

        // Inserting
        myHeap.insert(100);
        System.out.println(myHeap.getHeap());

        // Inserting
        myHeap.insert(75);
        System.out.println(myHeap.getHeap());

        // Removing
        myHeap.remove();
        System.out.println(myHeap.getHeap());

        // Removing
        myHeap.remove();
        myHeap.remove();
        myHeap.remove();
        myHeap.remove();
        myHeap.remove();
        System.out.println(myHeap.getHeap());
        myHeap.remove();
        System.out.println(myHeap.getHeap());
    }
}
