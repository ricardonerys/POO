public class Classegeral {
    
    private String nome;
    private String cpf;
    private double salario;

    public Classegeral(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }    

    public String getCpf(){
        return cpf;
    }    

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
}
