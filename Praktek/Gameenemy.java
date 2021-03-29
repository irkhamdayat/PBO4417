class Gameenemy{
    double width;
    double height;
    int PositionX; int PositionY;

    Gameenemy(){

    }


    public Gameenemy(double width, double height){
        this.width = width;
        this.height= height;
        
    }
    

    public Gameenemy (double width, double height, int PositionX, int PositionY){
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

    public void Run(){
        System.out.println(" \n Enemy Is Running: ");
    }    
}






   