import java.util.List;

public class Main {
    public static void main(String[] args) {
     Read read = new Read();
     int x = read.getInt();
        System.out.println(x);
        float y = read.getFloat();
        System.out.println(y);
        double z = read.getDouble();
        System.out.println(z);
        List<Integer> list = read.getList();
        System.out.println(list);
        int[] arr=read.getArray(3);
        System.out.println(arr);
        read.wait(5);

    }
}
