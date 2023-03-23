import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi kí tự : ");
        String input = scanner.nextLine();
        String maxString = "";
        for (int i = 0; i < input.length(); i++) {
           String currentString = String.valueOf(input.charAt(i));
            for (int j = i; j < input.length(); j++) {
                int lastIndex = currentString.length()-1;
                if (currentString.charAt(lastIndex)<input.charAt(j)){
                    currentString+=input.charAt(j);
                }
            }
            if (maxString.length()<currentString.length()) {
                maxString = currentString;
            }
        }
        System.out.println("Chuối tăng dần dài nhất là : " + maxString);
    }
}
