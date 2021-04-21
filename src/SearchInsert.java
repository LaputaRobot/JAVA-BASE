public class SearchInsert {
    public static int searchInsert(int[] nums,int target){
        int index=0;
        while (index<nums.length){
            if(nums[index]>= target) return index;
            index++;
        }
        return index;
    }
    public static int searchInsert_Two(int[] nums,int target){
        if (target<nums[0]) return 0;
        int left=0,right=nums.length-1;
        while(left<right){
            if(nums[(left+right)/2]<target){
                left=(left+right)/2+1;
            }
            else {
                right=(left+right)/2-1;
            }
        }
        if(target==nums[left]) return left;
        else return (target>nums[left])?left+1:left;
    }
    public static void main(String[] args) {
        int[] nums= {1,3,5};
        int target=2;
        System.out.println(searchInsert_Two(nums,target));;
    }
}
