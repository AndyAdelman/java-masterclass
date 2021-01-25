public class PlayingCat {

    public static void main(String[] args) {
        System.out.println(
        isCatPlaying(true,10) + "," +
        isCatPlaying(false,36) + "," +
        isCatPlaying(false, 35)
        );

    }

    public static boolean isCatPlaying(boolean summer, int temperature){

        boolean isCatPlaying = false;
        boolean isSummerTemp, isWinterTemp;

        isSummerTemp = temperature >= 25 && temperature <= 45;
        isWinterTemp = temperature >= 25 && temperature <= 35;

        if(summer && isSummerTemp){
            isCatPlaying = true;
        }

        if(!summer && isWinterTemp){
            isCatPlaying = true;
        }

        return isCatPlaying;

    }
}
