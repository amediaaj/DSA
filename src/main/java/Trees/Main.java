package Trees;

public class Main {
    public static void main(String[] args) {
        // Create new BST
        BinarySearchTree myBST = new BinarySearchTree();
        System.out.println("root = " + myBST.root);

        // Insert values
        System.out.println("Inserting values");
        System.out.println(myBST.insert((47)));
        System.out.println(myBST.insert((21)));
        System.out.println(myBST.insert((76)));
        System.out.println(myBST.insert((18)));
        System.out.println(myBST.insert((52)));
        System.out.println(myBST.insert((82)));
        System.out.println(myBST.insert((82))); // false

        System.out.println();

        System.out.println("Confirm insertion");
        // Confirm insertion
        myBST.insert(27);
        System.out.println(myBST.root.left.right.value); // 27

        System.out.println();

        System.out.println("Contains");
        // Contains
        System.out.println(myBST.contains(99)); // false
        System.out.println(myBST.contains(82)); // true

    }
}
