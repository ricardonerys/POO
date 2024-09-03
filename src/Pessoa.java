
public class Pessoa {
    String nome;
    int idade;


    Pessoa(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
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

    public void setNome(String nome){
        this.nome=nome;
    }
    public void setIdade(int idade){
        this.idade=idade;
    }

}
