public class displayRec {
    
    
    static class Node{
        int data;
        Node Next;
    
        Node(int data){
            this.data = data;
        }
    }

    static void displayr(Node head){
        if(head==null){
            return ;
        }
        else{
            displayr(head.Next); // reverse order 
            System.out.println(head.data);
           
        }
    }
    public static void main(String[] args) {
        


        Node a = new Node(0);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        

        a.Next=b;
        b.Next=c;
        c.Next=d;
        d.Next=e;  

        displayr(a);

    }
}
