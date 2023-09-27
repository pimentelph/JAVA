package aulaarray;

import java.util.ArrayList;
import java.util.List;

public class array {

    public static void main(String[] args) {
        
        
        int i;
        List<String> listaNomes = new ArrayList<>();
        
        listaNomes.add("Rafael");
        listaNomes.add("Pedro");
        listaNomes.add("Khawuan");
        listaNomes.add("Cravo");
                
        System.out.print("O numero de valores no array e: " + listaNomes.size());
        
        System.out.println("\n\n==For 1==");
        for(i = 0; i < listaNomes.size(); i++){
            System.out.println(listaNomes.get(i));
        }
        
        System.out.println("\n==For 2==");
        for(String elem : listaNomes){
            System.out.println(elem);
        }
        
        System.out.println("\n==For 3==");
        listaNomes.forEach((item) ->{
            System.out.println(item);
        });
    }
    
}

