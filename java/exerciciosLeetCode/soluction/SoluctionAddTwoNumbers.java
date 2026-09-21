package exerciciosLeetCode.soluction;

//import exerciciosLeetCode.soluction.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class SoluctionAddTwoNumbers {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int resto = 0, operando1 = 0, operando2 = 0, soma = 0;
        ListNode retorno = new ListNode();
        ListNode result = retorno;

        while (l1 != null || l2 != null){
            
            //Quando nó for null
            operando1 = l1 != null ? l1.val : 0;
            operando2 = l2 != null ? l2.val : 0;

            //Soma
            soma = operando1 + operando2 + resto;

            //zera o resto
            resto = 0;

            //Valida resto
            if (soma >= 10){
                resto = 1;
                soma = soma - 10;
            }
            
            result.next = new ListNode(soma);
            result = result.next;
            
            
            
            //vai para o próximo nó apenas se next not null, ou seja se tem outro nó
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        if (resto > 0)
             result.next = new ListNode(resto);
        

        return retorno.next;
       
    }
}

// public class soluctionAddTwoNumbers {
//     /**
//      * Definition for singly-linked list.
//      * public class ListNode {
//      * int val;
//      * ListNode next;
//      * ListNode() {}
//      * ListNode(int val) { this.val = val; }
//      * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//      * }
//      */

//     public int getTamanho(ListNode head) {
//         int tamanho = 0;

//         while (head != null) {
//             tamanho++;
//             head = head.next;
//         }
//         return tamanho;
//     }

//     public int getValue(ListNode head, int i) {
//         int index = 0;
//         while (head != null) {
//             if (index == i)
//                 return head.val;
//             head = head.next;
//         }

//         return 0;
//     }

//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         int i = 0;
//         ListNode result = new ListNode();
//         ListNode lMaior;
//         ListNode lMenor;
//         int soma;
//         int resto = 0;

//         // Valida o tamanho das listas para garantir a soma
//         // if(l1.size() > l2.size()){
//         if (this.getTamanho(l1) >= this.getTamanho(l2)) {
//             lMaior = l1;
//             lMenor = l2;
//         } else {
//             lMaior = l2;
//             lMenor = l1;
//         }

//         // for (ListNode item : lMaior){
//         ListNode atual = lMaior;
//         while (atual != null) {
//             // Zera a soma
//             soma = 0;

//             // Garante a soma de todos os nós
//             // if (i < lMenor.size())
//             if (i < this.getTamanho(lMenor))
//                 soma = atual.val + this.getValue(lMenor, i) + resto;
//             else
//                 soma = atual.val + resto;

//             // Após soma zera o resto
//             resto = 0;

//             // Valida o resto
//             if (soma >= 10) {
//                 resto = 1;
//                 result.next = new ListNode(soma - 10);
//             } else {
//                 result.next = new ListNode(soma);
//             }

//             i++;
//             atual = atual.next;
//         }

//         if (resto > 0)
//             result.next = new ListNode(resto);

//         return result;

//     }

// }
