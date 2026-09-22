class MyStack {
    Queue<Integer> input;
    Queue<Integer> output;

    public MyStack() {
        input = new ArrayDeque<>();
        output = new ArrayDeque<>();
    }
    
    public void push(int x) {
        input.offer(x);
    }
    
    public int pop() {
        while(input.size()>1){
            output.offer(input.poll());
        }
        int val = input.poll();

        Queue<Integer> temp = input;
        input = output;
        output = temp;
        
        return val;
    }
    
    public int top() {
        while(input.size()>1){
            output.offer(input.poll());
        }
        int val = input.poll();
        output.offer(val);

        Queue<Integer> temp = input;
        input = output;
        output = temp;
        
        return val;
    }
    
    public boolean empty() {
        return input.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */