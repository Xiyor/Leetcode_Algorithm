class MyQueue {
    Stack<Integer> s=new Stack<Integer>();
    List<Integer> temp=new ArrayList<Integer>();
    // Push element x to the back of queue.
    public void push(int x) {
        while(!s.isEmpty())
        {
            temp.add(s.pop());
        }
        s.push(x);
        for(int i=temp.size()-1;i>=0;i--)
        {
            s.push(temp.get(i));
        }
        temp.clear();
    }

    // Removes the element from in front of queue.
    public void pop() {
        s.pop();
    }

    // Get the front element.
    public int peek() {
        return s.peek();          
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return s.isEmpty();
    }
}