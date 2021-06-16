class Solution {    //  0 ms    35.8 MB
    public boolean stoneGame(int[] piles) {
        int count_positive_1 = 0;
        int count_positive_2 = 0;
        for(int i=0;i<piles.length;i++){
            if(i%2==0) count_positive_1=count_positive_1+piles[i];
            else count_positive_2=count_positive_2+piles[i];
        }

        int count_negative_1 = 0;
        int count_negative_2 = 0;
        for(int i=piles.length-1;i>=0;i--){
            if(i%2!=0) count_negative_1=count_negative_1+piles[i];
            else count_negative_2=count_negative_2+piles[i];
        }

        if(count_positive_1>count_positive_2||count_negative_1>count_negative_2) return true;
        return false;
    }
}