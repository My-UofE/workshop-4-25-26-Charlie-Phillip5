// A Rectangle class
public class Rectangle {
  
  // 4 instance attributes
  private double width;
  private double height;
  private double originX = 0.0;
  private double originY = 0.0;

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
    return this.width/this.height;
  }

  public boolean isSquare(){
    return this.height == this.width;
  }
  
  public double getWidth(){return this.width;}
  public double getHeight(){return this.height;}
  public double getOriginX(){return this.originX;}
  public double getOriginY(){return this.originY;}

  public void setWidth(double width){if(width>0){this.width = width;}}
  public void setHeight(double height){if(height>0){this.height = height;}}
  public void setOriginX(double originX){this.originX = originX;}
  public void setOriginY(double originY){this.originY = originY;}

  // Return a description of a rectangle in the form of
  // Rectangle[x=*,y=*,w=*,h=*]
  public String toString(){
  return "Rectangle[x="+originX+",y="+originY+",w="+width+",h="+height+"]";
}
}
