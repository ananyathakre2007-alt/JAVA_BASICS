public class Binary_search {
    public static void main() {

        int[] arr = {1, 2, 3, 5, 6, 7, 8, 10, 11};
        int target = 9;
        int[] arr2 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
//
//        System.out.println(InfiniteArray(arr,6));
//        System.out.println(BinarySearch(arr, target));
//        System.out.println(BinarySearch2(arr2, target));
//        System.out.println(AgnosticSearch(arr2, target));
//        System.out.println(CeilingOfANumber(arr,target));
//        System.out.println(FloorOfANumber(arr, target));

    }

    // ascending sort
    static int BinarySearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    //Descending sort
    static int BinarySearch2(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                start = mid + 1;
            } else {
                end = mid - 1;

            }
        }
        return -1;
    }

    //Agnostic sort

    static int AgnosticSearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        if (arr[0] > arr[arr.length - 1]) {
            return BinarySearch2(arr, target);
        } else {
            return BinarySearch(arr, target);
        }
    }

    static int CeilingOfANumber(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            }

            if (arr[mid] > target) {
                ans = arr[mid];
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    static int FloorOfANumber(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            }

            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                ans = arr[mid];
                start = mid + 1;
            }
        }
        return ans;
    }

    static int BinarySearch3(int[] arr, int target,int start,int end) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static int InfiniteArray(int[] arr, int target) {
        int gap = 1;
        int start = 0;
        int end = start + gap;

        while (target > arr[end]) {
            start = end + 1;
            gap = gap * 2;
            end = start + gap;
        }

        return BinarySearch3(arr, target, start, end);
    }
}








