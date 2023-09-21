package auladia200923;
import java.util.Scanner;

public class Auladia200923 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String resposta;
        
        ClasseAluno aluno1 = new ClasseAluno();
        ClasseAluno aluno2 = new ClasseAluno();
        ClasseDisciplina disc01 = new ClasseDisciplina("POO", 80);
        
        
        System.out.println("BEM VINDO AO CADASTRO DE ALUNOS!");
        System.out.println("Quer cadastrar um aluno?(Digite 'sim' ou 'nao'): "); resposta = teclado.nextLine();
        
        if(!resposta.equals("sim") && !resposta.equals("nao")){
            System.out.println("ERRO! ERRO! DIGITE UMA RESPOSRA VALIDA");   
        } else if(resposta.equals("nao")){
            System.out.println("MUITO OBRIGADO, TENHA UM ÓTIMO DIA!");
        } else{
            aluno1.adicionardados();
            aluno1.calcularIdade();
            aluno1.calcularMedia();
            aluno2.disciplina = disc01;
            System.out.println("A matéria que o Aluno 2 faz é " + aluno2.disciplina.nomedisciplina + " que tem " + aluno2.disciplina.cargahoraria + " Horas");
            
        }
        
        
        
    }
    
}