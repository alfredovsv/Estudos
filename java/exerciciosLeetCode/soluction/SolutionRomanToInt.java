package exerciciosLeetCode.soluction;

//import java.util.HashMap;
//import java.util.Map;

public class SolutionRomanToInt {
    public int romanToInt(String s) {
        String [] arrS = s.split("");
        int soma = 0;
        
        for (int i = 0; i < arrS.length; i++){
            String prox = (i + 1 < arrS.length) ? arrS[i+1] : "";
            //soma normal
            switch (arrS[i]){
                case "I":
                    //I pode ser colocado antes de V(5) e X(10) para formar 4 e 9. 
                    if(prox.equals("V")){
                        soma += 4;
                        i++; //pula o proximo
                    }else if(prox.equals("X")){
                        soma += 9;
                        i++; //pula o proximo
                    }else{
                        soma += 1;
                    } 
                    break;
                case "V":
                    soma += 5;
                    break;
                case "X":
                    //X pode ser colocado antes de L(50) e C(100) para formar 40 e 90. 
                    if(prox.equals("L")){
                        soma += 40;
                        i++; //pula o proximo
                    }else if(prox.equals("C")){
                        soma += 90;
                        i++; //pula o proximo
                    }else {
                        soma += 10;
                    }
                    break;
                case "L":
                    soma += 50;
                    break;
                case "C":
                    //C pode ser colocado antes de D(500) e M(1000) para formar 400 e 900
                    if(prox.equals("D")){
                        soma += 400;
                        i++; //pula para o proximo
                    }else if(prox.equals("M")){
                        soma += 900;
                        i++; //pula para o proximo
                    }else{
                        soma += 100;
                    }
                    break;
                case "D":
                    soma += 500;
                    break;
                case "M":
                    soma +=1000;
                    break;
                default:
                    break;
            }
        }

        return soma;

        //// 1. Criamos um mapa para guardar o valor de cada letra romana
        // Map<Character, Integer> romano = new HashMap<>();
        // romano.put('I', 1);
        // romano.put('V', 5);
        // romano.put('X', 10);
        // romano.put('L', 50);
        // romano.put('C', 100);
        // romano.put('D', 500);
        // romano.put('M', 1000);
        
        // int soma = 0;
        // int ultimoValor = 0; // Guarda o valor do caractere que veio antes (à direita)

        // // 2. Percorremos a string de trás para frente
        // for (int i = s.length() - 1; i >= 0; i--) {
        //     int valorAtual = romano.get(s.charAt(i));

        //     // Se o valor atual for menor que o último processado, subtrai
        //     if (valorAtual < ultimoValor) {
        //         soma -= valorAtual;
        //     } else {
        //         // Caso contrário, soma normalmente
        //         soma += valorAtual;
        //     }

        //     // Atualiza o último valor para a próxima verificação
        //     ultimoValor = valorAtual;
        // }

        // return soma;
    }
}
