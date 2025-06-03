class Ponto2D{

    private double x;
    private double y;

    public Ponto2D(){
        x = 0;
        y = 0;
    }

    public Ponto2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getx(){
        return x;
    }
    
    public double gety(){
        return y;
    }

    public void movepara(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void movex(double x){
        this.x = x;
    }

    public void movey(double y){
        this.y = y;
    }
    
    public String toString(){
        return "Ponto:" + "(" + x + "," + y + ")";
    }
}