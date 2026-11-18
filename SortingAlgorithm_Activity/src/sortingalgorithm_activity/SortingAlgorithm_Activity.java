package sortingalgorithm_activity;
public class SortingAlgorithm_Activity {
        // BUBBLE SORT
    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // SELECTION SORT
    public void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // INSERTION SORT
    public void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    // DISPLAY ARRAY
    public void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // MAIN METHOD
    
public static void main(String args[]) {

    SortingAlgorithm_Activity sort = new SortingAlgorithm_Activity();

    int original[] = {23, 45, 78, 67, 22, 44, 78, 99, 10, 23};

    int bubble[] = original.clone();
    int selection[] = original.clone();
    int insertion[] = original.clone();

    System.out.println("Original Array:");
    sort.displayArray(original);

    // BUBBLE SORT
    long startBubble = System.nanoTime();

    sort.bubbleSort(bubble);

    long endBubble = System.nanoTime();

    System.out.println("\nBubble Sort:");
    sort.displayArray(bubble);
    System.out.println("Execution Time: "
            + (endBubble - startBubble) + " nanoseconds");


    // SELECTION SORT
    long startSelection = System.nanoTime();

    sort.selectionSort(selection);

    long endSelection = System.nanoTime();

    System.out.println("\nSelection Sort:");
    sort.displayArray(selection);
    System.out.println("Execution Time: "
            + (endSelection - startSelection) + " nanoseconds");


    // INSERTION SORT
    long startInsertion = System.nanoTime();

    sort.insertionSort(insertion);

    long endInsertion = System.nanoTime();

    System.out.println("\nInsertion Sort:");
    sort.displayArray(insertion);
    System.out.println("Execution Time: "
            + (endInsertion - startInsertion) + " nanoseconds");
}
}


