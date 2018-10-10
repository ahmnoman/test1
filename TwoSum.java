// "static void main" must be defined in a public class.
//import java.lang.Object;
  //extended by org.apache.commons.lang.ArrayUtils
//import org.apache.commons.lang.ArrayUtils;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
     
        int[] numbers = {1,2,3,4,5};
        ArrayList<Integer> values = new ArrayList<>();
        for (int number:numbers){
            values.add(number);
        }
        //int[] arr = ArrayUtils.toPrimitive((Integer[])values.toArray());

        
        //int[] list = new int[]{1,2,3,4,5};
        /*String list = "1,2,3,4,5";
        String[] split = list.split(",");
        int[] integrList = new int[split.length];
        for (int i =0; i<integrList.length; i++ ){
            integrList[i] = Integer.valueOf(split[i]);
        System.out.println(integrList);
        }*/
        Solution solve = new Solution();
        //solve.twoSum(values,6);
       // int[] result = new int[]{};
       solve.twoSum(numbers, 6);
    
        System.out.println(Arrays.toString(numbers));
        System.out.println(new int[]{1,2,3,4,5});
        System.out.println(values);
       // System.out.println(Arrays.toString(result));

        //System.out.println("Test 2");
        //System.out.println(integrList);

    }
}

class Solution {
    public void twoSum(int[] nums, int target) {
        int count = 0;
        for (int i =0; i< nums.length; i++) {
            for (int j=i +1; j< nums.length; j++) {
                if (nums[j] == target - nums[i])
                           System.out.println("");

                    return new int[]{i,j};
                    count++;
                
               // System.out.println();
            }
            
        }
           throw new IllegalArgumentException ("No Soultion");       
    }
    
}