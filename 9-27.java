public class Rectangle implements Cloneable {
  //... missed it
}

public Objects clone() {
 // Rectangle r = new Rectangle(this.length, this.height);
  Rectangle r = null;
  try{
    r = (Rectangle) super.clone();
  }
  catch (CloneNotSupportedException e) {
    System.out.println("Clone failed");
  }
  return r; 
  /**
  *if it doesnt succeed, r will be null, so that's the check
  *later with the if statement in driver
  */
  
}

public class Driver {
Rectangle a = new Rectangle(4,5);
Rectangle b = (Rectangle) a.clone();

if (b!= null) {
  s.setDimensions(1,1);
  //areas will be different now
  
}
  
  //exception handling
  public class MyArrayLenException extends Exception {
    public MyArrayException(String message) {
      super(message);
    }
  } //this example not exactly useful but shows how to extend an exception handling
  
  public class ExceptionExample {
    public static int[] createArray(int len) throws MyArrayLenException {
      if (len<0) {
        throw new MyArrayLen

        }
      
 //10-1
      
