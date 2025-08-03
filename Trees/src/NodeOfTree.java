class Node{
 int val;
 Node left;
 Node right;
 public  Node(int val){
     this.val=val;
     this.left=null;
     this.right=null;
 }
}
public class NodeOfTree {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.right=f;
        //we can change the value by reference
        System.out.println(a.left.right.val);

        System.out.println(e.val);

       // check here a.left.right is  node e
        // i changed value of e through a
        a.left.right.val=24;
        System.out.println(e.val);
    }
}
