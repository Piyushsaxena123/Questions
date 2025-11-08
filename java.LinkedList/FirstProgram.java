class FirstProgram{
    public static class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
        
    }
    public static void main(String[] args) {
        Node a = new Node(5);
           Node b = new Node(3);
              Node c = new Node(9);
                 Node d = new Node(8);
                    Node e = new Node(16);
                    // 5 3 9 8 16
                    a.next = b; // 5->3 9 8 16
                    b.next = c; // 5->3->9 8 16
                    c.next = d; // 5->3->9->8 16
                    d.next = e; // 5->3->9->8->16
                    // System.out.println(a.data);
                    // System.out.println(b.data);
                    // System.err.println(c.data);
                    // System.err.println(d.data);
                    // System.err.println(e.data);

                    // Node temp = a;
                    // for(int i = 0; i<=5; i++){
                    //     System.out.print(temp.data + " ");
                    //     temp = temp.next;
                    // }


                     Node temp = a;
                     while (temp != null) {
                        System.out.print(temp.data + " ");
                        temp = temp.next;
                     }


         



    }
}