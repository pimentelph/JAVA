package aula28092023;

import java.util.List;
import java.util.ArrayList;


public class Socio {
    
    String nome;
    int id;
    
    List<Dependente> listad;

    public Socio() {
        listad = new ArrayList<>();
    }
    
    void inserirDependente (Dependente d){
        listad.add(d);
    }
    
    Dependente buscar (Dependente d){
        return listad.get(listad.indexOf(d));
        
    }
    
    
    
}
