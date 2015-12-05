/**
 * SortTemplete
 *
 * @author weigang.lu
 * @date 2015/9/15
 */
public class SortTemplete {
    public static int[] source = {24,4,54,73,657,87,26,6,84,84,23,46,8,90,78};

    public static void swap(int[] source, int i, int j) {
        int temp = source[i];
        source[i] = source[j];
        source[j] = temp;
    }

    public static void printSource(int[] source){
        for(int i = 0; i <source.length ; i++) {
            System.out.print(source[i]+ ",");
        }
    }
}
