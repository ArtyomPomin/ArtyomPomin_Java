package Exercise;
//поиск геномных последовательностей

public class Ex9 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 75, 86, 99, 44, 23, 32, 16, 4, 13};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int x = i + 1; x < arr.length; x++) {
                if (arr[i] > arr[x]) {
                    int y = arr[i];
                    arr[i] = arr[x];
                    arr[x] = y;
                }
            }
        }
        for (int x : arr) {
            System.out.println(x);
        }
    }
}


