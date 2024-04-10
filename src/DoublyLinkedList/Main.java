package DoublyLinkedList;

public class Main {
    public static void main(String[] args){
        DoublyLinkedList myDLL = new DoublyLinkedList(7);

        System.out.println("APPEND");
        myDLL.printList();
        System.out.println("appending...");
        myDLL.append(13);
        myDLL.printList();
    }
}
