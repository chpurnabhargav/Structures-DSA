public class circularQueue {
    public static class Queue {
        int rear = -1;
        int front = -1;
        int arr[] = new int[5];

        public void add(int val) throws Exception {
            if (front == -1 && rear == -1) {
                front = rear = 0;
                arr[0] = val;
            } else if ((rear + 1) % arr.length == front) {
                throw new Exception("size exceeded");
            } else {
                rear = (rear + 1) % arr.length;
                arr[rear] = val;
            }
        }

        public void remove() throws Exception {
            if (front == -1 && rear == -1) {
                throw new Exception("Empty queue");
            } else if (front == rear) {
                front = rear = -1;
            } else if (front == arr.length - 1) {
                front = 0;
            } else {
                front = front + 1;
            }
        }

        public void display() {
            if (front == -1) {
                System.out.println("Queue is empty");
                return;
            }

            if (front <= rear) {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else {
                for (int i = front; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                for (int i = 0; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();

        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.display();

        q.add(6);
        q.add(7);
        q.remove();
        q.display();
    }
}
