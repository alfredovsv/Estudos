package exerciciosLeetCode.soluction;

public class SolutionLongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
       // Validação inicial baseada nas restrições
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // 1. Começamos assumindo que a primeira palavra inteira é o prefixo comum
        String prefixo = strs[0];
        
        // 2. Comparamos esse prefixo com cada uma das próximas palavras do array
        for (int i = 1; i < strs.length; i++) {
            
            // O método .indexOf(prefixo) retorna 0 se a palavra 'strs[i]' começar com o 'prefixo'.
            // Enquanto não retornar 0, significa que o prefixo ainda não serve para esta palavra.
            String ondeProcuro = strs[i];
            int localizou = ondeProcuro.indexOf(prefixo);
            while (localizou != 0) {
                
                // Cortamos a última letra do prefixo
                prefixo = prefixo.substring(0, prefixo.length() - 1);
                
                // Se o prefixo for reduzido a uma string vazia, não há prefixo comum
                if (prefixo.isEmpty()) {
                    return "";
                }
                localizou = ondeProcuro.indexOf(prefixo);
            }
        }
        
        return prefixo; 
    }
}
