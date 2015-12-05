import java.util.Arrays;

/**
 * GenHao
 *
 * @author weigang.lu
 * @date 2015/9/20
 */
public class GenHao {

    public static void main(String[] args) {
        int arr[] = new int[] {4,25,10};
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr,0,1,8);
        System.out.println(index);
    }

}