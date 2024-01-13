import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Keywords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lst = new ArrayList<String>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            lst.add(sc.nextLine().toLowerCase().replace("-", " "));
        }

        System.out.println(new HashSet<String>(lst).size());
    }
}
