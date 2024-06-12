import java.util.Scanner;


public class MatrixFun {
    public static int[][] inputMatrix(Scanner reader) {
        int row = reader.nextInt();

        int[][] matrix = new int[row][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                matrix[i][j] = reader.nextInt();
            }
        }
        return matrix;
    }

    public static boolean isOESumBalance(int[][] matr) {
        int no = 0;
        int ne = 0;
        for(int i = 0; i < matr.length; i++){
            for(int j = 0; j < matr[0].length; j++){
                if(matr[i][j] % 2 == 0){
                    ne++;
                }else{
                    no++;
                }
            }
        }
        return Math.abs(no - ne) >= matr.length;
    }

    public static boolean isContainsHill(int[][] matr) {
        boolean notBelow = false;
        for (int i = 1; i < matr.length - 1; i++) {
            for (int j = 1; j < matr.length - 1; j++) {
                if (matr[i][j] >= matr[i - 1][j - 1] && matr[i][j] >= matr[i - 1][j] && matr[i][j] >= matr[i - 1][j + 1] &&
                        matr[i][j] >= matr[i + 1][j - 1] && matr[i][j] < matr[i + 1][j] && matr[i][j] >= matr[i + 1][j + 1] &&
                        matr[i][j] >= matr[i][j - 1] && matr[i][j] >= matr[i][j + 1]) {
                    notBelow = false;
                    break;
                } else{
                    notBelow =  true;
                }
            }
        }
        return notBelow;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isContainsHill(inputMatrix(sc)));
    }
}