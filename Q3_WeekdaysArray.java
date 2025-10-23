import java.util.Scanner;

class WeekdayFinder {
    public static void main(String[] args) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day index (0–6): ");
        try {
            int index = sc.nextInt();
            if (index < 0 || index > 6) throw new ArrayIndexOutOfBoundsException();
            System.out.println("Day: " + weekdays[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index must be between 0 and 6.");
        } catch (Exception e) {
            System.out.println("Invalid input! Enter an integer between 0 and 6.");
        } finally {
            sc.close();
        }
    }
}