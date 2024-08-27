import java.util.*;
import java.io.*;

public class Main {

    static int n1, n2;
    static int[] list;
    static int[] arr;
    static int[][] list2;

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        n1 = Integer.parseInt(st.nextToken());
        n2 = Integer.parseInt(st.nextToken());

        list = new int[n1];
        list2 = new int[n2][2];
        arr = new int[n1];

        st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < n1; i++) {
            list[i] = Integer.parseInt(st.nextToken());
            if(i == 0) {
                arr[i] = list[i];
            }
            else {
                arr[i] = arr[i - 1] + list[i];
            }
        }

        for(int i = 0; i < n2; i++) {
            st = new StringTokenizer(bf.readLine());
            list2[i][0] = Integer.parseInt(st.nextToken());
            list2[i][1] = Integer.parseInt(st.nextToken());
        }


        for(int i = 0 ; i < n2; i++) {
            if(list2[i][0] == 1) {
                System.out.println(arr[list2[i][1] - 1]);
            }
            else {
                System.out.println(arr[list2[i][1] - 1] - arr[list2[i][0] - 2]);
            }
        }

    }
}
	