class Solution {
    public int findNumbers(int[] nums) {
        int l=0;
        for(int i=0;i<nums.length;i++)
        {
            int m=nums[i];
            int j=0;
            while(m > 0)
            {
                m=m/10;
                j++;
            }
            if(j % 2 ==0)
            {
                System.out.println(nums[i] + " contains even number of digits");
                l++;
            }
        }
    return l;
        }
}