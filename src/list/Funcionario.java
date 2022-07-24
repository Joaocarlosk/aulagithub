package list;

public class Funcionario {
    private Integer id;
    private String nome;
    private Double salary;

    public Funcionario(Integer id, String nome, Double salary){
        this.id = id;
        this.nome = nome;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage){
        this.salary += (this.salary * (percentage/100));
    }

    public String toString(){
        return "\nId: "+ getId()+"\nName: "+getNome()+"\nSalary: "+ getSalary();
    }
    
    
}
