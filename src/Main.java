import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
   public static void main(String[] args) {
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
      LocalDate dateOne = LocalDate.now();
      LocalDateTime dateTwo = LocalDateTime.now();
      Instant dateThree = Instant.now();
      LocalDate dateFour = LocalDate.parse("2024-07-09");
      LocalDateTime dateFive = LocalDateTime.parse("2024-07-09T09:16:13");
      Instant dateSix = Instant.parse("2024-07-09T09:16:13Z");
      Instant dateSeven = Instant.parse("2024-07-09T09:16:13-03:00");
      LocalDate dateEight = LocalDate.parse("20/07/2022", formatter);
      LocalDateTime dateNine = LocalDateTime.parse("20/07/2022 01:30", formatterTime);
      LocalDate dateTen = LocalDate.of(2023, 7, 4);
      LocalDateTime dateEleven = LocalDateTime.of(2023, 7, 4, 1, 30);


      System.out.println("date one= " + dateOne);
      System.out.println("date two= " + dateTwo);
      System.out.println("date three= " + dateThree);
      System.out.println("date four= " + dateFour);
      System.out.println("date five= " + dateFive);
      System.out.println("date six= " + dateSix);
      System.out.println("date seven= " + dateSeven);
      System.out.println("date eight= " + dateEight);
      System.out.println("date nine= " + dateNine);
      System.out.println("date ten= " + dateTen);
      System.out.println("date eleven= " + dateEleven);





   }
}
