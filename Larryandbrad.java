package larryandbrad;

public class Larryandbrad {

    public static void main(String[] args) {
        
        Circle myCircle = new Circle();
        Triangle myTriangle = new Triangle ();
        Square mySquare = new Square ();
               
        myCircle.playSound();
        myCircle.explode();
        myCircle.rotate();
        
        mySquare.playSound();
        
        myTriangle.playSound();
        
        
        
    }
    
}
