class SelectionSort{
    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2};
        int n = arr.length - 1;


        for (int i = 0; i < n; i++){
            int smallest = i;

            for(int j = i ; j < n; j++){
                if (arr[j] > arr[j+1]){
                    //set smallest
                    smallest = j+1;
                }
            }

            int box = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = box;
        }

        for (int i = 0; i < n+1; i++){
            System.out.println(arr[i]);
        }
    }
}

