public class sumOfProductNodes {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(0);
        Node e = new Node(5);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        System.out.println(product(a));
        System.out.println(productZero(a));
    }

    public static int product(Node root){
        if(root==null) {
            return 1;
        }
        int sum=root.val;
        int left=product(root.left);
        int right=product(root.right);
        return sum*left*right;
    }
    public static int productZero(Node root){
        if(root==null) {
            return 1;
        }
        if(root.val==0){
            return 1;
        }
        int sum=root.val;
        int left=productZero(root.left);
        int right=productZero(root.right);
        return sum*left*right;
    }

}
