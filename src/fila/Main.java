
package fila;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Fila<String> preferencial = new Fila<String>();
        Fila<String> normal = new Fila<String>();
        Scanner sc = new Scanner(System.in);
        
        Boolean FilaAtiva = true;
        
        
        
        
        while(FilaAtiva == true) {
            System.out.println("[1] Adicionar a fila");
            System.out.println("[2] Mostrar fila");
            System.out.println("[3] Chamar o próximo");
            System.out.println("[4] Sair");
            int option = sc.nextInt();
            
            
                        System.out.print("Nome pessoa: ");
                        String nome = sc.next();

                        System.out.println("Nivel prioridade [1] Gestante | [2] Idosos | [3] Etc");
                        int prioridade = sc.nextInt();

                        if(prioridade == 1){
                            nome = (nome + "[Gestante]");
                            preferencial.enfileira(nome);
                        }

                        else if(prioridade == 2){
                            nome = (nome + "[Idosos]");
                            preferencial.enfileira(nome);
                        }

                        else if(prioridade == 3){
                            nome = (nome + "[Etc]");
                            preferencial.enfileira(nome);
                        }

                        else{
                            nome = (nome + "[Normal]");
                            normal.enfileira(nome);
                        }
        
        }
    }
}