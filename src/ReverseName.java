import java.util.Scanner;

class ReverseName {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in); // create object scanner
        System.out.println("Enter name: ");

        String originalStr = reader.nextLine();
        String reversedStr = "";

        for (int i =0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
            System.out.println(reversedStr);
        }

        System.out.println(reversedStr);

    }
}
