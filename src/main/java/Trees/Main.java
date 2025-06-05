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

        // Confirm insertion
        System.out.println("Confirm insertion");
        myBST.insert(27);
        System.out.println(myBST.root.left.right.value); // 27

        System.out.println();

        // Contains
        System.out.println("Contains");
        System.out.println(myBST.contains(99)); // false
        System.out.println(myBST.contains(82)); // true

        System.out.println();

        // Recursive insert
        System.out.println("Inserting to new BST");
        myBST = new BinarySearchTree();
        myBST.rInsert(2);
        myBST.rInsert(1);
        myBST.rInsert(3);
        System.out.println("Root: " + myBST.root.value  ); // 2
        System.out.println("Root->Left: " + myBST.root.left.value); // 1
        System.out.println("Root->Right: " + myBST.root.right.value); // 3

        // Test minValue
        System.out.println("Testing minValue");
        myBST = new BinarySearchTree();
        myBST.rInsert(47);
        myBST.rInsert(21);
        myBST.rInsert(76);
        myBST.rInsert(18);
        myBST.rInsert(27);
        myBST.rInsert(52);
        myBST.rInsert(82);
        System.out.println(myBST.minValue(myBST.root));
        System.out.println(myBST.minValue(myBST.root.right));

        System.out.println();

        // Deleting
        System.out.println("Deleting from new tree");
        myBST = new BinarySearchTree();
        myBST.rInsert(47);
        myBST.rInsert(21);
        myBST.rInsert(20);
        myBST.rInsert(25);
        myBST.rInsert(24);
        myBST.rInsert(26);
        myBST.deleteNode(21);
        System.out.println(myBST.root.value); // 47
        System.out.println(myBST.root.left.value); // 24

    }
}
