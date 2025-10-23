import java.util.Stack;

class IntegerStack {
    private Stack<Integer> stack = new Stack<>();

    public void pushElement(int element) {
        stack.push(element);
        System.out.println(element + " pushed to stack.");
    }

    public void popElement() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
        } else {
            System.out.println(stack.pop() + " popped from stack.");
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void displayStack() {
        System.out.println("Stack elements: " + stack);
    }

    // Test Q5
    public static void main(String[] args) {
        IntegerStack s = new IntegerStack();
        s.pushElement(10);
        s.pushElement(20);
        s.pushElement(30);
        s.displayStack();
        s.popElement();
        s.displayStack();
        System.out.println("Is stack empty? " + s.isEmpty());
        s.popElement();
        s.popElement();
        s.popElement(); // extra pop test
    }
}