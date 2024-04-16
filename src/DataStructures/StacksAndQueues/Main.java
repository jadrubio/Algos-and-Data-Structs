package DataStructures.StacksAndQueues;

public class Main  {

    public static void main(String[] args){
//        stacks();
        queues();
    }
    public static void stacks(){
        Stack myStack = new Stack(42);
        myStack.printStack();

        System.out.println("PUSH");
        myStack.printStack();
        System.out.println("pushing...");
        myStack.push(2);
        myStack.printStack();

        System.out.println("POP");
        myStack.push(112);
        myStack.printStack();
        System.out.println("popping..." + myStack.pop().value);
        myStack.printStack();
    }

    public static void queues() {
        Queue myQueue = new Queue(7);
        myQueue.printQueue();

        System.out.println("ENQUEUE");
        myQueue.enqueue(31);
        myQueue.printQueue();

        System.out.println("DEQUEUE");
        myQueue.dequeue();
        myQueue.printQueue();
    }
}
