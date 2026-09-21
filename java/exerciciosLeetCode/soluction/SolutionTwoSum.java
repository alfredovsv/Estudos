package exerciciosLeetCode.soluction;

/*Dado um array de inteiros nums e um inteiro target, retorne os índices dos dois números de forma que a soma deles seja igual atarget .

Você pode assumir que cada entrada terá exatamente uma solução e que não poderá usar o mesmo elemento duas vezes.

Você pode retornar a resposta em qualquer ordem.

 

Exemplo 1:

Entrada: nums = [2,7,11,15], alvo = 9
 Saída: [0,1]
 Explicação: Como nums[0] + nums[1] == 9, retornamos [0, 1].
Exemplo 2:

Entrada: nums = [3,2,4], alvo = 6
 Saída: [1,2]
Exemplo 3:

Entrada: nums = [3,3], alvo = 6
 Saída: [0,1]
 

Restrições:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Só existe uma resposta válida.
 

Pergunta complementar:  Você consegue pensar em um algoritmo com complexidade de tempo menor que O(n)?O(n2)  */

public class SolutionTwoSum {
     public int[] twoSum(int[] nums, int target) {
        //Declara vaviáveis
        //int y = 0;
        //int soma = 0;
        int[] retorno = new int[2];
        //Entendi que pode 02 indices aleatórios
        for(int i = 0; i < nums.length; i++){

            //Corre o array de novo para fazer as somas e validas
            for(int y = 0; y < nums.length; y++){
                //Não executa soma quanto fo o mesmo index
                if (i == y)
                    continue;
                if (nums[i] + nums [y] == target){
                    retorno[0] = i;
                    retorno[1] = y;
                    return retorno;
                }
                
                
            }
        }

        return retorno;
        
    }
}
