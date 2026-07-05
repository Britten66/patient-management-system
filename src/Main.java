
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PatientQueue waitingRoom = new PatientQueue();
        PatientHistory history = new PatientHistory();
        Scanner scanner = new Scanner(System.in);

        loadSampleHistory(history);

        boolean running = true;
        while (running) {
            printMenu();
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("Patient ID: ");
                    int id = Integer.parseInt(scanner.nextLine().trim());
                    System.out.print("First Name: ");
                    String fname = scanner.nextLine().trim();
                    System.out.print("Last Name: ");
                    String lname = scanner.nextLine().trim();
                    System.out.print("Phone Number: ");
                    String phone = scanner.nextLine().trim();
                    System.out.print("Reason for visit: ");
                    String reason = scanner.nextLine().trim();
                    waitingRoom.addPatient(new Patient(id, fname, lname, phone, LocalDate.now(), reason));
                    System.out.println("Patient added to the waiting room.");
                    break;

                case "2":
                    Patient served = waitingRoom.servePatient();
                    if (served != null) {
                        System.out.println("Serving: " + served);
                    }
                    break;

                case "3":
                    System.out.print("Patient ID: ");
                    int eid = Integer.parseInt(scanner.nextLine().trim());
                    System.out.print("First Name: ");
                    String efname = scanner.nextLine().trim();
                    System.out.print("Last Name: ");
                    String elname = scanner.nextLine().trim();
                    System.out.print("Phone Number: ");
                    String ephone = scanner.nextLine().trim();
                    System.out.print("Reason for visit: ");
                    String ereason = scanner.nextLine().trim();
                    System.out.print("Insert at position: ");
                    int pos = Integer.parseInt(scanner.nextLine().trim());
                    waitingRoom.insertAtPosition(new Patient(eid, efname, elname, ephone, LocalDate.now(), ereason), pos);
                    break;

                case "4":
                    waitingRoom.printQueue();
                    break;

                case "5":
                    history.goToNext();
                    history.showCurrent();
                    break;

                case "6":
                    history.goToPrevious();
                    history.showCurrent();
                    break;

                case "7":
                    history.showNewest();
                    break;

                case "8":
                    history.showOldest();
                    break;

                case "9":
                    running = false;
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n--- Patient Management System ---");
        System.out.println("1. Add patient to waiting room");
        System.out.println("2. Serve next patient");
        System.out.println("3. Insert patient at position (emergency)");
        System.out.println("4. Print waiting room");
        System.out.println("5. Next history record");
        System.out.println("6. Previous history record");
        System.out.println("7. Show newest history record");
        System.out.println("8. Show oldest history record");
        System.out.println("9. Exit");
        System.out.print("Choose an option: ");
    }

    private static void loadSampleHistory(PatientHistory history) {
        history.addRecord(new PatientRecord(LocalDate.of(2026, 1, 5), "Flu", "Rest and fluids"));
        history.addRecord(new PatientRecord(LocalDate.of(2026, 1, 20), "Sprained ankle", "Ice and compression"));
        history.addRecord(new PatientRecord(LocalDate.of(2026, 2, 10), "Migraine", "Prescribed pain medication"));
        history.addRecord(new PatientRecord(LocalDate.of(2026, 2, 28), "Allergic reaction", "Antihistamines given"));
        history.addRecord(new PatientRecord(LocalDate.of(2026, 3, 15), "Broken wrist", "Cast applied"));
        history.addRecord(new PatientRecord(LocalDate.of(2026, 4, 2), "Common cold", "Rest advised"));
        history.addRecord(new PatientRecord(LocalDate.of(2026, 4, 25), "Ear infection", "Antibiotics prescribed"));
        history.addRecord(new PatientRecord(LocalDate.of(2026, 5, 10), "Back pain", "Physiotherapy referral"));
        history.addRecord(new PatientRecord(LocalDate.of(2026, 6, 1), "High blood pressure", "Medication adjusted"));
        history.addRecord(new PatientRecord(LocalDate.of(2026, 6, 20), "Routine checkup", "No issues found"));
    }
}
