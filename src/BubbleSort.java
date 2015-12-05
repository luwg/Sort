
/**
 * BubbleSort
 *
 * @author weigang.lu
 * @date 2015/9/15
 */
public class BubbleSort extends SortTemplete{
    public static void main(String[] args) {
        bubbleSort(source);
        printSource(source);
    }
    private static void bubbleSort(int[] source) {
        for(int i = 0; i <source.length-1 ; i++) {
          for(int j = i+1; j <source.length ; j++) {
            if (source[i]>source[j]) {
                swap(source,i,j);
            }
          }
        }
    }
}
