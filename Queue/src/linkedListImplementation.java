public class linkedListImplementation {
    public static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static class queueLL {
        Node head = null;

        public void add(int val) {
            Node n = new Node(val);
            if (head == null) {
                head = n;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = n;
            }
        }

        public void remove() {
            if (head == null) {
                System.out.println("empty queue");
                return;
            }
            head = head.next;
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public void element() {
            if (head == null) {
                System.out.println("empty queue");
                return;
            }
            System.out.println(head.val);
        }
    }

    public static void main(String[] args) {
        queueLL q = new queueLL();
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        q.remove();
        q.remove();
        q.element();  // Should print "empty queue"
        q.display();  // Should print nothing (empty line)
    }
}
