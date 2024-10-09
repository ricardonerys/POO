
public class Main {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("ricardo",25);
        Livro livro = new Livro("LOTR","TOLKIEN");
        
        livro.setTitulo("java como programar");
        livro.setAutor("nanana");
      
        System.out.println("titulo:" + livro.getTitulo());
        System.out.println("autor:" + livro.getAutor());

        pessoa.setNome("valesca");
        pessoa.setIdade(33);
        livro.setProp(pessoa);
        System.out.println("novo nome do proprietario:" + livro.getProp().getNome());
    }
    
}

