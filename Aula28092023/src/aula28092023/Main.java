package aula28092023;

public class Main {

    public static void main(String[] args) {
        
        Dependente d1 = new Dependente();
        d1.nome = "Juliana";
        d1.idade = 9;
        
        Dependente d2 = new Dependente();
        d2.nome = "Ricardo";
        d2.idade = 12;
        
        Socio s1 = new Socio();
        s1.nome = "Pedro";
        s1.id = 1001;
        
        s1.inserirDependente(d1);
        s1.inserirDependente(d2);
        
        System.out.println(s1.buscar(d2).nome);
        
        
    }
    
}
