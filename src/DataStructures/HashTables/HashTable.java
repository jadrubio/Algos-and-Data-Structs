package HashTables;

public class HashTable {
    private int size = 7;
    private Node[] dataMap;
    public HashTable() {
        dataMap = new Node[size];
    }

    class Node {
        private String key;
        private int value;
        private Node next;
        public Node(String key, int value) {
            this.key = key;
            this.value = value;
        }

    }
}
