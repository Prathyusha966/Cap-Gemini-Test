public class Equilibrium {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,2};
        int total = 0, left = 0;

        for (int i : arr) total += i;

        for (int i = 0; i < arr.length; i++) {
            total -= arr[i];
            if (left == total) {
                System.out.println(i);
                return;
            }
            left += arr[i];
        }
    }
}
