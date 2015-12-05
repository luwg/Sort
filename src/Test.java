import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Test
 *
 * @author weigang.lu
 * @date 2015/9/19
 */
public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String x1 = "";
        if (s.hasNext()) {
            x1 = s.nextLine();
            String[] tmp = x1.split(" ");
            int[] array = new int[tmp.length];
            for (int i = 0; i < tmp.length; i++) {
                array[i] = Integer.parseInt(tmp[i]);
            }
            float tmpDouble = (float) Math.sqrt(Math.pow((array[0] - array[2]), 2) + Math.pow((array[1] - array[3]), 2));
            System.out.println(tmpDouble);
            DecimalFormat df = new DecimalFormat("0.00");
            double res = Double.parseDouble(df.format(tmpDouble));
//        	  BigDecimal bg = new BigDecimal(tmpDouble);
//        	  double res = bg.setScale(2, )
            //sum(res);
            System.out.println(res);

        }

    }


}
