import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("enter something");
       String input = sc.nextLine();
       boolean isNumber = StringUtils.isNumeric(input);

       String swapCase = StringUtils.swapCase(input);

       String reverse = StringUtils.reverse(input);

        System.out.println(isNumber);
        System.out.println(swapCase);
        System.out.println(reverse);
    }
}
