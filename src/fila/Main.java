
package fila;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Fila<String> preferencial = new Fila<String>();
        Fila<String> normal = new Fila<String>();
        Scanner sc = new Scanner(System.in);
        
        Boolean FilaAtiva = true;
        
        
        
        
        int filaPreferencial = 0;
        int filaPadrao = 3;
        
        
        while(FilaAtiva == true) {
            System.out.println("[1] Adicionar a fila");
            System.out.println("[2] Mostrar fila");
            System.out.println("[3] Chamar o proximo");
            System.out.println("[4] Sair");
            System.out.print("Escolha a opcao: ");
            int option = sc.nextInt();
            System.out.println(" ");
            
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
                System.out.println(" ");
                

                if(prioridade == 1){
                    nome = (nome + "[Normal]");
                    normal.enfileira(nome);
                }
                
                
                else if(prioridade == 2){
                    nome = (nome + "[Gestante]");
                    preferencial.enfileira(nome);
                }

                else if(prioridade == 3){
                    nome = (nome + "[Idosos]");
                    preferencial.enfileira(nome);
                }

                else if(prioridade == 4){
                    nome = (nome + "[Etc]");
                    preferencial.enfileira(nome);
                }

                else{
                    System.out.println("Fila invalida!");
                }
        } 
            
            else if(option == 2){
            System.out.println("[Fila Preferencial]");
            
            for(int i = 0; i < preferencial.tamanho; i++ ){
                System.out.println("["+(i+1)+"]"+preferencial.get(i));
            }
            System.out.println("");
            
            
            System.out.println("[Fila Padrao]");
            
            for(int i = 0; i < normal.tamanho; i++ ){
                System.out.println("["+(i+1)+"]"+normal.get(i));
            }
            System.out.println("");
            } 
            else if(option == 3){
                if(filaPreferencial != filaPadrao){
                    String atendido = preferencial.desenfileira();
                    System.out.println("Atendido (Preferencial): " + atendido);
                    filaPreferencial++;
                } 
                
                else {
                    String atendido = normal.desenfileira();
                    System.out.println("Atendido (Padrao): " + atendido);
                    filaPadrao = filaPadrao + 3;
                }
            }
            else if(option == 4){
                System.out.println("Encerrando...");
                FilaAtiva = false;
            }
        }
    }
}