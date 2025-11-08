public class RecursiveSearch {
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
    public static int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }
   public static int Recursivesearch(int key){
    return helper(head,key);
   }
   public static void main(String[] args) {
    RecursiveSearch ll = new RecursiveSearch();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        System.out.println(ll.Recursivesearch(3));
        System.out.println(ll.Recursivesearch(10));
   }
}
