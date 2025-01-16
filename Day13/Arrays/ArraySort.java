package Arrays;

public class ArraySort {
    public int[] sort(int[] arrays){
        if(arrays == null){
            throw new NullPointerException("Array cannot be null");
        }
        for(int i=0;i<arrays.length;i++){
            for(int j=0;j<arrays.length;j++){
                if(arrays[i]<arrays[j]){
                    int temp = arrays[i];
                    arrays[i] = arrays[j];
                    arrays[j] = temp;
                }
            }
        }
        return arrays;
    }
}
