public class AreaCalculator {

    public static void main(String[] args) {

        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }

    public static double area (double radius){

        double area = -1.00d;

        boolean isRadius = radius >= 0.00d ? true : false;

        if(isRadius){
            area = (radius * radius * Math.PI);
        }

        return area;
    }

    public static double area (double x, double y){

        double area = -1.00d;

        boolean isSide = x >= 0.00d && y >= 0.00d ? true : false;

        if (isSide){
            area = (x * y);
        }

        return area;
    }
}
