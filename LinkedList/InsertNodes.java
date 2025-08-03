public class InsertNodes {
    public static void main(String[] args) {
        SLL list1 = new SLL();
        list1.insertAtEnd(1);
        list1.insertAtEnd(2);
        list1.insertAtHead(0);
        list1.insertAtEnd(3);

        list1.traversal(); // Output: 0->1->2->3->null
        SLL list2 = new SLL();
        list2.insertAtEnd(1);
        list2.insertAtEnd(2);
        list2.insertAtHead(0);
        list2.insertAtEnd(20);
        list2.insertAtPos(7, 100);
        list2.traversal();
        System.out.print(list2.get(4));
        System.out.println();
        list2.set(3, 98);
        System.out.println(list2.getSize());
        list2.traversal();
        list2.insertAtHead(0);
        list2.insertAtEnd(20);
        list2.deleteAtIndex(3);
        list2.deleteAtEnd();
        System.out.println(list2.getSize());
        list2.traversal();
        System.out.println(list2.tail.data);
    }
}

class SLL {
     Node head = null;
     Node tail = null;
    private int size;
    public int getSize() {
        return size;
    }
    public void set(int pos,int value){
        Node temp=head;
        int i=0;
        while(i!=pos){
            temp=temp.next;
            i++;
        }
        temp.data=value;
    }
        public int get(int pos){
            Node temp=head;
            if(pos==size-1) return tail.data;
            if(pos>=size || pos<0){
                System.out.println("error");
                return -1;
            }
            int i=0;
            while(i!=pos){
                temp=temp.next;
                i++;
            }
        return temp.data;
    }
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void traversal() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void insertAtPos(int pos,int data){
        Node newNode = new Node(data);
        if(pos==0){
            insertAtHead(data);
            return;
        }
        else if(pos==size){
            insertAtEnd(data);
            return;
        }
        else if(pos>=size){
            System.out.println("Error Index Out Of Bounds");
            return;
        }
        else{
            Node temp=head;
            int i=0;
            while(i!=pos-1){
                temp=temp.next;
                i++;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
        size++;
    }
    public void deleteAtHead() throws Error{
       if(head==null){
        throw new Error("No elements");
       }
       else{
        head=head.next;
        size--;
       }
    }
    public void deleteAtEnd() throws Error{
        Node temp=head;
        if(head==null){
            throw new Error("NO Elements");
        }
        else{
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
        }
        size--;
    }
    public void deleteAtIndex(int index){
        if(index==0){
            deleteAtHead();
            return;
        }
        else if(index==size-1){
            deleteAtEnd();
            return;
        }
        else if(index<0 || index>size){
            System.out.println("Index Error");
            return;
        }
        else {
            Node temp=head;
            int i=0;
            while(i!=index-1){
                temp=temp.next;
                i++;
            }
            temp.next=temp.next.next;
            size--;
        }
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
