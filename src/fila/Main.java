
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
            System.out.println("[3] Chamar o proximo");
            System.out.println("[4] Sair");
            
            System.out.print("Escolha a opcao: ");
            int option = sc.nextInt();
            
            
            if(option == 1){
                System.out.print("Nome pessoa: ");
                String nome = sc.next();

                System.out.println("Nivel de Prioridade");
                System.out.println("[1] Padrão");
                System.out.println("[2] Gestante");
                System.out.println("[3] Idosos");
                System.out.println("[4] Etc");
                
                System.out.print("Escolha: ");
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
        } else if(option == 2){
            System.out.println("Saiu legal dog");
            }   
        }
    }
}