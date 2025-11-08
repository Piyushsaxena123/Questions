public class DetectALoopOrCycle {
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
     // Floyd's Cycle finding Algorithm ==>> ( Slow-Fast Approch )
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if(slow == fast){
                return true; // cycle exists
            }
        }
        return false; // cycle doesn't exists
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
      head = new Node(1);
      head.next = new Node(2);
      head.next.next =  new Node(3);
      head.next.next.next = head;
      // 1 -> 2 -> 3 -> 1
      System.out.println(isCycle());
      
       
       
    }
}
