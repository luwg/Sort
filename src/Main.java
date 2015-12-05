import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Main
 *
 * @author weigang.lu
 * @date 2015/9/19
 */
public class Main {

    public static void main(String[] args) throws IOException {
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] source = new String[0];
        int max = 0;
        int flag = 0;
        try {
            source = br.readLine().split(" ");
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(int i = 1; i <= Integer.parseInt(source[0]) ; i++) {
            int number = Integer.parseInt(source[i]);
            if (number > max) {
                max = number;
                flag = i;
            }
        }
        String temp  = source[1];
        source[flag] = temp;
        source[1] = String.valueOf(max);
        for(int i = 1; i <= Integer.parseInt(source[0]); i++) {
          System.out.print(source[i]+" ");
        }
*/
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int high = 0;
        try {
            high = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println("-1");
            return;
        }
        String[] str = new String[0];
        try {
            str = br.readLine().split(" ");
        } catch (IOException e) {
            System.out.println(-1);
            return;
        }
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i <str.length ; i++) {
          list.add(Integer.parseInt(str[i]));
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        int sum = 0;
        int count = 0;
        boolean flag = false;
        for(int i= 0; i<list.size(); i++) {
            sum += list.get(i);
            count++;
          if (sum>=high) {
              flag = true;
              break;
          }
        }
        if (flag) {
            System.out.println(count);
        }else{
            System.out.println("-1");
        }*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = br.readLine().split(" ");
        String[] str2 = br.readLine().split(" ");
        String[] str3 = br.readLine().split(" ");
        int m = Integer.parseInt(str1[0]);
        int n = Integer.parseInt(str1[1]);
        int k = Integer.parseInt(str1[2]);
        int sumM = 0;
        int sumN = 0;
        boolean impossibleFlag = false;
        for(int i = 0; i < m; i++) {
            if (Integer.parseInt(str2[i])>k) {
                impossibleFlag = true;
                break;
            }
            sumM+=Integer.parseInt(str2[i]);
        }
        for(int i = 0; i < n; i++) {
            if (Integer.parseInt(str2[i])>k) {
                impossibleFlag = true;
                break;
            }
            sumM+=Integer.parseInt(str3[i]);
        }
        if (impossibleFlag ||sumM!=sumN) {
            System.out.println("Impossible");
        }else if(sumM/k<=str3.length){
            System.out.println("Unique");
            for(int i = 0; i < str3.length; i++) {
                System.out.print(str3[i]+" ");
            }

        }
    }
}


