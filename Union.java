import java.util.HashSet;
public class Union {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {2,3,4};
        HashSet<Integer> set = new HashSet<>();
        for (int i : a) set.add(i);
        for (int i : b) set.add(i);
        System.out.println(set);
    }
}
