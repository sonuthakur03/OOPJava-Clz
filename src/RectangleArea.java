class Area{
    int length;
    int width;
    Area(){
        System.out.println("Area class constructor called");
        this.length = 5;
        this.width = 6;
    }

    Area(int length, int width){
        System.out.println("Area class constructor called with length and width");
        this.length = length;
        this.width = width;
    }

    int calculateArea(){
        return length * width;
    }
}


public class RectangleArea {
    public static void main(String[] args) {
        Area areaRectangle1 = new Area();
        Area areaRectangle2 = new Area(5,8);
        System.out.println("Area rectangle with no parameters: " + areaRectangle1.calculateArea());
        System.out.println("Area rectangle with parameters: " + areaRectangle2.calculateArea());
    }
}
