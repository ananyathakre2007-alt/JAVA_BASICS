public class Binary_search {
    public static void main() {

        int[] arr = {1,2,3,4,5,6,7,8,10};
        int target = 2;
        int[] arr2 = {9,8,7,6,5,4,3,2,1};

//        System.out.println(BinarySearch(arr, target));
//        System.out.println(BinarySearch2(arr2, target));
        System.out.println(AgnosticSearch(arr2,target));



    }
    // ascending sort
    static int BinarySearch(int[] arr, int target) {
        if (arr == null||arr.length == 0 ) {
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
        if ( arr == null||arr.length == 0 ) {
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

    static int AgnosticSearch(int[] arr,int target){
        if (arr == null || arr.length == 0) {
            return -1;
        }
        if (arr[0]>arr[arr.length-1]){
            return BinarySearch2(arr,target);
        }
        else {
            return BinarySearch(arr, target);
        }
    }
}
