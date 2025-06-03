public class Vertices {
    Ponto2D vertice;

    public Vertices(int Vertices){
        Ponto2D[] vertices = new Ponto2D[Vertices]; 
    }

    public Vertices(double x,double y){
        Ponto2D[] vertices = new Ponto2D[4];
        vertices[0].movepara(x, y);
    }

    
}
