package Sort;

import java.util.Arrays;

public class JavaSort {
    public static void main(String[] args) {
        JavaSort myJavaSort = new JavaSort();
        int[] numbers0 = {23, 64, 24, 1, 3, 15};
        myJavaSort.BubbleSort(numbers0);
        int[] numbers1 = {23, 64, 24, 1, 3, 15};
        myJavaSort.SimpleSelectSort(numbers1);
        int[] numbers2 = {23, 64, 24, 1, 3, 15};
        myJavaSort.StraightInsertSort(numbers2);
        myJavaSort.InsertSort();
        myJavaSort.ShellSort();

    }

    /**
     * 冒泡排序
     * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
     * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
     * 针对所有的元素重复以上的步骤，除了最后一个。
     * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
     *
     * @param numbers 需要排序的整型数组
     */
    public void BubbleSort(int[] numbers) {
        System.out.println("冒泡排序");
        showArray(numbers);
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                System.out.print("i=" + i + "j=" + j + ": ");
                if (numbers[j] < numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
                showArray(numbers);
            }
        }
    }

    /**
     * 简单选择排序
     * 在要排序的一组数中，选出最小（或者最大）的一个数与第1个位置的数交换；然后在剩下的数当中再找最小（或者最大）的与第2个位置的数交换，\
     * 依次类推，直到第n-1个元素（倒数第二个数）和第n个元素（最后一个数）比较为止。
     *
     * @param numbers
     */
    public void SimpleSelectSort(int[] numbers) {
        System.out.println("简单选择排序");
        showArray(numbers);
        int least_subscript;
        int temp;
        for (int i = 0; i < numbers.length; i++) {
            least_subscript = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] > numbers[least_subscript]) {
                    least_subscript = j;
                }
            }
            if (least_subscript != i) {
                temp = numbers[i];
                numbers[i] = numbers[least_subscript];
                numbers[least_subscript] = temp;
            }
            showArray(numbers);
        }
    }

    /**
     * 直接插入排序
     * 默认当前带插入的数字串是有序的,将当前插入值按序插入对应的地址,若存在于当前值相同,插入此值之后
     *
     * @param numbers
     */
    public void StraightInsertSort(int[] numbers) {
        System.out.println("直接插入排序");
        showArray(numbers);
        int dest_subscript;
        boolean dest_boolean;
        for (int i = 1; i < numbers.length; i++) {
            dest_boolean = false;
            dest_subscript = i;
            if (numbers[i] < numbers[0]) {
                dest_boolean = true;
                dest_subscript = 0;

            } else {
                for (int j = 0; j < i; j++) {

                    if (numbers[i] >= numbers[j]) {
                        if (j == i - 1) {//当前已到数字串末尾
                            dest_subscript = j + 1;
                            dest_boolean = true;
                            break;
                        } else if (numbers[i] < numbers[j + 1]) {
                            dest_subscript = j + 1;
                            dest_boolean = true;
                            break;
                        }
                    }
                }
            }
            System.out.print(dest_subscript + ":");
            if (dest_subscript < i) {
                int temp = numbers[i];
                System.arraycopy(numbers, dest_subscript, numbers, dest_subscript + 1, i - dest_subscript);
                numbers[dest_subscript] = temp;
            }
            showArray(numbers);
        }
    }

    /**
     * 直接插入排序,原始实现方式,不寻找插入点
     */
    public void InsertSort() {
        System.out.println("直接插入排序 原始实现方式");
        int[] numbers = {23, 64, 24, 1, 3, 15, 91, 73, 34};
        System.out.println(Arrays.toString(numbers));
        int temp;
        for (int i = 1; i < numbers.length; i++) {
            temp = numbers[i];
            System.out.println("i=" + i + " 哨兵=" + temp);
            for (int j = i - 1; j >= 0; j--) {
                System.out.println("j=" + j + " number is " + numbers[j]);
                if (temp < numbers[j]) {//当前数字比哨兵数大,当前数右移一位
                    numbers[j + 1] = numbers[j];
                    numbers[j] =temp;
                    System.out.println(Arrays.toString(numbers));
                } else {//从此数往前全部是小于哨兵的数,意即 该哨兵应当放在此位置后一位
                    numbers[j + 1] = temp;
                    System.out.println(Arrays.toString(numbers));
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));

    }

    /**
     * 希尔排序
     *
     */
    public void ShellSort() {
        System.out.println("希尔排序");
        int[] data = {23, 64, 24, 1, 3, 15, 91, 73, 34};
        int j = 0;
        int temp = 0;
        for (int increment = data.length / 2; increment > 0; increment /= 2) {
            System.out.println("increment:" + increment);
            for (int i = increment; i < data.length; i++) {
                System.out.println("i:" + i);
                temp = data[i];
                for (j = i - increment; j >= 0; j -= increment) {
                    System.out.println("j:" + j);
                    System.out.println("temp:" + temp);
                    System.out.println("data[" + j + "]:" + data[j]);
                    if (temp < data[j]) {
                        data[j + increment] = data[j];
                    } else {
                        break;
                    }
                }
                data[j + increment] = temp;
            }
            System.out.println(Arrays.toString(data));
        }
    }

    /**
     * @param array
     */
    public void showArray(int[] array) {
        for (int num : array) {
            System.out.print(" " + num);
        }
        System.out.print("\t\n");
    }
}
