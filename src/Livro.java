public class Livro {
    private String titulo;
    private String autor;
    private Pessoa proprietario;

    public Livro(String titulo,String autor){
        this.titulo=titulo;
        this.autor=autor;
    }

    public Livro(Pessoa proprietario){
        this.proprietario=proprietario;
    }



    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public Pessoa getProp(){
        return proprietario;
    }


    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setProp(Pessoa proprietario){
        this.proprietario = proprietario;
    }
}
