public class ReverseALinkedList {
    public class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}
public static Node head;
 public static Node tail;
    
    public void addFirst(int data){
        // Step 1 = Create new node
        Node newNode = new Node(data);
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
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
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
   public static void reverse(){
    Node prev = null;
    Node curr = head;
    Node next;
    while (curr!=null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    head = prev;
   }
   public static void main(String[] args) {
    ReverseALinkedList ll = new ReverseALinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        ll.reverse();
        ll.print();
   }
    
}
