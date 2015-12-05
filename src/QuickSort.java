/**
 * QuickSort
 *
 * @author weigang.lu
 * @date 2015/9/15
 */
public class QuickSort extends SortTemplete{
    public static void main(String[] args) {
        quickSort(source, 0, source.length-1);
        printSource(source);
    }

    private static void quickSort(int[] source, int low, int high) {
        if(low<high){
            int middle = partition(source, low, high);
            quickSort(source,low,middle-1);
            quickSort(source,middle+1,high);
        }
    }

    private static int partition(int[] source, int low, int high) {
        int temp = source[low];
        while(low<high){
            while(low<high && temp <= source[high]){
                high--;
            }
            source[low] = source[high];
            while(low<high && temp >= source[low]){
                low++;
            }
            source[high] = source[low];
        }
        source[low] =temp;
        return low;
    }
}
