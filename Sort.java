public class Sort{
    public static  void main(String[] args){
        System.out.println("hey");
    }

    public static void bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            boolean sorted = true;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
    }

    public static int maxIndex(int[] array){
        int index = 0;
        for(int i = 0 ; i < array.length; i++){
            if(array[index] < array[i]){
                index = i;
            }
        }
        return index;
    }
    
}