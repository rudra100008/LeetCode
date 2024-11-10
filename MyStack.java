import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    int top;
    public MyStack() {
        queue1 =new LinkedList<>();
        queue2 =new LinkedList<>();
    }

    public void push(int x) {
        queue1.add(x);
    }

    public int pop() {
        if (empty()) {
            throw new RuntimeException("Stack is empty");
        }
        while(queue1.size()>1){
            queue2.add(queue1.poll());
        }
        int topElement = queue1.poll();
        Queue<Integer> temp =queue2;
        queue2 =queue1;
        queue1=temp;
        return topElement;
    }

    public int top() {
        if (empty()) {
            throw new RuntimeException("Stack is empty");
        }
        while(queue1.size()>1){
            queue2.add(queue1.poll());
        }
        int topElement = queue1.poll();
        queue2.add(topElement);
        Queue<Integer> temp =queue1;
        queue1 = queue2;
        queue2 = temp;
        return  topElement;
    }
//

    public boolean empty() {
        return queue1.isEmpty();
    }

    public static  void main(String[] args){
        MyStack stack = new MyStack();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Top Element: "+stack.top());
        System.out.println("Pop Element: "+stack.pop());
        System.out.println("Top Element: "+stack.top());
        System.out.println("Pop Element: "+stack.pop());
        System.out.println("Top Element: "+stack.top());
        System.out.println("Pop Element: "+stack.pop());
        System.out.println("Top Element: "+stack.top());
        System.out.println("Pop Element: "+stack.pop());
        System.out.println("Top Element: "+stack.top());

        System.out.println("Is stack empty? " + stack.empty());
    }
}
/*
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
