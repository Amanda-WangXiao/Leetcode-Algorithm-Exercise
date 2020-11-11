/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

class MinStack {

    /** initialize your data structure here. */
    int top=-1;
    int[] s = new int[10000];
    public MinStack() {
    }
    
    public void push(int x) {
        top++;
        s[top]=x;
    }
    
    public void pop() {
        s[top]=0;
        top--;
    }
    
    public int top() {
        return s[top];
    }
    
    public int getMin() {
        int result=s[top];
        for(int i=top;i>0;i--){
            result=result>s[i-1]?s[i-1]:result;
        }
        return result;
    }
}

