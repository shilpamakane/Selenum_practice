package ArrayProgram;

public class ThirdMaxNumber {

    public static void main(String[] args) { 
        int a[] = {-12, 45, -23, 64, -100, 24};

        // Sorting the array in descending order
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }

        // Printing the sorted array
        System.out.println("Sorted array in descending order:");
        for (int k = 0; k < a.length; k++) {
            System.out.println(a[k]);
        }

        // Printing the 2nd maximum number
        if (a.length >= 2) {
            System.out.println("2nd highest number: " + a[a.length - 2]); // 2nd highest is at index (length - 2)
        } else {
            System.out.println("Array does not have enough elements.");
        }
    }
}
