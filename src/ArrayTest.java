/**
 * ArrayTest
 *
 * @author weigang.lu
 * @date 2015/9/20
 */
public class ArrayTest {
    public static void main(String[] args) {
        int a[][] = new int[3][4];
        for(int i = 0; i <a.length ; i++) {
          for(int j = 0; j <a[i].length ; j++) {
            System.out.print(a[i][j]);
          }
            System.out.println();
        }
    }
}
