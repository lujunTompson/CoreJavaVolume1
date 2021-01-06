package JavaCore.Third.Train;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args) throws IOException {
        //读取文件
        Scanner in = new Scanner(Path.of("C:\\Users\\86139\\Desktop\\zhongte.txt"), StandardCharsets.UTF_8);
        while (in.hasNext()) {
            String s = in.nextLine();
            System.out.println(s);
        }
        //写入文件
        PrintWriter out = new PrintWriter("C:\\Users\\86139\\Desktop\\fileIO.txt", StandardCharsets.UTF_8);
        out.print("a");
        out.print("b");
        out.print("c");
        out.print("d");
        //释放缓存
        out.flush();
        out.close();
    }
}
