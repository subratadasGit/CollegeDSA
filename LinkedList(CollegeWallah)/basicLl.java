public class basicLl {

static class Node{
    int data;
    Node Next;

    Node(int data){
        this.data = data;
    }
}
    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        

        a.Next=b;
        b.Next=c;
        c.Next=d;
        d.Next=e;


        System.out.println(a.data);
        System.out.println(a.Next.data);

        

        


    }
}