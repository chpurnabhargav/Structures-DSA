

public class StackLinkedList {
     static class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
        Node top=null;
        int size=0;
        void push(int x){
            Node newNode = new Node(x);
            newNode.next=top;
            top=newNode;
            size++;
        }
        void pop(){
            System.out.println("removed element: "+top.data+" ");
            top=top.next;
        }
        void display(){
            Node temp = top;
            while(temp!=null){
                System.out.print(+temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        void disRec(Node head){
            Node temp=head;
            if(temp==null){
                System.out.println();
                return;
            }
            System.out.print(temp.data+" ");
            disRec(temp.next);
        }
        void displayRec(){
            disRec(top);
        }
        void getSize(){
            System.out.println("Size of the stack: "+size);
        }
    }
    public static void main(String[] args){
         Stack s = new Stack();
         s.push(1);
         s.push(2);
         s.push(3);
         s.push(4);
         s.pop();
         s.pop();
        s.push(100);
         s.getSize();
         s.display();
         s.displayRec();
    }
}
