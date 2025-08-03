public class elementsOfNthLevel {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left=f;
        c.right=g;
        g.left=h;
        levels(a);
    }
    public static void nthLevel(Node root,int level,int n){
        if(root==null){
            return;
        }
        if(level==n){
            System.out.print(root.val+" ");
        }
        nthLevel(root.left,level+1,n);
        nthLevel(root.right,level+1,n);
    }
    public static void levels(Node root){
        for(int i=0;i<=3;i++){
            nthLevel(root,0,i);
            System.out.println();
        }
    }
}
