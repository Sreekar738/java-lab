import java.util.*;
import CIE.*;
import SEE.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Internals ciestudents[] = new Internals[n];
        External seestudents[] = new External[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));

            System.out.print("USN: ");
            String usn = sc.next();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Semester: ");
            int sem = sc.nextInt();

            int[] internals = new int[5];
            System.out.println("Enter 5 internal marks:");
            for (int j = 0; j < 5; j++) internals[j] = sc.nextInt();

            int[] see = new int[5];
            System.out.println("Enter 5 SEE marks:");
            for (int j = 0; j < 5; j++) see[j] = sc.nextInt();

            ciestudents[i] = new Internals(usn, name, sem, internals);
            seestudents[i] = new External(usn, name, sem, see);
        }

    
        System.out.println("\n----- FINAL MARKS -----");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent: " + ciestudents[i].name + " (" + ciestudents[i].usn + ")");
            for (int j = 0; j < 5; j++) {
                int finalMarks = ciestudents[i].internalMarks[j] + (seestudents[i].seeMarks[j] / 2);
                System.out.println("Course " + (j + 1) + ": " + finalMarks);
            }
        }

        sc.close();
    }
}
