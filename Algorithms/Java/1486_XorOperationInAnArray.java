class Solution {    //  0 ms    35.4 MB
    public int xorOperation(int n, int start) {
        if(n==1) return start;
        int xor = start;
        for(int i=1;i<n;i++){
            xor = xor^(start + 2*i);
        }
        return xor;
    }
}