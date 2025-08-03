public class sumOfTreeNodes {
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
        System.out.println(sum(a));
    }

    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int sum=0;
        sum=sum+root.val;
        int left=sum(root.left);
        int right=sum(root.right);
        return sum+left+right;
    }
}
