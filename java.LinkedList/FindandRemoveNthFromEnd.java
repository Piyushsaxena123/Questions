public class FindandRemoveNthFromEnd {
     public static class Node {
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
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
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
    public void deleteNthFromEnd(int n){
        // calculate size
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        // RemoveFirst Element
        if(n == size){
            head = head.next; // removeFirst = null
            return; // null
        }
        // size - n
        int i = 1;
        int itoFind = size - n; 
        Node prev = head;
        while (i<itoFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

    }
      public void print(){
        Node temp = head;
        if(head == null){
            System.out.println("LL is Empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
     public static void main(String[] args) {
        FindandRemoveNthFromEnd ll = new FindandRemoveNthFromEnd();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.print(); // 1->2->3->4->null
        ll.deleteNthFromEnd(3); // 3rd element = 2
        ll.print(); // 1->3->4->null
        System.out.println("The size of LinkeList = " + ll.size);
       
    }
}
