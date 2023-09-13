/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos.e.classes;
import java.util.Scanner;

/**
 *
 * @author ph024
 */
public class funcionario {
    
    int matricula;
    float salarioAtual;
    String nome, cargoAtual;
    
    Scanner teclado = new Scanner(System.in);
    
    void cadastrar(){
        System.out.println("CADASTRANDO FUNCIONARIO");
        System.out.println("Insira os dados a seguir: ");
        System.out.println("Nome:"); nome = teclado.nextLine();
        System.out.println("Cargo Atual:"); cargoAtual = teclado.nextLine();
        System.out.println("Matricula:"); matricula = teclado.nextInt();
        System.out.println("Salario Atual (Com virgula):"); salarioAtual = teclado.nextFloat();
    }
    
    void consultar(){
        System.out.println(nome);
        System.out.println(matricula);
        System.out.println(cargoAtual);
        System.out.println(salarioAtual);
    }
    
    void atualizarSalario(){
        float novoSalario;
        System.out.println("ATUALIZANDO SALARIO");
        System.out.println("Insira o novo salario de " + nome + " (Com virgula): "); novoSalario = teclado.nextFloat();
        System.out.println("O salario antigo de " + nome + " e R$" + salarioAtual + ". O salario novo e R$" + novoSalario);
    }
    
    void listarDependentes(String dependentes){
        System.out.println("Os dependentes " + nome + " sao: " + dependentes);
    }
    
    
}
