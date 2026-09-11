class Solution {
    public void rotate(int[] nums, int k) {

        k = k % nums.length;
        
        int n = nums.length -1;
        int [] temp = new int[k] ;
        int x =0;

        for(int i= n-k+1; i <= n ; i++){
            temp[x++] = nums[i];
        }

        for(int j = n-k; j >= 0 ;j--){
            nums[j+k] = nums[j];
        }

        for(int l = 0; l< k;l++){
            nums[l] = temp[l];
        }
        
    }
}
