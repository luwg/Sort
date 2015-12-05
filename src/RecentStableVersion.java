/**
 * RecentStableVersion
 *
 * @author weigang.lu
 * @date 2015/9/21
 */
public class RecentStableVersion implements Comparable<RecentStableVersion> {

    private int major;
    private int minor;
    private int pathchlevel;

    public RecentStableVersion(int major, int minor, int pathchlevel) {
        this.major = major;
        this.minor = minor;
        this.pathchlevel = pathchlevel;
    }

    public int getMajor() {
        return major;
    }

    public int getMinor() {
        return minor;
    }

    public int getPathchlevel() {
        return pathchlevel;
    }

    @Override
    public int compareTo(RecentStableVersion o) {
        //先判断第二个参数是否为偶数
        if (o.getMinor() % 2 != 0) {
            return 1;
        }
        // 先按minor排序
        if (this.minor > o.getMajor()) {
            return 1;
        }
        if (this.minor < o.getMajor()) {
            return -1;
        }
        // 按pathchlevel排序
        if (this.pathchlevel > o.getPathchlevel()) {
            return 1;
        }
        if (this.pathchlevel < o.getPathchlevel()) {
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        String[] str = {"1.1.1", "1.1.4", "1.3.1", "2.1.1", "2.1.6", "4.1"};
        String maxStr = str[0];
        boolean flag = false;
        for (int i = 0; i < str.length; i++) {
            RecentStableVersion rsv = constructRecentStableVersion(str[i]);
            RecentStableVersion rsvmax = constructRecentStableVersion(maxStr);
            if (rsv.getMinor() % 2 == 0 && rsv.compareTo(rsvmax) == 1) {
                flag = true;
                maxStr = str[i];
            }
        }
        if (flag) {
            System.out.println(maxStr);
        } else {
            System.out.println("找不到稳定的版本");
        }
    }

    private static RecentStableVersion constructRecentStableVersion(String source){
        String[] strings = source.split("\\.");
        int major = Integer.parseInt(strings[0]);
        int minor = Integer.parseInt(strings[1]);
        int pathchlevel = 0;
        if (strings.length == 3) {
            pathchlevel = Integer.parseInt(strings[2]);
        }
        RecentStableVersion result = new RecentStableVersion(major, minor, pathchlevel);
        return result;
    }


}
