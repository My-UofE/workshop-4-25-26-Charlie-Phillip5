// A Rectangle class
public class Rectangle {
  
  // 4 instance attributes
  public double width;
  public double height;
  public double originX = 0.0;
  public double originY = 0.0;

  // 1 static attributes
  public static final int NUMBER_OF_SIDES = 4;

  public static boolean areOverlapping(Rectangle r1, Rectangle r2){
    return r1.isOverlappedWith(r2);
  }

  // main constructor
  public Rectangle(double width, double height, double originX, double originY) {
    this.width = width;
    this.height = height;
    this.originX = originX;
    this.originY = originY;
  }

  public Rectangle(double width, double height){
    this(width, height, 0, 0);
  }

  public Rectangle(){
    this(1, 1, 0, 0);
  }

  // method: move the rectangle
  public void move(double dx, double dy) {
	   originX += dx;
	   originY += dy;
  }

  public void scale(double scaleX, double scaleY){
    this.width *= scaleX;
    this.height *= scaleY;
  }


  public void scale(double scaleXY){
    this.width *= scaleXY;
    this.height *= scaleXY;
  }

  // method: compute the area of the rectangle
  public double getArea() {
    return width * height;
  }
  
  // method: compute the area of the rectangle
  public double getPerimeter() {
    return 2 * (width + height);
  }

  public boolean isOverlappedWith(Rectangle r){
    if (((this.originX < r.originX) && (r.originX < this.originX + this.width)) || ((r.originX < this.originX) && (this.originX < r.originX + r.width))){
      if (((this.originY < r.originY) && (r.originY < this.originY + this.height)) || ((r.originY < this.originY) && (this.originY < r.originY + r.height))){
        return true;
      }
    }
    return false;
  }

  public double calcRatio(){
    return this.width/this.height
  }

  public boolean isSquare(){
    return this.height == this.width
  }
  
}
