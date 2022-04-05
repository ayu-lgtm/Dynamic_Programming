//import java.util.Arrays;

public class Longest_increasing_Subsequence {
    public static void main(String args[]) {
        int arr[] = { 3, 4, 2, 8, 10 };

        int tail[] = new int[arr.length];

        tail[0] = arr[0];

        int len = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > tail[len - 1]) {
                tail[len] = arr[i];
                len++;
            } else {
                int c = ceilIndex(tail, 0, len - 1, arr[i]);
                tail[c] = arr[i];
            }
        }

        // System.out.print(Arrays.toString(tail));
        System.out.print(len);

    }

    public static int ceilIndex(int tail[], int s, int e, int x) {
        if (s < e) {
            int mid = s + (e - s) / 2;
            if (tail[mid] >= x) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return e;
    }
}
