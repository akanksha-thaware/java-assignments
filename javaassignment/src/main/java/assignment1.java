import java.io.*;
import java.util.*;
import java.util.regex.*;

public class  assignment1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter regular expression: ");
            String regex = scanner.nextLine();

            Pattern pattern = Pattern.compile(regex);

            File homeDir = new File(System.getProperty("user.home"));

            searchFiles(homeDir, pattern);
        }
    }

    public static void searchFiles(File dir, Pattern pattern) {
        File[] files = dir.listFiles();

        if (files == null) {
            return;
        }

        for (File file : files) {
            if (file.isDirectory()) {
                searchFiles(file, pattern);
            } else {
                Matcher matcher = pattern.matcher(file.getName());
                if (matcher.matches()) {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}

