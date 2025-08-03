import java.util.*;
class StackArr{
    public static class Stack{
       private int stack[] = new int[5];
       private int top=0;
        void push(int x){
        stack[top]=x;
        top++;
        }
        int peek() {
            if (top == 0) {
                System.out.println("Stack is empty");
                return -1;
            }
            return stack[top - 1];
        }
        int pop(){
            if(top==0) {
                System.out.println("Stack is empty");
                return -1;
            }
                top--;
                int deleted = stack[top];
                return deleted;
        }
        void display(){
            for(int i=0;i<=top-1;i++){
                System.out.print(stack[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return top;
        }
        boolean isEmpty(){
            return size()==0;
        }
        boolean isFull(){
            return  size()==stack.length;
        }

    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.pop();
        s.pop();
        System.out.println(s.size());
        s.display();
    }
}