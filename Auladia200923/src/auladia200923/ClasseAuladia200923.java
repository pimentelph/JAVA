/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package auladia200923;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author alunodev06
 */
public class ClasseAuladia200923 {
    
    Scanner teclado = new Scanner(System.in);
  
    Calendar cal = Calendar.getInstance();
    
    String nome;
    int idade, anonascimento, ano;
    float nota01, nota02, media;
    
    void adicionardados(){
        
        System.out.println("Insira os seguintes dados: ");
        System.out.println("Nome: "); nome = teclado.nextLine();
        System.out.println("Ano de nascimento: "); anonascimento = teclado.nextInt();
        System.out.println("Nota 1° Bimestre: "); nota01 = teclado.nextFloat();
        System.out.println("Nota 2° Bimestre: "); nota02 = teclado.nextFloat();
    }
    
    void calcularIdade(){
        //puxa o ano atual
        ano = cal.get(Calendar.YEAR);
        //calculando a idade
        idade = ano - anonascimento;
        
        System.out.println("Idade e de: " + idade + "!");
    }
    
    void calcularMedia(){
        media = (nota01 + nota02) / 2;
        System.out.println("Sua media e: " + media + "!");
    }
    
}
