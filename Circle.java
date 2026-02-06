
public class Circle{

    private double radius;
    private double originX;
    private double originY;

    public Circle(double radius, double originX, double originY){
        this.radius = radius;
        this.originX = originX;
        this.originY = originY;
    }

    public Circle(double radius){
        this(radius, 0, 0);
    }

    public Circle(){
        this(1, 0, 0);
    }

    public double getRadius(){return this.radius;}
    public double getOriginX(){return this.originX;}
    public double getOriginY(){return this.originY;}

    public void setRadius(double radius){this.radius = radius;}
    public void setOriginX(double originX){this.originX = originX;}
    public void setOriginY(double originY){this.originY = originY;}

    public double getArea(){return Math.PI * Math.pow(this.radius, 2);}
    public double getCircumference(){return 2 * Math.PI * this.radius;}

    public void move(double moveX, double moveY){this.originX += moveX; this.originY += moveY;}

    public String toString(){return "Circle[x="+this.originX+", y="+this.originY+", radius="+this.radius+"]";}

    public void scale(double scaleFactor){this.radius *= scaleFactor;}

    public boolean isOverlappedWith(Circle c){
        double dist = Math.sqrt(Math.abs(c.originX - this.originX) + Math.abs(c.originY - this.originY));
        if (dist < c.radius + this.radius){
            return true;
        }
        return false;
    }

    public boolean isEnclosedBy(Circle c){
        double dist = Math.sqrt(Math.abs(c.originX - this.originX) + Math.abs(c.originY - this.originY));
        if(this.radius + dist < c.radius){
            return true;
        }
        return false;
    }
}