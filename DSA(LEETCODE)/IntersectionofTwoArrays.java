import java.util.ArrayList;
import java.util.Array;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] > nums2[j]){
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                ans.add(nums1[i]);
                i++;
                j++;
            }
        }

        int  k = 0;
        for(int l =1;l < ans.size(); l++){
            if(!ans.get(k).equals(ans.get(l))){
                k++;
                ans.set(k,ans.get(l));
            }
        }
        while(ans.size() > k+1){
            ans.remove(ans.size()-1);
        }

        int [] temp = new int[ans.size()];
        int x = 0;
        for(int m = 0;m < ans.size();m++){
            temp[x++] = ans.get(m);
        }

        return temp;
        
        
    }
} 
