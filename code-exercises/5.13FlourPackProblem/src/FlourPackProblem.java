public class FlourPackProblem {

    public static void main(String[] args) {

        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
        System.out.println(canPack(2,2,12));
    }


    //I Give UP!!
    public static boolean canPack(int bigCount, int smallCount, int goal) {


            if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;

            if (bigCount * 5 + smallCount >= goal) // if supply >= demand
                return (goal % 5 <= smallCount); //this was the condition I was looking for!!!!
            return false;

    }
}
