public class PaintJob {

    public static void main(String[] args) {

        System.out.println(getBucketCount(7.14,1.5));
    }

    //Just a bunch of overloaded methods

    public static int getBucketCount(
              double width
            , double height
            , double areaPerBucket
            , int extraBuckets){

        if(width <= 0.00d || height <= 0.00d
                || areaPerBucket <= 0.00d || extraBuckets < 0){

            return -1;
        }

        double areaToPaint;
        double bucketsNeeded;
        int roundedBuckets;

        areaToPaint = width * height;
        bucketsNeeded = areaToPaint / areaPerBucket;
        bucketsNeeded -= extraBuckets;
        roundedBuckets = (int) Math.ceil(bucketsNeeded);

        return roundedBuckets;
    }

    public static int getBucketCount(
              double width
            , double height
            , double areaPerBucket){

        if(width <= 0.00d || height <= 0.00d
                || areaPerBucket <= 0.00d){

            return -1;
        }

        double areaToPaint;
        double bucketsNeeded;
        int roundedBuckets;

        areaToPaint = width * height;
        bucketsNeeded = areaToPaint / areaPerBucket;
        roundedBuckets = (int) Math.ceil(bucketsNeeded);

        return roundedBuckets;
    }

    public static int getBucketCount(double areaToPaint, double areaPerBucket){

        if(areaToPaint <= 0 || areaPerBucket <= 0.00d){

            return -1;
        }

        double bucketsNeeded;
        int roundedBuckets;

        bucketsNeeded = areaToPaint / areaPerBucket;
        roundedBuckets = (int) Math.ceil(bucketsNeeded);

        return roundedBuckets;
    }
}
