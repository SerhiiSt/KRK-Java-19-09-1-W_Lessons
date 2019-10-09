import java.util.Scanner;
import java.util.ArrayList;

public class Task6_Lesson2{
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum=0;
        System.out.println("Please provide your numbers: ");

        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = scanner.nextLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        for (int i = 0; i <list.size() ; i++) {
            sum +=Double.parseDouble(list.get(i));
        }

        System.out.println("Your sum is : " + sum);

    }
}
