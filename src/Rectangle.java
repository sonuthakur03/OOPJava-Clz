public class Rectangle {
    private int length;
    private int width;
    public Rectangle(int width, int height){
        this.width = width;
        this.length = height;
    }

    public Rectangle(Rectangle original){
        this.width = original.width;
        this.length = original.length;
    }

    public int getArea(){
        return width * length;
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5,7);

        Rectangle rect2 = new Rectangle(rect1);

        System.out.println("Area of rectangle1 is: " + rect1.getArea());
        System.out.println("Area of rectangle2 is: " + rect2.getArea());
    }
}
