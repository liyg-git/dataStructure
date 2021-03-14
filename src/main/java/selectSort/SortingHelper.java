package selectSort;

/**
 * 辅助验证排序正确性
 * @author 李永刚
 */
public class SortingHelper {
    private SortingHelper(){};
    public static <E extends Comparable<E>>boolean isSorted(E[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i-1].compareTo(arr[i])>0){
                return false;
            }
        }
        return true;
    }
    public static <E extends Comparable<E>>void sortTest(String sortname,E[] arr){
        long startTime = System.nanoTime();
        if(sortname.equals("SelectionSort")) {
            SelectionSort.sort(arr);
        }
        long endTime = System.nanoTime();
        if(!SortingHelper.isSorted(arr)){
            throw new RuntimeException("SelectionSort failed");
        }
        double time = (endTime - startTime) / 1000000000.0;
        System.out.println(String.format("%s , n = %d : %f s",sortname,arr.length,time));
    }
}
