package books;

public class Livro {
    private short ano;
    private String autor;
    private String titulo;

    public Livro(String titulo,String autor, short ano){
            this.titulo = titulo;
            this.ano =  ano;
            this.autor = autor;
    }

    public short getano(){
        return ano;
    }

    public String getautor(){
        return autor;
    }
    
    public String gettitulo(){
        return titulo;
    }

    public String toString(){
        return "autor:" + autor + " ano:" + ano + " titulo:" + titulo;
    }
    
}
