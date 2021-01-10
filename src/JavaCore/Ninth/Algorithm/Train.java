package JavaCore.Ninth.Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Train {
    public static void main(String[] args) {
        var staff = new ArrayList<String>(List.of("abc", "dgb", "dfg"));

        //排序的两种使用方法
        //法一：如果元素实现了Comparable接口
        Collections.sort(staff);
        //法二：可以使用List接口的sort方法并传入一个Comparator对象,按照长度进行排序
        staff.sort(Comparator.comparingInt(String::length));

        //逆置排序
        staff.sort(Comparator.reverseOrder());

    }
}
