package JavaCore.Ninth.Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Train2 {
    public static void main(String[] args) {
        Integer max = Collections.max(List.of(1, 2, 1, 2));
        System.out.println(max);

        var staff = new ArrayList<String>(List.of("abc", "dgb", "dfg"));
        //返回最大最小值
        String maxStaff = Collections.max(staff);
        String minStaff = Collections.min(staff);
        String minStaff2 = Collections.min(staff, Comparator.comparing(String::length));

        String s = "Hello";
        s.substring(1,5).e
        //复制List
        var staff2 = new ArrayList<String>(staff);
        //Collections.copy(staff2, staff);

        //填充List,所有位置设置为相同的值
        Collections.fill(staff2, "Tom");
        System.out.println(staff);
        System.out.println(staff2);
    }
}
