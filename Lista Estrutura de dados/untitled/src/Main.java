import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main{
    public static void main(String[] args) {
      ArrayList<clientes> clientes = new ArrayList<>();

      System.out.println("Lista inicial");

      clientes.add(new clientes(12,"Pedro","54996403132",21));
      clientes.add(new clientes(13,"Marcos","5499654132",31));
      clientes.add(new clientes(14,"Bruno","5499651132",25));

        for (clientes c : clientes){
            System.out.println(c);
        }

      //insere na primeira pocisao:
        clientes.add(0,(new clientes (15,"Adri","54996407155",20)));
        System.out.println("Insercao na primeira pocisao");
        for (clientes c : clientes){
            System.out.println(c);
        }
      //remove o terceiro da lista:
      clientes.remove(2);
      //reverter os elementos de um ArrayList de clientes
      Collections.reverse(clientes);  //nao funcionou
      System.out.println("Remove na terceira pocisao e depois reverte");
      for (clientes c : clientes){
          System.out.println(c);
      }
    System.out.println("---------");
      //copiar um arraylist de clientes para outro
        System.out.println("Copia os elementos de uma lista para outra");
        ArrayList<clientes> clientesCopia = new ArrayList<>();
        clientesCopia.addAll(clientes);
        for (clientes c : clientesCopia){
            System.out.println(c);
        }
        System.out.println("---------");

        //ordenar o ArrayList de clientes pelo nome
        System.out.println("Ordena os nomes");
        clientes.sort((c1, c2) -> c1.getNome().compareTo(c2.getNome()));
        for (clientes c : clientes){
            System.out.println(c);
        }
        System.out.println("---------");
        //randomizar os elementos de um ArrayList de clientes
        System.out.println("Randomiza os nomes");
        Collections.shuffle(clientesCopia);
        for (clientes c : clientesCopia){
            System.out.println(c);
        }
        System.out.println("---------");
        //recupere o maior e o menor elemento de um ArrayList de inteiros exibindo na tela
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(1);
        numeros.add(10);

        System.out.println(Collections.max(numeros));
        System.out.println(Collections.min(numeros));
        System.out.println("-------------");
        //recupere a posição de um objeto (Cliente) em um ArrayLists
        System.out.println("recupere a posição de um objeto"); // configurar equals na classe clientes
        clientes busca = new clientes(12,"Pedro","54996403132",21);
        int poscisao = clientes.indexOf(busca);
        System.out.println(poscisao);
        System.out.println("-------------");
        //média de idade dos elementos de um ArrayList de clientes
        System.out.println("Media de idade");
        double mediaIdade = 0;
        for (clientes c : clientes){
           mediaIdade += c.getIdade();
        }
        mediaIdade = mediaIdade/ clientes.size();
        System.out.println(mediaIdade);
        System.out.println("-------------");



    }
}