public class levelOfTree {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        System.out.println(level(a));
    }
    public  static int level(Node root){
        if(root==null){
            return 0;
        }
        int c=1;
        int cleft=level(root.left);
        int cright=level(root.right);
        return c+Math.max(cleft,cright);
    }
}
