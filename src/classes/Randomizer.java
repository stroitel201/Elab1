package classes;

public class Randomizer {
    public static int randomize_low(int number)
    {
       int rand_num= 0 + (int) (Math.random() * number);
       return rand_num;
    }
    public static int randomize_up(int number)
    {
        int rand_num= number + (int) (Math.random() * (10000-number));
        return rand_num;
    }

}
