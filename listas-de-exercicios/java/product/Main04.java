package product;
public class Main04 {

        public static void main(String[] args) {
            Produto produto1 = new Produto((float)100.0, "perfume");
            Produto produto2 = new Produto((float)80.0, "mause");

            System.out.println(produto1.toString() + "\n" + produto2.toString());

            produto1.desconto10();
            produto2.desconto10();

            System.out.println(produto1.toString() + "\n" + produto2.toString());
        }
    
}
