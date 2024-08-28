public class Array2DProblem {
    public static void main(String[] args) {
        int [][]arr={{1, 1, 1, 0, 0, 0},
                     {0, 1, 0, 0, 0, 0},
                     {1, 1, 1, 0, 0, 0},
                     {0, 0, 2, 4, 4, 0},
                     {0, 0, 0, 2, 0, 0},
                     {0, 0, 1, 2, 4, 0}};
        
        int sum=0,count=0;
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(arr[i][j]>0){
                    for(int x=i;x<(i+3);x++){
                        for(int y=j;y<(j+3);y++){
                            count=0;
                            count+=arr[x][y];
                        }
                    }
                    if(sum<count){
                        sum=count;
                    }
                }
            }
        }
        System.out.print("Sum is: "+sum);
    }
}
