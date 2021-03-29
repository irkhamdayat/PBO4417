class Gameenemy{
    double width;
    double height;
    int PositionX= 60; int PositionY;
    int run;

    Gameenemy(){

    }


    public Gameenemy(double width, double height){
        
    }
    

    public Gameenemy (double width, double height, int PositionX, int PositionY){
       
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

    public int X(){
        return 10;
    }

    public int Y(){
        return 10;
    }

    void runn(){
        System.out.println("Enemy Is Running ");

    }

    void Runn(int increment) {
        PositionX = PositionX + increment;
        System.out.println(" \n Enemy Is Running: " + PositionX );
    }    
}






   