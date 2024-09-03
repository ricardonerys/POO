
public class Main {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("ricardo",25);
        Livro livro = new Livro("LOTR","TOLKIEN");
        
        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);

        livro.setTitulo("java como programar");
        livro.setAutor("nanana");

        System.out.println("titulo:" + livro.getTitulo());
        System.out.println("autor:" + livro.getAutor());

        pessoa.setNome("valesca");
        pessoa.setIdade(33);

        System.out.println("novo nome:" + pessoa.getNome());
        System.out.println("autor:" + pessoa.getIdade());
    }
    
}

