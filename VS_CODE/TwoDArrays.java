import java.util.Scanner;
public static int[][] TwoDArrays(Scanner sc, int rows, int cols){
    int [][] matrix = new int[rows][cols];

    for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            matrix[i][j] = sc.nextInt();
        }
    }
    for(int i=0; i< rows; i++){
        for(int j=0; j<cols; j++){
            IO.print(matrix[i][j]+" ");
        }
        IO.println();
    }
    return matrix;
}

public static void TwoDArraysWithSum(int [][] number){
    for(int i=0; i<number.length; i++){
        int sum = 0;
        for(int j=0; j<number[i].length; j++){
            sum = sum + number[i][j];
        }
        IO.println("Row of "+(i+1)+ "Sum is: "+sum);

    }
}

static boolean TwoDArrayFindNumber(int [][] matrix,int rows,int cols,Scanner sc){
    IO.println("Enter xth value: ");
    int x = sc.nextInt();
    for(int i=0; i<rows ; i++){
        for(int j=0; j<cols ; j++){
            if(matrix[i][j] == x){
                IO.println("Number found at the index of: "+ "(" +i+","+j+")");
                return true;
            }
        }
    }
    IO.println("Number not found in the matrix");
    return false;
}
void main(){
    Scanner sc = new Scanner(System.in);
    IO.print("Enter rows number: ");
    int rows = sc.nextInt();
    IO.print("Enter cols number: ");
    int cols = sc.nextInt();

    int[][] result = TwoDArrays(sc, rows, cols);
    TwoDArraysWithSum(result);

    boolean answer = TwoDArrayFindNumber(result, rows, cols, sc);
    IO.print(answer);
}
