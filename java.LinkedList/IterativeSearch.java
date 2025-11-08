public class IterativeSearch {
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
   
    public static int Iterativesearch(int key){
    Node temp = head;
    int i = 0;
    while (temp != null) {
        if(temp.data == key){
            return i;
        }
        temp = temp.next;
        i++;
    } // Key Not Found
    return -1;
    }
    public static void main(String[] args) {
        IterativeSearch ll = new IterativeSearch();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        System.out.println("Index of 3: " + Iterativesearch(3));
        System.out.println("Index of 10: " + Iterativesearch(10));

    }
}