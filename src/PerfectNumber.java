import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * PerfectNumber
 *
 * @author weigang.lu
 * @date 2015/9/25
 */
public class PerfectNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int start = Integer.parseInt(str[0]);
        int end = Integer.parseInt(str[1]);
        int count = 0;
        for(int i = start; i <= end; i++) {
          if (i%2==0 && i%3==0 && i%5==0) {
              count++;
          }
        }
        System.out.println(count);
    }
}
