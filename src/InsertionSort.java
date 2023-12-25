class InsertionSort{
    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2};
        int n = arr.length;

        //iterating through the array
        for (int i = 1; i < n ; i++){
            int current = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }


        for (int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
}