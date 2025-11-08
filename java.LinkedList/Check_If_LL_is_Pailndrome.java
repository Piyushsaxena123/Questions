public class Check_If_LL_is_Pailndrome {
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
    // public void addFirst(int data){
    //     Node newNode = new Node(data);
    //     size++;
    //     if(head == null){
    //         head = tail = newNode;
    //         return;
    //     }
    //     newNode.next = head;
    //     head = newNode;
    // }
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
    // Slow-Fast Approch To find Mid Of LinkeList ==>>
    private Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // Slow is my MidNode
    }
    public boolean checkPailndrome(){
        // step - 1 Find Mid
        // Base Case
        if(head == null || head.next == null){
            return true;
        }
        Node midNode = findMid(head);
        // Step - 2 Reverse 2nd Half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // right half head
        Node left = head;

        // Step - 3 Check left half & right half are equal
        while (right != null) {
            if(left.data != right.data){
             return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
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
       Check_If_LL_is_Pailndrome ll = new Check_If_LL_is_Pailndrome();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        ll.print(); // 1->2->3->4->null
        System.out.println( ll.checkPailndrome());
        ll.addLast(3);
        System.out.println(ll.checkPailndrome());
       
       
    }
}
