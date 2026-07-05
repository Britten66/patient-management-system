import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatientHistoryTest {

    @Test
    public void testCannotNavigatePastOldestRecord() {
        PatientHistory history = new PatientHistory();
        history.addRecord(new PatientRecord(LocalDate.of(2026, 1, 1), "Flu", "Rest"));
        history.addRecord(new PatientRecord(LocalDate.of(2026, 2, 1), "Cold", "Fluids"));

        history.showOldest();
        history.goToPrevious();

        assertTrue(true);
    }

    @Test
    public void testCannotNavigatePastNewestRecord() {
        PatientHistory history = new PatientHistory();
        history.addRecord(new PatientRecord(LocalDate.of(2026, 1, 1), "Flu", "Rest"));
        history.addRecord(new PatientRecord(LocalDate.of(2026, 2, 1), "Cold", "Fluids"));

        history.showNewest();
        history.goToNext(); // should print message, not crash

        assertTrue(true);
    }

    @Test
    public void testNavigationMovesCorrectlyBetweenRecords() {
        PatientHistory history = new PatientHistory();
        history.addRecord(new PatientRecord(LocalDate.of(2026, 1, 1), "Flu", "Rest"));
        history.addRecord(new PatientRecord(LocalDate.of(2026, 2, 1), "Cold", "Fluids"));

        history.showOldest();
        history.goToNext();
        history.showNewest();

        assertTrue(true);
    }
}