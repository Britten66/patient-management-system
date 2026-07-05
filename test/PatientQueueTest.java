import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class PatientQueueTest {

    @Test
    public void testServeEmptyQueueReturnsNull() {
        PatientQueue queue = new PatientQueue();
        assertNull(queue.servePatient());
    }

    @Test
    public void testInsertAtPositionPlacesPatientCorrectly() {
        PatientQueue queue = new PatientQueue();
        queue.addPatient(new Patient(1, "Alice", "Smith", "111", LocalDate.now(), "Checkup"));
        queue.addPatient(new Patient(2, "Bob", "Jones", "222", LocalDate.now(), "Flu"));

        Patient emergency = new Patient(3, "Carl", "Emergency", "333", LocalDate.now(), "Urgent");
        queue.insertAtPosition(emergency, 1);

        Patient first = queue.servePatient();
        Patient second = queue.servePatient();

        assertEquals(1, first.getId());
        assertEquals(3, second.getId());
    }

    @Test
    public void testAddAndServeMaintainsFIFOOrder() {
        PatientQueue queue = new PatientQueue();
        queue.addPatient(new Patient(1, "Alice", "Smith", "111", LocalDate.now(), "Checkup"));
        queue.addPatient(new Patient(2, "Bob", "Jones", "222", LocalDate.now(), "Flu"));

        Patient served = queue.servePatient();
        assertEquals(1, served.getId());
    }
}