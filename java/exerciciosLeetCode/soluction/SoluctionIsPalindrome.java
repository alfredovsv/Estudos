package exerciciosLeetCode.soluction;

public class SoluctionIsPalindrome{
    public boolean isPalindrome(int x) {
        // //Primeira forma
        // //Converte o x para string
        // String xText = Integer.toString(x);
        // String xTextReverse = new StringBuilder(xText).reverse().toString();

        // if (xText.equals(xTextReverse))
        //     return true;
        // else
        //     return false;

        String xText = Integer.toString(x);
        int fim = xText.length()-1;
        boolean isPalindrome = true;

        //Pecorrer a string
        for (int i = 0; i < xText.length()/2 ; i++){
            char charIni = xText.charAt(i);
            char charFim = xText.charAt(fim);

            if (charIni  != charFim){
                isPalindrome = false;
                break;
            }
            fim--;
        }

        return isPalindrome;
        
    }
}