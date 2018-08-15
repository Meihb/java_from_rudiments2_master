package Sort;

/**
 * 选择排序
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] array = {63, 4, 24, 1, 3, 15};
        SelectSort mySelectSort = new SelectSort();
        mySelectSort.sort(array);
    }

    public void sort(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            int least_subscript = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[least_subscript]) {
                    least_subscript = j;
                }
            }
            temp = array[i];
            array[i] = array[least_subscript];
            array[least_subscript] = temp;
        }

        showArray(array);
    }

    /**
     * @param array
     */
    public void showArray(int[] array) {
        for (int num : array) {
            System.out.println(num);
        }
    }

}
