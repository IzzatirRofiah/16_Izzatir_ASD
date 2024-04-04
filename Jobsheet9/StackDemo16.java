public class StackDemo16 {
    public static void main(String[] args) {
        Stack16 stack = new Stack16(10);
        stack.push(8);
        stack.push(12);
        stack.push(18);
        stack.print();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.push(-5);
        stack.print();
    }
}
