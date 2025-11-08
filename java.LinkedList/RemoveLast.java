public class RemoveLast {
    public static class  Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
    public static Node head;
    public static Node tail;
    public static int size;
    
    public void addFirst(int data){
        // Step 1 = Create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        // Step 2 = newNode next = head
        newNode.next = head; // link
        // Step 3 = head = newNode
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void addMiddle(int idx ,int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp  = head;
        int i = 0;
        while (i<idx - 1) { // Pointing to Previous.
            temp = temp.next;
            i++;
        }
        // i = idx - 1, temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }
    // REMOVE LAST ==>>
    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
       Node prev = head;
       for(int i = 0; i<size - 2; i++){
        prev = prev.next;
       }
       int val = tail.data;
       prev.next = null;
       tail = prev;
       size--;
       return val;
    }
    public void print(){
        Node temp = head;
        if(head == null){
            System.out.println("LinkedList is Empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
   
     public static void main(String[] args) {
       RemoveLast ll = new RemoveLast();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(2, 9);
        // 1->2->9->3->4->null
        ll.removeFirst();
        ll.print();


    }
}
