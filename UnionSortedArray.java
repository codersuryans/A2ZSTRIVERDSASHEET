import java.util.*;

public class UnionSortedArray {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 4, 5, 6};
        int arr2[] = {2, 3, 5, 7};
        
        int n = arr1.length, m = arr2.length;
        int i = 0, j = 0;
        
        ArrayList<Integer> union = new ArrayList<>();
        
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                addToUnion(union, arr1[i]);
                i++;
            } 
            else if (arr2[j] < arr1[i]) {
                addToUnion(union, arr2[j]);
                j++;
            } 
            else { // both are equal
                addToUnion(union, arr1[i]);
                i++;
                j++;
            }
        }
        
        // add remaining elements
        while (i < n) {
            addToUnion(union, arr1[i]);
            i++;
        }
        while (j < m) {
            addToUnion(union, arr2[j]);
            j++;
        }
        
        System.out.println("Union: " + union);
    }
    
    // helper method to avoid duplicates
    static void addToUnion(ArrayList<Integer> union, int val) {
        if (union.isEmpty() || union.get(union.size()-1) != val) {
            union.add(val);
        }
    }
}
