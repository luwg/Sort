import java.util.Random;

/**
 * RandomNum
 *
 * @author weigang.lu
 * @date 2015/9/28
 */
public class RandomNum {
    public static void main(String[] args) {
        int random = getRandom(1,2);
        System.out.println(random);
        Random random1 = new Random();
        int result = random1.nextInt(1);
        System.out.println(result);
    }

    private static int getRandom(double start,double end){
        int random = (int)(Math.random()*(end-start+1))+(int)start;
        return random;
    }
}
