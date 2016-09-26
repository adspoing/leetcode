public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(n == 0){
            return res;
        }
        compute(k, n, 0, new ArrayList<Integer>(), res);
        return res;
    }
    
    public void compute(int k, int n, int sum, List<Integer> list, List<List<Integer>> res){
        if(sum > n){
            return;
        }else if(sum == n){
            if(list.size() < k){
                return;
            }else{
                res.add(new ArrayList<Integer>(list));
            }
        }else{
            if(list.size() == k){
                return;
            }
            for(int index = (list.size() > 0 ? list.get(list.size() - 1) + 1 : 1); index < 10; index++){
                if(sum + index <= n){
                    list.add(index);
                    sum = sum + index;
                    compute(k, n, sum, list, res);
                    list.remove(list.size() - 1);
                    sum = sum - index;
                }
            }
        }
    }   
}