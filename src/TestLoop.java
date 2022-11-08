public class TestLoop {
    public static void main(String[] args) {
    // nested loop = consist of an outer loop and one or more inner loops
        // each time the outer loop is executed, the inner loops are executed again

    // this program will display number 10 to 99 : 10, 11, 12, 13, ... 19, 20, 21,...., 30, 31, 32....89, 90...99

        for (int x =1; x<=9; x++ ){ // outer loop
            for (int y=0; y <=9; y++){
                System.out.println(x + " " +y);
            }
        }


    }
}
