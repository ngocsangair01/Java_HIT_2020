package ChuanHoa;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String ans = "";
        char b = ' ';
        int i = 0, n = s.length();
        char a = s.charAt(0);
        while (a == ' '){
            i++;
            a = s.charAt(i);
        }
        a = s.charAt(n - 1);
        while (a == ' '){
            n--;
            a = s.charAt(n - 1);
        }
        for (; i < n; i++){
            a = s.charAt(i);
            if (a == ' ') b = s.charAt(i + 1);
            while (a == ' ' && b == ' ') {
                i++;
                a = s.charAt(i); b = s.charAt(i + 1);
            }
            if(a <= 'z' && a >= 'a' && (i == 0 || s.charAt(i - 1) == ' '))
            ans += (char) (a - 'a' + 'A');
            else ans += a;
        }
        System.out.println(ans);
    }
}
