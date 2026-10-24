
public class Questions_search {
    public static void main(String[] args) {
        int[] arr = {6, 6, 7, 1, 1, 2, 3, 3, 4, 5, 6};
        int target = 7;
//        System.out.println(Search(arr, target));
        System.out.println(NumberOfRotationsint(arr));
    }


    static int Search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start = start + 1;
                end = end - 1;
            } else {
                if (Leftsort(arr, start, mid)) {
                    if (arr[start] <= target && target <= arr[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                } else {
                    if (arr[mid] <= target && target <= arr[end]) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
        }
        return -1;

    }

    static boolean Leftsort(int[] nums, int a, int b) {
        if (nums[a] <= nums[b]) {
            return true;
        } else {
            return false;
        }
    }


}


