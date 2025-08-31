import java.util.*;

public class IntersectionSortedArray {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 4, 5, 6};
        int arr2[] = {2, 3, 5, 7};

        int n = arr1.length, m = arr2.length;
        int i = 0, j = 0;

        ArrayList<Integer> intersection = new ArrayList<>();

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                // both are equal → common element
                if (intersection.isEmpty() || intersection.get(intersection.size() - 1) != arr1[i]) {
                    intersection.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        System.out.println("Intersection: " + intersection);
    }
}
