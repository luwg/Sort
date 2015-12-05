import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * SequenceSum
 *
 * @author weigang.lu
 * @date 2015/9/19
 */
public class SequenceSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] source = br.readLine().split(" ");
        double firstNum= Double.parseDouble(source[0]);
        double count = Double.parseDouble(source[1]);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(sum(firstNum,count)));
    }

    private static double sum(double firstNum, double count) {
        if (count == 1) {
            return firstNum;
        }else{
            return firstNum + sum(Math.sqrt(firstNum),count-1);
        }
    }
}
