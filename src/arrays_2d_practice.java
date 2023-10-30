import java.util.Scanner;

class Array2dQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No of rows: ");
        int n = sc.nextInt();
        System.out.print("No of columns: ");
        int m = sc.nextInt();

        int[][] MyTable = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++){
                System.out.print("row: "+i+" column: "+j+" : ");
                MyTable[i][j] = sc.nextInt();
            }
        }

        int RowStart = 0;
        int RowEnd = n - 1;
        int ColumnStart = 0;
        int ColumnEnd = m - 1;

        while (RowStart <= RowEnd && ColumnStart <= ColumnEnd) {
            for(int i = ColumnStart; i<= ColumnEnd; i++){
                System.out.print(MyTable[RowStart][i]+" | ");
            }
            RowStart++;

            for(int i = RowStart; i <= RowEnd; i++){
                System.out.print(MyTable[i][ColumnEnd]+" | ");
            }
            ColumnEnd--;

            for(int i = ColumnEnd; i >= ColumnStart; i--){
                System.out.print(MyTable[RowEnd][i]+" | ");
            }
            RowEnd--;

            for(int i = RowEnd; i >= RowStart; i--){
                System.out.print(MyTable[i][ColumnStart]+" | ");
            }
            ColumnStart++;
        }
    }


}



class Array2dQuestion2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No of rows: ");
        int n = sc.nextInt();
        System.out.print("No of columns: ");
        int m = sc.nextInt();

        int[][] MyTable = new int[n][m];
        int a=1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++){
                MyTable[i][j] = a;
                a++;
            }
        }

        for(int i = 0;  i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.println(MyTable[j][i]);
            }
            System.out.println("\n\n\n");
        }

    }

}