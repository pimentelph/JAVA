/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objetos.e.classes;
import java.util.Scanner;

/**
 *
 * @author ph024
 */
public class ObjetosEClasses {

    public static void main(String[] args) {
        
        funcionario f1 = new funcionario();
        f1.cadastrar();
        
        funcionario f2 = new funcionario();
        f2.cadastrar();
        
        f1.consultar();
        f2.consultar();
        
        f1.atualizarSalario();
        
        f2.listarDependentes("Credil, Plênia, Jeronimo, Calcio");
        
        
 
        
        
        
        
    }
    
}
