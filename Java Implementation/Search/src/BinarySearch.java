import java.util.Arrays;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;


public class BinarySearch {
    public static int rank(int key, int[] a) {
        //数组必须是有序的
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] whilelist = In.readInts(args[0]);
        Arrays.sort(whilelist);
        while (!StdIn.isEmpty()) {//读取键值，如果不存在于白名单中则将其打印
            int key = StdIn.readInt();
            if (rank(key, whilelist) < 0) {
                StdOut.println(key);
            }
        }
    }
}
