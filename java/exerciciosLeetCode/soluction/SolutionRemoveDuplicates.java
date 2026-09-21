package exerciciosLeetCode.soluction;

public class SolutionRemoveDuplicates {
    public int removeDuplicates(int[] nums) {

        //não sei se pode vir zero a lista
        if(nums == null || nums.length == 0)
            return 0;

        int j = 0;

        for (int i = 1; i < nums.length; i++){
            
            if(nums[j] != nums[i]){
                j++;
                nums[j] = nums[i];
            }

        }

        return j + 1;
        //ERRADO ABAIXO, não pode criar um novo array
        // int [] numOrd = new int[nums.length];

        // //Inica a lista
        // numOrd[0] = nums[0];
        // int k =1; // ate ordenada

        // for (int i = 1; i < nums.length; i++){
           
        //     //Vamos colocar no array novo somente se for diferente
        //     if (nums[i] != numOrd[k-1]){ 
        //         numOrd[k] = nums[i];
        //         k++;
        //     }   

        // }

        // return k;

        
        
    }
}
