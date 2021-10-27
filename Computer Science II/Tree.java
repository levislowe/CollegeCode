public class Tree {
    
    private class Node {
        int data;
        Node left;
        Node right;

        public Node(int d) {
            data = d;
        }
    }
    Node root = null;

    public void add(int n) {
       if (root == null) {
           root = new Node(n);
       }
       else {
           recursiveAdd(n, root);
       }
    }

    public void recursiveAdd(int n, Node node) {
        if(node.left == null) {
            node.left = new Node(n);
        }
        else if (node.right == null) {
            node.right = new Node(n);
        }
        else {
            if (Math.random() < 0.5) {
                recursiveAdd(n ,node.left);
            }
            else {
                recursiveAdd(n, node.right);
            }
        }
    }
    
    public void recursiveAddSort(int n, Node node) {
        if (n < node.data) {
            if (node.left == null) {
                node.left = new Node(n);
            }
            else {
                recursiveAdd(n, node.left);
            }
        }
        else {
            if (node.right == null) {
                node.right = new Node(n);
            }
            else {
                recursiveAdd(n, node.right);
            }
        }
    }

    public boolean contains(int obj) {
        Node currentNode = root;

        while (currentNode != null && currentNode.data != obj) {
            if (obj < currentNode.data) {
                currentNode = currentNode.left;
            }
            else {
                currentNode = currentNode.right;
            }
        }
        if (currentNode == null) {
            return false;
        }
    }

    public void inOrder(Node current) {
        if (current.left != null) {
            inOrder(current.left);
            System.out.println(current.data);
        }
        if (current.right != null) {
            inOrder(current.right);
        }
    }

    public void inOrderPrint(Node current, int level) {
        String space = new String();
        if (current.right != null)  {
            inOrderPrint(current.right, level + 1);
            space = "";
        }
        for (int count = 0; count < level; count ++) {
            space = "      ";
        }
        System.out.println(space + current.data);
        if (current.left != null) {
            inOrderPrint(current.left, level + 1);
        }
    }

    public void preOrder(Node current) {
        System.out.println(current.data);
        if (current.left != null) {
            preOrder(current.left);
        }
        if (current.right != null) {
            preOrder(current.right);
        }
    }

    public void postOrder(Node current) {
        if (current.left != null) {
            postOrder(current.left);
        }
        if (current.right != null) {
            postOrder(current.right);
        }
        System.out.println(current.data);
    }

    public Node nodeFactory(int d) {
        Node n = new Node(d);
        return n;
    }

    public static void main(String [] args) {
        Tree x = new Tree();

        x.add(1);
        x.add(2);
        x.add(3);
        x.add(4);
        x.add(5);

        x.inOrderPrint(x.root, 0);

        System.out.println(x.contains(5));
    }
}