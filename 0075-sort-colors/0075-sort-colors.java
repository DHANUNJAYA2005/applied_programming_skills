class Solution {
    public void sortColors(int[] nums) {
       /* Arrays.sort(nums);
        System.out.print(nums);*/
        int n=nums.length;
        int count[]=new int [3];
        for(int i=0;i<n;i++){
            count[nums[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
           nums[j]=i;
           j++;
           count[i]--;
            }
        }
        
    }
}