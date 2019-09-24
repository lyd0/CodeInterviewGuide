import java.util.Stack;

public class MyStack2 {
    private Stack<Integer> stackData = new Stack<>();
    private Stack<Integer> stackMin = new Stack<>();

    public void push(int value) {
        stackData.push(value);
        if (stackMin.empty() || value<= getMin()) {
            stackMin.push(value);
        } else {
            stackMin.push(getMin());
        }

    }

    public Integer pop() {
        stackData.pop();
        return stackMin.pop();
    }

    private int getMin() {
        return stackMin.peek();
    }
    @Override
    public String toString() {
        return "MyStack2{" +
                "\tstackData=" + stackData +
                ", \t\t\tstackMin=" + stackMin +
                "\t}";
    }

    public static void main(String[] args) {
        MyStack2 myStack2 = new MyStack2();
        myStack2.push(1);
        myStack2.push(3);
        myStack2.push(2);
        myStack2.push(1);
        System.out.println(myStack2);
        System.out.println(myStack2.getMin());
        myStack2.pop();
        System.out.println(myStack2);
        myStack2.pop();
        System.out.println(myStack2);
        myStack2.pop();
        System.out.println(myStack2);
        myStack2.pop();
        System.out.println(myStack2);
    }
}
