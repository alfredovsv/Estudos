import java.lang.reflect.Method;
import java.util.ArrayList;;

public class EstudoReflect{

    public static void main (String[] args){
        // Obtém a classe do ArrayList
        Class<?> classeArrayList = ArrayList.class;

        // Pega todos os métodos públicos disponíveis nela
        Method[] metodos = classeArrayList.getMethods();

        System.out.println("--- MÉTODOS DISPONÍVEIS NO ARRAYLIST ---");
        
        for (Method metodo : metodos) {
            // Exibe o tipo de retorno e o nome do método
            System.out.println(metodo.getReturnType().getSimpleName() + " " + metodo.getName());
        }
        
        System.out.println("\nTotal de métodos encontrados: " + metodos.length);
    }
}