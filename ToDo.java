import java.util.Scanner;
import java.util.ArrayList;

public class ToDo {
    public static void main(String args[]) {
      Scanner acaoScan = new Scanner(System.in);
      Scanner taskScan = new Scanner(System.in);
      ArrayList<String> myArr = new ArrayList<String>();
      int acao = 3;
      
      while( acao != 0 ) {
        System.out.println("\n-------------------------------------------------------------------------------");
        System.out.println("Lista To Do:");
        for (int i = 0; i < myArr.size() ; i++) {
            System.out.println((i+1)+" - "+myArr.get(i));
        }
        
        System.out.println("\nDigite a operacao que deseja ( 1 - Adicionar | 2 - Excluir | 0 - Fechar lista )");
        acao = acaoScan.nextInt();
        
        if(acao == 1) {
            System.out.println("\nDigite a tarefa que deseja adicionar:");
            String tarefa = taskScan.nextLine();
            myArr.add(tarefa);
        }
        
        if(acao == 2) {
            if(myArr.size() == 0){ System.out.println("\nA lista esta vazia!"); }
            else{
                System.out.println("\nQual tarefa deseja excluir? Informe o codigo da tarefa.");
                int tarefa = taskScan.nextInt();
                myArr.remove((tarefa-1));
            }
        }
      }
    }
}