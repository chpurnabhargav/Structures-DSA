import java.util.*;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(1);
        Node b = new Node(2);
        a.next=b;
        //b.next is null by default
        System.out.println(a.data+" "+b.data);
    }
} 