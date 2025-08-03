public class findMinMaxInTree {
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
        System.out.println(min(a));
        System.out.println(max(a));
    }
    public static int min(Node root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        int min=root.val;
        int leftMin=min(root.left);
        int rightMin=min(root.right);
        return Math.min(min,Math.min(leftMin,rightMin));
    }
    public static int max(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int max=root.val;
        int leftMax=max(root.left);
        int rightMax=max(root.right);
        return Math.max(max,Math.max(leftMax,rightMax));
    }
}
