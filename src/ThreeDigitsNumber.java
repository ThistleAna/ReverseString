public class ThreeDigitsNumber {
    public static void main(String[] args) {
        // nested loop = consist of an outer loop and one or more inner loops
        // each time the outer loop is executed, the inner loops are executed again
        // this program is workbook 2a, question 7 Three Digits Code

        int counter= 0;
        for (int i =1; i<=4; i++ ) { // outer loop 1 - 4
            for (int j = 1; j <= 4; j++) { // inner loop 1 1-4
                for (int k = 1; k <= 4; k++) { // inner loop 2 1-4
                    if (i!=j && i!=k && j!=k ){
                        System.out.println(i + " "+ j + " " + k);
                        counter ++;
                    }
                }
            }
        }
        System.out.println("Total variable possible is " + counter);
    }
}
