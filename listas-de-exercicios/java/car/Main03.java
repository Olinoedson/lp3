package car;

public class Main03 {
        public static void main(String[] args) {

            Carro carro1 = new Carro("V8", (short)1969, "Ford", "Mustang");
            Carro carro2 = new Carro("RB26DETT", (short)1972, "Nissan", "Skyline GT-R");
            Carro carro3 = new Carro("V8 327", (short)1967, "Chevrolet", "Impala");

            System.out.println(carro1.exibir_info() + "\n" + carro2.exibir_info()+ "\n" + carro3.exibir_info());
        }
    
}
