class Gameplayer{
    double width;
    double height;
    int positionX= 60; int positionY;
    int run;

    Gameplayer(){

    }


    public Gameplayer(double width, double height){
        
    }
    

    public Gameplayer (double width, double height, int PositionX, int PositionY){
       
    }

    public void setDimensi(double width, double height){
        
    }

    public void setPosition(int PositionX, int PositionY){
        
    }

    public double getWidth(){
        return 10.0;
    }
    
    public double getHeight(){
        return 10.0;
    }

    public int getX(){
        return 10;
    }

    public int getY(){
        return 10;
    }

    void run(){
        System.out.println("Player Is Still Running ");

    }

    void Run(int increment) {
        PositionX = PositionX + increment;
        System.out.println(" \n Player Is Still Running: " + PositionX );
    }    
}






   