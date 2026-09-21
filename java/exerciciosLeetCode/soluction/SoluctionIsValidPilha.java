package exerciciosLeetCode.soluction;

/* Dada uma string scontendo apenas os caracteres '(', ')', '{', '}', '['e ']', determine se a string de entrada é válida.

Uma sequência de entrada é válida se:

Os colchetes abertos devem ser fechados pelo mesmo tipo de colchetes.
Os colchetes abertos devem ser fechados na ordem correta.
Cada parêntese fechado tem um parêntese aberto correspondente do mesmo tipo.
 

Exemplo 1:

Entrada: s = "()"

Saída: verdadeiro

Exemplo 2:

Entrada: s = "()[]{}"

Saída: verdadeiro

Exemplo 3:

Entrada: s = "(]"

Saída: falso

Exemplo 4:

Entrada: s = "([])"

Saída: verdadeiro

Exemplo 5:

Entrada: s = "([)]"

Saída: falso

 

Restrições:

1 <= s.length <= 104
sconsiste apenas em parênteses '()[]{}'. */

public class SoluctionIsValidPilha {
    public boolean isValid(String s) {
        char [] pilha = new char[s.length()];
        int topo = 0;

        for (int i = 0; i < s.length(); i++){
            char c =  s.charAt(i);
            
            if(c =='('){
                pilha[topo] = ')';
                topo++;
            }else if(c == '{'){
                pilha[topo] = '}';
                topo++;
            }else if (c =='['){
                pilha[topo] = ']';
                topo++;
            }else{//Se não for acima esta fechando
                if (topo == 0 || c != pilha[topo - 1] ){  
                    return false;
                }
                pilha[topo-1] = '\0';
                topo--;
            }
               
            
        }
        return topo == 0; //Se tiver pilha errado, se zerou a pila ok
    }
}
