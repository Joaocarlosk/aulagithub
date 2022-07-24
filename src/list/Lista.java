package list;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) throws Exception {
        
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Joao");
        list.add(0, "Sinara");

        System.out.println("Tamanho da lista " + list.size());
        System.out.println();

        for(String nome : list){
            System.out.println(nome);
        }

        System.out.println();

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        list.remove("Maria");
        System.out.println();

        System.out.println("Tamanho da lista " + list.size());
        System.out.println();

        for(String nome : list){
            System.out.println(nome);
        }

        System.out.println();
        list.removeIf(s -> s.charAt(0) == 'S');
        System.out.println("Tamanho da lista " + list.size());
        System.out.println();
        
        System.out.println(list.indexOf("Joao"));
    }
}