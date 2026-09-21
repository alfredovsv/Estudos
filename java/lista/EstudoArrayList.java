import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
//import java.util.List;

public class EstudoArrayList {

    public static void main(String[] args){ 

        System.out.println("----TESTEs-----");

        //Testando ArrayList
        // System.out.println("Testes ArrayList");
        // testesArrayList();
        //testeArray2();

        //Testanto LinkedList
        System.out.println("Testando LinkedList");
        //testesLinkedList();
       
    }

    public static void testesArrayList (){

        ArrayList<Integer> numeros = new ArrayList<>();

        //Adicionando casos
        numeros.add(20);
        numeros.add(1);

        //Adicionado na posição
        numeros.add(0, 3);

        //Adicionando vários elementos
        //numeros.addAll()

        //Acessando elementos
        System.out.println("O número na posiçaão 0 " + numeros.get(0));

        //Setando o a posição, lembra que ela tem que existir
        numeros.set(2,10);

        //Testanto remover, a posição tem que existir
        numeros.add(40);
        numeros.remove(0);

        //Tamanho da lista
        System.out.println("O tamanho da lista é " + numeros.size());

        //Pecorrendo a lista com for normal
        System.out.println("Pecorrendo o array com for normal");
        for (int i = 0; i < numeros.size(); i++){

            System.out.println("O número na posição "+ i + " = " + numeros.get(i));

        }

        //Pecorrendo com foreach
        System.out.println("Pecorrendo com forech");
        for (Integer num : numeros){
            System.out.println("O index é " + num + " o a value é " );
        }

        //Ordenar uma array
        System.out.println("Ordenar o array de inteiro, usando Collections.sort");
        Collections.sort(numeros); //ela altera o próprio array


        System.out.println(numeros);
        
    }

    public static void testeArray2(){
        ArrayList<Integer> cars = new ArrayList<>();
        cars.add(3);
        cars.add(20);
        cars.add(2);
        cars.add(3);
        for (Integer i : cars) {
            System.out.println(i);
        }
    }

    //Tetanto listas encadeads em java
    public static void testesLinkedList(){
        LinkedList<String> lista = new LinkedList<>();

        lista.add("Vieira");
        lista.add("Alfredo");

        //Tentando correr o com for normal
        System.out.println("Correndo uma LinkedList com for normal");
        for (int i = 0; i < lista.size(); i++){
            System.out.println("O valor de no index "+ i + " = " + lista.get(i));
        }   

        Collections.sort(lista);
        //Correndo com forech
        System.out.println("Correndo o LinkedList com foreach");
        for (String item : lista){
            System.out.println("O valor do item " + item);
        }

        System.out.println(lista);
    }

}
