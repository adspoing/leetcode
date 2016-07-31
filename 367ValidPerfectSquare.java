public class Solution {
    public boolean isPerfectSquare(int num) {
        int left=1;
        int right=(num/2)+1;
        while(left<=right){
            int mid=(left+right)/2;
            int mul=mid*mid;
            if(mul==num)    return true;
            else if(mul>num) right=mid-1;
            else left=mid+1;
        }
        return false;
    }
}