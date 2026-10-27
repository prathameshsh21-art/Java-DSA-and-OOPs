public static int  MissingNumberInAnArray(int [] nums){
    int numsSum = 0;
    int n = nums.length+1;
    int expectedSum = n*(n+1);
    expectedSum = expectedSum/2;
    for(int i=0; i<= n-2; i++){
        numsSum = numsSum + nums[i];
    }
    int missingNumber = expectedSum - numsSum;
    return missingNumber;

}
void main(){
    int [] nums = {1,2,3,5,6};
    int result = MissingNumberInAnArray(nums);
    IO.println(result);;

}
