package Arrays;
public class Add2D {
    public static void main(String[] args) {
        int sum=0;
        int[][] arr = {{1,2,3},{1,2,3,4}};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
