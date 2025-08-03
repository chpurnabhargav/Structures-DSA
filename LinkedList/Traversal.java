import java.util.*;

public class Traversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        reverseLL(a);
        recurrsivePrint(e);
    }
    public static void traversal(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void recurrsivePrint(Node head){
        Node temp=head;
        if(temp==null){
            return;
        }
        else{
            
            System.out.print(temp.data+" ");
            recurrsivePrint(head.next);
        }
    }
    public static void reverseLL(Node a){
        Node prev=null;
        Node curr=a;
        Node nex=null;
        while(curr!=null){
            nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
        }
    }
}
