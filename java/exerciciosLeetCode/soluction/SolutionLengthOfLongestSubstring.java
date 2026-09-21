package exerciciosLeetCode.soluction;


public class SolutionLengthOfLongestSubstring {
    public SolutionLengthOfLongestSubstring(){
        
    }
    public int lengthOfLongestSubstring(String s) {
        //s = "eea";
        char letra;
        int index = 0, qteSeq = 0;
        int countSeq = 0;
        String letrasLidas = "";

        for (int i = 0; i < s.length(); i++){
            letra = s.charAt(i);
            //para quando acha a mesma letra
            //if(s.charAt(i) == letra){
            if(letrasLidas.indexOf(letra) != -1){
                index++;//muda a letra para proxima
                //letra = s.charAt(index);//muda a letra

                //Verifica se a contagem é maior que a armazenada
                if(countSeq > qteSeq){
                    qteSeq = countSeq;
                }

                i = index-1; //pois tem que contar de novo
                countSeq = 0; //Zera o contador

                //limpa letra e letras lidas;\
                letrasLidas = "";
                letra = '\0';
                
            }
            letrasLidas = letrasLidas + letra;
            if (letra != '\0')
                countSeq++;

        }
        
        //trata quanto apenas um
        if(countSeq > qteSeq)
            qteSeq = countSeq;

        return qteSeq;
    }

}