package exerciciosLeetCode.soluction;

public class SolutionRemoveElement {
    public int removeElement(int[] nums, int val) {

        int j = 0; //Segundo ponteiro
        int tam = nums.length;
        for (int i = 0; i < tam; i++){
            //Puxa apenas se difrente de val
            if(nums[i] != val){                
                nums[j] = nums[i]; //puxa
                j++;//vou contando e avancando
            }

        }

        //lembre ele quer a quantidade que ficou
        return j;
        
    }
}
