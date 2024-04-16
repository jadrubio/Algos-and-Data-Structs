package DataStructures.DoublyLinkedList;

public class Main {
    public static void main(String[] args){
        DoublyLinkedList myDLL = new DoublyLinkedList(7);

        System.out.println("APPEND");
        myDLL.printList();
        System.out.println("appending...");
        myDLL.append(13);
        myDLL.printList();

        System.out.println("RemoveLast");
        myDLL.printList();
        System.out.println("removing last...");
        System.out.println("removing ..." + myDLL.removeLast().value);
        System.out.println("done");
        myDLL.printList();

        System.out.println("Prepend");
        myDLL.printList();
        System.out.println("prepending 42....");
        myDLL.prepend(42);
        myDLL.printList();

        System.out.println("removeFirst");
        myDLL.append(46);
        myDLL.append(2);
        myDLL.printList();
        System.out.println("removing first....");
        myDLL.removeFirst();
        myDLL.printList();

        System.out.println("GET");
        myDLL.append(56);
        myDLL.append(879);
        myDLL.append(34);
        myDLL.printList();
        System.out.println("Getting value at index 5");
        System.out.println(myDLL.get(5).value);

        System.out.println("SET");
        myDLL.printList();
        System.out.println("setting index 4 to 4");
        myDLL.set(4, 4);
        myDLL.printList();

        System.out.println("Insert");
        myDLL.printList();
        System.out.println("insert 42 at 1");
        myDLL.insert(1, 42);
        myDLL.printList();

        System.out.println("Remove");
        myDLL.printList();
        System.out.println("removing index 5");
        myDLL.remove(5);
        myDLL.printList();
    }
}
