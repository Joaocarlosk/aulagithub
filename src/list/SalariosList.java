package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SalariosList<T> {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        List<Funcionario> list = new ArrayList<>();
        
        System.out.print("Number of employees: ");
        int qt = le.nextInt();
        le.nextLine();

        for(int i=0; i<qt; i++){
            System.out.print("ID: ");
            int id = le.nextInt();
            le.nextLine();
            while(hasId(list, id)){
                System.out.println("Id already taken! Try again: ");
                id = le.nextInt();
            }
            System.out.print("Name: ");
            String name = le.nextLine();
            System.out.print("Salary: ");
            double salary = le.nextDouble();
            System.out.println();
            Funcionario employee = new Funcionario(id, name, salary);
            list.add(employee);
        }

        System.out.println();

        System.out.println("Enter the employee id that will have salary increase: ");
        int idIncrease = le.nextInt();
        le.nextLine();

        //2ª MANEIRA
        Funcionario emp = list.stream().filter(x -> x.getId() == idIncrease).findFirst().orElse(null);
        if(emp == null){
            System.out.println("This id does not exist!");
            for(int i=0; i<list.size(); i++){
                System.out.println(list.get(i).toString());
            }
        }else{
            System.out.println("Enter the percentage: ");
            double percentage = le.nextDouble();
            emp.increaseSalary(percentage);
            for(int i=0; i<list.size(); i++){
                System.out.println(list.get(i).toString());
            }
        }

        //1ª MANEIRA
        /*Integer pos = position(list, idIncrease);
        if(pos == null){
            System.out.println("This id does not exist!");
            for(int i=0; i<list.size(); i++){
                System.out.println(list.get(i).toString());
            }
        }else{
            System.out.println("Enter the percentage: ");
            double percentage = le.nextDouble();
            list.get(pos).increaseSalary(percentage);
            for(int i=0; i<list.size(); i++){
                System.out.println(list.get(i).toString());
            }
        }*/        
           
    }

    public static Integer position(List<Funcionario> list, int id){
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getId() == id){
               return i;
            }
        }  
        return null;             
    }

    public static boolean hasId(List<Funcionario> list, int id){
        Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
