class Gameplayer{
    double width;
    double height;
    int PositionX; int PositionY;
    int run;

    Gameplayer(){

    }


    public Gameplayer(double width, double height){
        this.width = width;
        this.height = height;
    }
    

    public Gameplayer (double width, double height, int PositionX, int PositionY){
        this.width = width;
        this.height = height;
        this.PositionX = PositionX;
        this.PositionY = PositionY;
    }

    public void setDimensi(double width, double height){
        this.width = width;
        this.height = height;
    }

    public void setPosition(int PositionX, int PositionY){
        this.PositionX = PositionX;
        this.PositionY = PositionY;    
    }

    public double getWidth(){
        return width;
    }
    
    public double getHeight(){
        return height;
    }

    public int getX(){
        return PositionX;
    }

    public int getY(){
        return PositionY;
    }

    void run(){
        System.out.println("Player Is Still Running....... " + PositionX);

    }

    void Run(int increment) {
        PositionX = PositionX + increment;
        System.out.println(" \n Player Is Still Running.. current position " + PositionX );
    }    
}






   