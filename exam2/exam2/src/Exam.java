// Binary Tree in Java
public class Exam {

    public static void main(String[] args) {

        // Do not remove
        Node A;
        Node B;
        Node C;
        Node D;
        Node E;
        Node F;
        Node G;
        Node H;
        Node I;

        // Part 1: Binary Tree Traversal
        // Print the required string pattern by constructing a binary tree and traverse
        // each node using a specific traversal method.

        System.out.println("1. Print the last six digits of your student number using IN-ORDER Traversal");

        // Populate each node with the last six digits of your student number
        A = new Node('1');
        B = new Node('0');
        C = new Node('1');
        D = new Node('2');
        E = new Node('4');
        F = new Node('6');

        D.left = B;
        D.right = F;
        F.left = E;

        B.left = A;
        B.right = C;
    
        traverseInOrder(D);

        // ===========================================================================================
        System.out.println("");
        System.out.println("2. Print last six digits of your student number using PRE-ORDER Traversal");

        // Populate each node with the last six digits of your student number
        A = new Node('1');
        B = new Node('0');
        C = new Node('1');
        D = new Node('2');
        E = new Node('4');
        F = new Node('6');

        A.left = B;
        A.right = E;
        E.left = F;

        B.left = C;
        B.right = D;

        traversePreOrder(A);

        // ===========================================================================================
        System.out.println("");
        System.out.println("3. Print last six digits of your student number using POST-ORDER Traversal");

        // Populate each node with the last six digits of your student number
        A = new Node('1');
        B = new Node('0');
        C = new Node('1');
        D = new Node('2');
        E = new Node('4');
        F = new Node('6');

        F.left = C;
        C.left = A;
        C.right = B;
        F.right = E;
        E.left = D;

        traversePostOrder(F);


        // ===========================================================================================
        // Part 2: Binary Expression Tree
        // Print the expression by constructing a binary expression tree and traverse
        // each node using INORDER traversal

        System.out.println("");
        System.out.println("4. Print the expression \"(8 + 4) * (7 - 9)\" using IN-ORDER Traversal");
        A = new Node('+');
        B = new Node('*');
        C = new Node('-');
        D = new Node('8');
        E = new Node('4');
        F = new Node('7');
        G = new Node('9');

        B.left = A;
        A.left = D;
        A.right = E;

        B.right = C;
        C.left = F;
        C.right = G;

        traverseInOrder(B);

        // ===========================================================================================
        System.out.println("");
        System.out.println("5. Print the expression \"5 / 8 + 3 - 6 * 1\" using IN-ORDER Traversal");
        A = new Node('/');
        B = new Node('+');
        C = new Node('-');
        D = new Node('*');
        E = new Node('5');
        F = new Node('8');
        G = new Node('3');
        H = new Node('6');
        I = new Node('1');

        C.left = B;
        B.left = A;
        B.right = G;
        A.left = E;
        A.right = F;

        C.right = D;
        D.left = H;
        D.right = I;

        traverseInOrder(C);
        
    }   

    // Traverse Inorder Method
    static void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    // Traverse Postorder method
    static void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    // Traverse Preorder method
    static void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
}