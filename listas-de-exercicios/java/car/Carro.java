package car;

public class Carro {
        private String motor;
        private short ano;
        private String marca;
        private String modelo;

        public Carro(String motor, short ano, String marca, String modelo){
            this.ano = ano;
            this.motor = motor;
            this.marca = marca;
            this.modelo = modelo;
        }

        public String getmotor(){
            return motor;
        }
        
        public String getmodelo(){
            return modelo;
        }
    
        public String getmarca(){
            return marca;
        }

        public String exibir_info(){
            return "motor:" + motor + "\n" + "ano:" + ano + "\n" + "modelo:" + modelo + "\n" + "marca:" + marca + "\n";
        }
}
