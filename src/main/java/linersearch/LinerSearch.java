package linersearch;

/**
 * @Link{LinerSearch}
 * 数据结构-现行查找
 * @author 李永刚
 * 复杂度分析：表示算法的性能 时间复杂度O(n)=c1*n+c2，性能与数据规模呈正比；空间复杂度O(1)
 */
public class LinerSearch {
    private LinerSearch(){};//私有，只允许自己使用，不需要其他用户创建LinerSearch对象
//    public int search(int[] data,int target) {
//        for(int i=0 ;i<data.length;i++){
//            if(data[i]==target){
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args){
//        int[] data={24,15,25,27,8,8,9,9};
//        linersearch.LinerSearch linerSearch = new linersearch.LinerSearch();
//        int res =linerSearch.search(data,16);
//        System.out.println(res);
//    }

    /**
     *
     * @param data
     * @param target
     * @param <E>
     * @return
     */
    public static <E> int search(E[] data,E target) {
        for(int i=0 ;i<data.length;i++){
            if(data[i].equals(target)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){

        //差别，无需新建类的对象，search方法为static
//        linersearch.LinerSearch linerSearch = new linersearch.LinerSearch();
        int[] dataSize={1000000,10000000};
        for(int n: dataSize) {
            Integer[] data = ArrayGenerator.generateOrderedArray(n);
            long startTime = System.nanoTime();
            for (int k = 0; k < 100; k++) {
                LinerSearch.search(data, n);
            }
            long endTime = System.nanoTime();
            System.out.println("m=" + n + ",100次运行累计耗时：time：" + (endTime - startTime) / 1000000000.0 + "s");
        }
    }
}
