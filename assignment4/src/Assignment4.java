
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String[] dates = sc.nextLine().split(" ");
            LocalDate signupDate = LocalDate.parse(dates[0], DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            LocalDate currentDate = LocalDate.parse(dates[1], DateTimeFormatter.ofPattern("dd-MM-yyyy"));

            LocalDate anniversaryDate = signupDate.withYear(currentDate.getYear());
            if (anniversaryDate.isAfter(currentDate)) {
                anniversaryDate = anniversaryDate.minusYears(1);
            }

            LocalDate startDate = anniversaryDate.minusDays(30);
            LocalDate endDate = anniversaryDate.plusDays(30);

            if (startDate.isAfter(currentDate) || endDate.isBefore(signupDate)) {
                System.out.println("No range");
            } else {
                startDate = startDate.isBefore(signupDate) ? signupDate : startDate;
                endDate = endDate.isAfter(currentDate) ? currentDate : endDate;
                System.out.println(startDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + " " + endDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
            }
        }
    }
}
