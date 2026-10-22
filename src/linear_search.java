import java.util.Arrays;

public class linear_search {
    public static void main() {
        int[] arr = {1, -2, 3, 4, 5, 6, 7, 44, 21};
        int target = 3;
        int r0 = 3;
        int r1 = 6;

        int[][] arr2 = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 0}};


        String name = "Ananya";
        char target2 = 'y';
//        System.out.println(SearchInString(name, target2));

//        System.out.println(LinearSearch(arr, target));

//        System.out.println(SearchInRange(arr,r0,r1,target));

//        System.out.println(Minimum(arr));
        int[] ans = SearchIn2D(arr2, target);

        System.out.println(Arrays.toString(ans));
    }

    static int LinearSearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static int SearchInString(String name, char target2) {
        if (name.length() == 0 || name == null) {
            return -1;
        }
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == target2) {
                return i;
            }
        }
        return -1;
    }

    static int SearchInRange(int[] arr, int r0, int r1, int target) {
        if (arr.length == 0 || arr == null) {
            return -1;
        }
        for (int i = r0; i <= r1; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static int Minimum(int[] arr) {
        //assume array is not empty or null
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int[] SearchIn2D(int[][] arr2, int target) {
        if (arr2.length == 0 || arr2 == null) {
            return new int[]{-1, -1};
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                if (target == arr2[i][j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}



