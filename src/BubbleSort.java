
class BubbleSort{
    public static void main(String[] args) {
        int[] numbers = {7,8,3,1,2};
        int Length = numbers.length;

        for (int i = 0; i < Length -1; i++){
            for (int j = 0; j < Length -i-1; j++){
                if(numbers[j] > numbers[j+1]){
                    int box = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = box;
                }
            }
        }
        for (int i = 0; i < Length; i++){
            System.out.println(numbers[i]);
        }
    }
}