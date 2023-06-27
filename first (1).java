public class first {

public static void zero(int nums[]){
    for(int i=0; i<nums.length; i++){
        for(int j=i; j<nums.length-1; j++){
            if(nums[j] < 1){
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1]=temp;

            }
        }
    }
    for(int i=0; i<nums.length;i++){
        System.out.println(nums[i]);
    }
}
    

    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        zero(nums);
    }
}
