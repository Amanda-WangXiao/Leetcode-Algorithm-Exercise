class Solution {    //  Time Limit Exceeded
    public boolean judgeSquareSum(int c) {
        for(int a=0;a<=(c/2);a++){
            double b = Math.sqrt(c-a*a);
            if(b==(int)b) return true;
        }
        return false;
    }
}

class Solution {    //  4 ms    35.4 MB
    public boolean judgeSquareSum(int c) {
        int a = 0;
        int b = (int)Math.sqrt(c);
        while(a<=b){
            if(a*a+b*b==c) return true;
            else if(a*a+b*b<c) a++;
            else b--;
        }
        return false;
    }
}