class Node {
        private int data;
        private Node next;

        Node(int value){
            data = value;
            next = null;
        }

        public Node getNext(){
            return next;
        }

        public void setNext(Node value){
            next = value;
        }

        public int getData(){
            return data;
        }
    }

class LinkedList {
    private Node head;

    public LinkedList() {
        head = new Node(-1);
    }

    public int get(int index) {
        int count = 0;
        Node current = head.getNext();
        while(current != null){
            if(index == count) return current.getData();
            count++;
            current = current.getNext();
        }
        return -1;
    }

    public void insertHead(int val) {
        Node newNode = new Node(val);
        newNode.setNext(head.getNext());
        head.setNext(newNode);
    }

    public void insertTail(int val) {
        Node current = head;
        Node newTail = new Node(val);
        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(newTail);
    }

    public boolean remove(int index) {
        int count = 0;
        Node current = head;
        while(current != null && current.getNext() != null){
            if(count == index) {
                current.setNext(current.getNext().getNext());
                return true;
            }
            current = current.getNext();
            count++;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> result = new ArrayList<>();
        Node current = head.getNext();
        while(current != null ){
            result.add(current.getData());
            current = current.getNext();
        }
        return result;
    }
}