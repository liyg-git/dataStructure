package selectSort;

/**
 * 选择排序法
 * 时间复杂度 O(n^2)=n^2/2+n/2
 * @author 李永刚
 */
public class SelectionSort {
    private SelectionSort(){};
    public static <E extends Comparable<E>> void sort(E[] arr){//必须是可比较的，所以泛型E需要继承Comparable
        for(int i=0;i<arr.length;i++){
            //选择arr[i...n)中的最小值的索引
            int minIndex = i;
            for(int j=i;j<arr.length;j++){
                if(arr[j].compareTo(arr[minIndex])<0){
                    minIndex = j;
                }
            }
            swap(arr,i,minIndex);
        }
    }
    private static <E> void swap(E[] arr,int i,int j){
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

//    public static void main(String[] args) {
//        Integer[] arr ={1,4,2,7,5,3,6};
//        SelectionSort.sort(arr);
//        for(int e: arr){
//            System.out.println(e);
//        }
//        Student[] students ={new Student("Alice",97),
//                             new Student("Bobo",100),
//                             new Student("Chaeles",66)};
//        SelectionSort.sort(students);
//        for(Student student:students){
//            System.out.print(student+" ");
//            System.out.println();
//        }
//    }
    public static void main(String[] args) {
//        int n=10000;
//        Integer[] arr =ArrayGenerator.generateRandomArray(n,n);
//        long startTime = System.nanoTime();
//        SelectionSort.sort(arr);
//        long endTime = System.nanoTime();
//        if(!SortingHelper.isSorted(arr)){
//            throw new RuntimeException("SelectionSort failed");
//        }
//        System.out.println(n + "个元素排序耗时：time：" + (endTime - startTime) / 1000000000.0 + "s");
        int[] dataSize = {10000, 100000};
        for (int n : dataSize) {
            Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
            SortingHelper.sortTest("SelectionSort", arr);
        }
    }
}
