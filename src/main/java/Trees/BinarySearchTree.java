package Trees;

public class BinarySearchTree {
    // Full node means every node points to two or zero nodes
    // Perfect if every level is completely filled
    // Complete if no gaps

    Node root;

    class Node {
        int value;
        Node left;
        Node right;

        private Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value) {
         Node newNode = new Node(value);

         if(root == null) {
             root = newNode;
             return true;
         }

         Node temp = root;

         while(true) {
             if(newNode.value == temp.value) return false;

             if(newNode.value < temp.value) {
                 // Go left
                 if(temp.left == null) {
                     temp.left = newNode;
                     return true;
                 } else {
                     temp = temp.left;
                 }
             } else {
                 // Go right
                 if(temp.right == null) {
                     temp.right = newNode;
                     return true;
                 } else {
                     temp = temp.right;
                 }
             }
         }
    }

    public boolean contains(int value) {
        if(root == null) return false;
        Node temp = root;

        while(temp != null) {
            if(value < temp.value) {
                temp = temp.left;
            } else if(value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }

        return false;
    }

    // Private overload - recursive
    private boolean rContains(Node currentNode, int value) {
        if (currentNode == null) return false;

        if(currentNode.value == value) return true;

        if(value < currentNode.value) {
            return rContains(currentNode.left, value);
        } else {
            return rContains(currentNode.right, value);
        }
    }

    // Public overload - calls private overload passing root
    public boolean rContains(int value) {
        return rContains(root, value);
    }

    // Private overload - recursive
    private Node rInsert(Node currentNode, int value) {
        if(currentNode == null) return new Node(value);

        if (value < currentNode.value) {
            currentNode.left = rInsert(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = rInsert(currentNode.right, value);
        }

        // Note that If value equals current node's value
        //  do nothing

        return currentNode;
    }

    // Public overload - calls private overload passing root
    public void rInsert(int value) {
        if(root == null) root = new Node(value);
        rInsert(root, value);
    }

    private Node deleteNode(Node currentNode, int value) {
        if (currentNode == null) return null;

        if(value < currentNode.value) {
            currentNode.left = deleteNode(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = deleteNode(currentNode.right, value);
        } else {
            // Found value:
            //  1. No child nodes
            //  2. Right child node
            //  3. Left child node
            //  4. Two child nodes
            if (currentNode.left == null && currentNode.right == null) {
                return null; // Current node will be removed at next lower level in the call stack
            } else if (currentNode.left == null) {
                currentNode = currentNode.right;
            } else if (currentNode.right == null) {
                currentNode = currentNode.left;
            } else {
                int subTreeMin = minValue(currentNode.right);
                currentNode.value = subTreeMin;
                currentNode.right = deleteNode(currentNode.right, subTreeMin);
            }

        }

        return currentNode;
    }

    public void deleteNode(int value) {
        deleteNode(root, value);
    }

    public int minValue(Node currentNode) {
        while(currentNode.left != null) {
            currentNode = currentNode.left;
        }

        return currentNode.value;
    }
}
