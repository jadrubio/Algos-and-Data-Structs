package DataStructures.Trees;

public class Main {
    public static void main(String[] args){
        bst();
    }

    public static void bst() {
        BinarySearchTree myBST = new BinarySearchTree();

        System.out.println("Root = " + myBST.root);

        System.out.println("INSERT");
        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(52);
        myBST.insert(81);
        myBST.printTree(myBST.root);

        System.out.println("CONTAINS");
        System.out.println("Does it contain 18? " + myBST.contains(18));
        System.out.println("Does it contain 311? " + myBST.contains(311));
    }
}
