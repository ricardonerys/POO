
public class Pessoa {
    private String nome;
    private int idade;
    private Endereco residencia;


    Pessoa(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }
    Pessoa(Endereco residencia){
        this.residencia = residencia;
    }

    public void apresenta(){
        System.out.println("ola, me chamo " + this.nome + ", tenho " + this.idade + "anos");
    }

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public Endereco getEnd(){
        return residencia;
    }

    public void setNome(String nome){
        this.nome=nome;
    }
    public void setIdade(int idade){
        this.idade=idade;
    }
    
    public void setEnd(Endereco residencia){
        this.residencia= residencia;
    }
}
