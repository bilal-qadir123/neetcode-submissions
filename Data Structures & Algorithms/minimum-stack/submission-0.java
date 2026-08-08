class MinStack {
    public Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        int minimum = Integer.MAX_VALUE;
        
        for (int i = 0; i < stack.size(); i++) {
            if (stack.peek() < minimum) {
                minimum = stack.get(i);
            }
        }
        return minimum;
    }
}
