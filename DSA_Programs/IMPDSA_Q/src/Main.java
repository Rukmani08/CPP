//import java.util.HashMap;
//
//class DSA{
// static   public int[] twoSum(int[] nums, int target){
////        for(int i=0;i< nums.length-2;i++){
////            for(int j=i+1;j<nums.length-1;j++){
////                if(nums[i]+nums[j]==target){
////                    return ( new int[]{i, j});
////                }
////            }
////        }
////        return (new int[]{});
//
//
//
//     //Using Hashmap
//
//     HashMap<Integer,Integer> s=new HashMap<>();
//     for(int i=0;i<=nums.length-1;i++) {
//         int com=target=nums[i];
//         if(s.containsKey(com)){
//            return new int[]{s.get(com),i};
//         }
//         s.put(nums[i],i);
//     }
//
//return new int[]{ };
//
//
//    }
//
//    static void main(String[] args) {
//        int arr[]={1,3,2,5,5};
//        int target=10;
//       int res[]= twoSum(arr,target);
////       System.out.println(res[0]+" ,"+res[1]);
//        if(res.length==2){
//            System.out.println(res[0]+" ,"+res[1]);
//        }else {
//           System.out.println("No res");
//        }
//    }
//};




//Return the vowels from characters

//Hashmap print (important)---major use.

//class Vowels{
//
//
//
//    static String vowels(String str){
//
//    }
//    static void main() {
//        String str="Rukmani";
//
//    }
//}






//Variation 2:return maxSubarray







class maxSub{

    public int[] Max_array(int[] nums){
//        int MAXINT=-1; dont use not working if all are -ve value.
        int maxSum=Integer.MAX_VALUE;//for maxvalue imp
        int sum=nums[0];
        int start=0;
        int end=0;
        for(int i=start;i<=nums.length-1;i++){

            for(int j=i+1;j<nums.length-1;j++){

                sum+=nums[j];
                if(sum>MAXINT){
                    MAXINT=sum;
                    start=i;
                     end=j;
                }
            }


        }
    }

    static void main() {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};

    }
}



//1 stack /queue
//2 graph ,tree
//Linear/binary search






