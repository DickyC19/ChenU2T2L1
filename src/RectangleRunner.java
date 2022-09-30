public class RectangleRunner {
    public static void main(String[] args) {

        Rectangle rec1 = new Rectangle(150, 200);
        Rectangle rec2 = new Rectangle(125);
        Rectangle rec3 = new Rectangle();

        rec1.setWidth(75);
        rec2.setWidth(75);
        rec2.setLength(75);
        rec3.setWidth(75);

        int totalArea = rec1.calculateArea() + rec2.calculateArea() + rec3.calculateArea();
        System.out.println("These three plots require " + totalArea + " square feet of seed.");

    }
}
