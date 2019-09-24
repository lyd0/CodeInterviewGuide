import java.util.Stack;

public class MyStack1 {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MyStack1(Stack<Integer> stackData, Stack<Integer> stackMin) {
        this.stackData = stackData;
        this.stackMin = stackMin;
    }

    public MyStack1() {
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    public void push(int value) {
        stackData.push(value);
        if(stackMin.empty() || value <= getMin()) {
            stackMin.push(value);
        }
    }

    public int pop() {
        int value = stackData.pop();
        if(value == getMin()) {
            stackMin.pop();
        }
        return value;
    }

    public int getMin() {
        return this.stackMin.peek();
    }

    @Override
    public String toString() {
        return "MyStack1{" +
                "\tstackData=" + stackData +
                ", \t\t\tstackMin=" + stackMin +
                "\t}";
    }

    public static void main(String[] args) {
        MyStack1 myStack1 = new MyStack1();
        myStack1.push(1);
        myStack1.push(3);
        myStack1.push(2);
        myStack1.push(1);
        System.out.println(myStack1);
        System.out.println(myStack1.getMin());
        myStack1.pop();
        System.out.println(myStack1);
        myStack1.pop();
        System.out.println(myStack1);
        myStack1.pop();
        System.out.println(myStack1);
        myStack1.pop();
        System.out.println(myStack1);
    }
}
