/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package auladia200923;
import java.util.Scanner;

/**
 *
 * @author alunodev06
 */
public class Auladia200923 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String resposta;
        
        System.out.println("BEM VINDO AO CADASTRO DE ALUNOS!");
        System.out.println("Quer cadastrar um aluno?(Digite 'sim' ou 'nao'): "); resposta = teclado.nextLine();
        
        if(resposta.equals("sim") || resposta.equals("nao")){
            System.out.println("ERRO! ERRO! DIGITE UMA RESPOSRA VALIDA");   
        } else if(resposta.equals("nao")){
            System.out.println("MUITO OBRIGADO, TENHA UM ÓTIMO DIA!");
        } else{
            ClasseAuladia200923 aluno1 = new ClasseAuladia200923();
            aluno1.adicionardados();
            aluno1.calcularIdade();
            aluno1.calcularMedia();
        }
        
        
        
    }
    
}
