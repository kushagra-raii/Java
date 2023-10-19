public class BinarySearch {
    public static int binarySearch(int key, int[] list) {
        int start = 0;
        int end = list.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (list[middle] == key) {
                return middle; // Return the index if key is found
            } else if (list[middle] > key) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1; // Return -1 if key is not found
    }

    public static void main(String[] args) {
        int key = 34;
        int[] list = {5, 10, 15, 20, 25, 30, 35, 40, 45};
        int result = binarySearch(key, list);

        if (result != -1) {
            System.out.println("Key found at index: " + result);
        } else {
            System.out.println("Key not found in the list.");
        }
    }
}
