package people;
    class Pessoa{
        private int idade;
        private String nome;

        public Pessoa(int idade, String nome){
            this.idade = idade;
            this.nome = nome;
        }

        public int getidade(){
            return idade;
        }
        
        public String getnome(){
            return nome;
        }

        public String toString(){
            return "Idade:" + idade + " " + "nome: " + nome;
        }
    }