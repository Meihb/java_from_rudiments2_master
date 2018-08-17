package Sort;

import java.util.Arrays;


//public class ShellSort {
//    public static void main(String[] args) {
//        int[] data = new int[]{26, 53, 67, 48, 57, 13, 48, 32, 60, 50};
//        shellSortSmallToBig(data);
//        System.out.println(Arrays.toString(data));
//    }
//
//    public static void shellSortSmallToBig(int[] data) {
//        int j = 0;
//        int temp = 0;
//        for (int increment = data.length / 2; increment > 0; increment /= 2) {
//            System.out.println("increment:" + increment);
//            for (int i = increment; i < data.length; i++) {
//                 System.out.println("i:" + i);
//                temp = data[i];
//                for (j = i - increment; j >= 0; j -= increment) {
//                     System.out.println("j:" + j);
//                     System.out.println("temp:" + temp);
//                     System.out.println("data[" + j + "]:" + data[j]);
//                    if (temp < data[j]) {
//                        data[j + increment] = data[j];
//                    } else {
//                        break;
//                    }
//                }
//                data[j + increment] = temp;
//            }
//            for (int i = 0; i < data.length; i++)
//                System.out.print(data[i] + " ");
//        }
//    }
//}



/*
 * Java实现希尔排序（缩小增量排序）
 *两个步骤：1，建堆  2，对顶与堆的最后一个元素交换位置
 */
public class ShellSort {

    public static void main(String[] args) {
        int a[] = {3,1,5,7,2,4,9,6,10,8};
        ShellSort  obj=new ShellSort();
        System.out.println("初始值：");
        System.out.println(Arrays.toString(a));
        obj.shellSort(a);
        System.out.println("\n排序后：");
        obj.print(a);

    }
    private void shellSort(int[] a) {
        int dk = a.length/2;
        while( dk >= 1  ){
            System.out.println("dk =" +dk);
            ShellInsertSort(a, dk);
            dk = dk/2;
        }
    }
    private void ShellInsertSort(int[] a, int dk) {//类似插入排序，只是插入排序增量是1，这里增量是dk,把1换成dk就可以了
        for(int i=dk;i<a.length;i++){
            System.out.println("i =" + i);
            if(a[i]<a[i-dk]){
                int j;
                int x=a[i];//x为待插入元素
                a[i]=a[i-dk];
                for(j=i-dk;  j>=0 && x<a[j];j=j-dk){//通过循环，逐个后移一位找到要插入的位置。
                    System.out.println("j= "+ j);
                    a[j+dk]=a[j];
                    System.out.println(Arrays.toString(a));
                }
                a[j+dk]=x;//插入
            }
            System.out.println(Arrays.toString(a));

        }

    }
    public void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}

/**
 * Created by chengxiao on 2016/11/24.
 */
//public class ShellSort {
//    public static void main(String []args){
//        int []arr ={1,4,2,7,9,8,3,6};
//        sort(arr);
//        System.out.println(Arrays.toString(arr));
//        int []arr1 ={1,4,2,7,9,8,3,6};
//        sort1(arr1);
//        System.out.println(Arrays.toString(arr1));
//    }
//
//    /**
//     * 希尔排序 针对有序序列在插入时采用交换法
//     * @param arr
//     */
//    public static void sort(int []arr){
//        //增量gap，并逐步缩小增量
//        for(int gap=arr.length/2;gap>0;gap/=2){
//            //从第gap个元素，逐个对其所在组进行直接插入排序操作
//            for(int i=gap;i<arr.length;i++){
//                int j = i;
//                while(j-gap>=0 && arr[j]<arr[j-gap]){
//                    //插入排序采用交换法
//                    swap(arr,j,j-gap);
//                    j-=gap;
//                }
//            }
//        }
//    }
//
//    /**
//     * 希尔排序 针对有序序列在插入时采用移动法。
//     * @param arr
//     */
//    public static void sort1(int []arr){
//        //增量gap，并逐步缩小增量
//        for(int gap=arr.length/2;gap>0;gap/=2){
//            //从第gap个元素，逐个对其所在组进行直接插入排序操作
//            for(int i=gap;i<arr.length;i++){
//                int j = i;
//                int temp = arr[j];
//                if(arr[j]<arr[j-gap]){
//                    while(j-gap>=0 && temp<arr[j-gap]){
//                        //移动法
//                        arr[j] = arr[j-gap];
//                        j-=gap;
//                    }
//                    arr[j] = temp;
//                }
//            }
//        }
//    }
//    /**
//     * 交换数组元素
//     * @param arr
//     * @param a
//     * @param b
//     */
//    public static void swap(int []arr,int a,int b){
//        arr[a] = arr[a]+arr[b];
//        arr[b] = arr[a]-arr[b];
//        arr[a] = arr[a]-arr[b];
//    }
//}
