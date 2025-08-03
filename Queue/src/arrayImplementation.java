public class arrayImplementation {
    public  static class queueA{
        int f=-1;
        int r=-1;
        int[] arr = new int[100];
        public void add(int val){
            if (r == arr.length - 1) {
                System.out.println("Queue is full");
                return;
            }
            if (f == -1 && r == -1) {
                f = r = 0;
            } else {
                r++;
            }

            arr[r] = val;
        }
        public void remove(){
            if (f == -1 || f > r) {
                System.out.println("Queue is empty");
                return;
            }

            f++;

            if (f > r) {
                f = r = -1; // Reset after last element is removed
            }
        }
        public void display(){
            if (f == -1 || f > r) {
                System.out.println("Queue is empty");
                return;
            }

            for (int i = f; i <= r; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        public void peek(){
            if(f!=-1 && f<=r) {
                System.out.println(arr[f]);
            }
            else{
                System.out.println("Index not avaiable");
            }
        }
    }
    public static void main(String[] args) {
        queueA q = new queueA();
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        q.peek();
        q.display();
    }
}
