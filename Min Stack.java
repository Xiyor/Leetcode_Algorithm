class MinStack {
    ArrayList<Integer> l=new ArrayList<Integer>();
    int min;
    public void push(int x) {
        if(l.isEmpty())
        {
            l.add(x);
            min=x;
        }
        else
        {
            l.add(x);
            min=min<x?min:x;
        }
    }

    public void pop() {
        int x=l.remove(l.size()-1);
        if(x==min)
        {
            min=Integer.MAX_VALUE;
            for(int i=0;i<l.size();i++)
            {
                min=Math.min(min,l.get(i));
            }
        }
    }

    public int top() {
        return l.get(l.size()-1);
    }

    public int getMin() {
        return min;
    }
}
