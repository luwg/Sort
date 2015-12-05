/**
 * StringUtil
 *
 * @author weigang.lu
 * @date 2015/9/17
 */
public class StringUtil {
    public static void main(String[] args) {
        String test = null;
        String test2 = "";
        String test3 = new String();
        //System.out.println(test.length()); //NullPointException
        System.out.println(test3.length());  // 0
        System.out.println(test2.length());  // 0
    }
}
