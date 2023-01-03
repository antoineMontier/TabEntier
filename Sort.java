public class Sort{
    public static  void main(String[] args){
        int[] k = {2, 1, 5, -8, 9};
        selectionSort(k);
        for(int i=0; i<k.length; i++){
            System.out.printf("%d ", k[i]);
        }
        System.out.printf("\n");
        System.out.println("max = " + maxIndex(k, k.length));
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean sorted = true;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
    }

    public static void selectionSort(int[] array) {
        int sortedSize = array.length - 1, index;
        while (sortedSize >= 0) {
            index = maxIndex(array, sortedSize);
            if (index != sortedSize) {
                swap(array, index, sortedSize);
            }
            sortedSize--;
        }
    }
    
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    private static int maxIndex(int[] array, int size) {
        int maxIndex = 0;
        for (int i = 1; i <= size; i++) {
            if(i < array.length && array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    
    
    
}
