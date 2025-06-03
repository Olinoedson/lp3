package books;
public class Main02 {

        public static void main(String[] args){
            Livro[] livros = new Livro[3];
            livros[0] = new Livro("hobbit", "J. R. R. Tolkien", (short)1937);
            livros[1] = new Livro("Fogo & sangue" , "George R. R. Martin", (short)2018);
            livros[2] = new Livro("O homem de giz", "C. J. Tudor", (short)2018);

            for(int i = 0; i < livros.length;i++){
                System.out.println(livros[i].toString());
            }
        }
    
}
