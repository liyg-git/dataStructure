package selectSort;

import java.util.Random;

/**
 * 数组生成器
 * @author 李永刚
 */
public class ArrayGenerator {
    private ArrayGenerator(){};

    /**
     *
     * @param n
     * @return Integer[]
     */
    public static Integer[] generateOrderedArray(int n){
        Integer[] arr = new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]=i;
        }
        return arr;
    }

    /**
     * 生成一个长度为n的随机数字，每个数字的范围是[0,bound)
     * @param n
     * @param bound
     * @return Integer[]
     */
    public static Integer[] generateRandomArray(int n,int bound){
        Integer[] arr = new Integer[n];
        Random random = new Random();
        for(int i=0;i<n;i++){
            arr[i]=random.nextInt(bound);
        }
        return arr;
    }
}
