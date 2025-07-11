import java.util.Scanner;

public class PasswordFormatMatcher {
    static boolean isvalid(String password) {
        if (!(password.length() >= 8 && password.length() <= 15)) {
            return false;
        }
        if (password.contains(" ")) {
            return false;
        }
        if (true) {
            int count = 0;
            for (int i = 0; i <= 9; i++) {
                String p = Integer.toString(i);
                if (password.contains(p)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }
        if (!(password.contains("@") || password.contains("#")
                || password.contains("!") || password.contains("~")
                || password.contains("$") || password.contains("%")
                || password.contains("^") || password.contains("&")
                || password.contains("*") || password.contains("(")
                || password.contains(")") || password.contains("-")
                || password.contains("+") || password.contains("/")
                || password.contains(":") || password.contains(".")
                || password.contains(", ") || password.contains("<")
                || password.contains(">") || password.contains("?")
                || password.contains("|"))) {
            return false;
        }
        if (true) {
            int count = 0;
            for (int i = 65; i <= 90; i++) {
                char c = (char) i;
                String s = Character.toString(c);
                if (!password.contains(s)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }
        if (true) {
            int count = 0;
            for (int i = 90; i <= 122; i++) {
                char c = (char) i;
                String s = Character.toString(c);
                if (!password.contains(s)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password : ");
        String password = sc.next();
        String result = (isvalid(password)) ? "Valid" : "Invalid";
        System.out.println(result);
    }
}
/*
output:
Enter password :
Kanpur83033
Invalid
Enter password :
Kanpur@83033
Valid
 */