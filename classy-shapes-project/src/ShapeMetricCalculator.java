public class ShapeMetricCalculator {
    public static double calculateRectangleArea(Rectangle rectangle){
        return rectangle.length * rectangle.width;
    }
    public static double calculateCircleArea(Circle circle){
        return  Math.pow(circle.radius,2)*Math.PI;
    }
}

