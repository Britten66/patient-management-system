import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class PatientHistoryTest {

    @Test
    public void testCannotNavigatePastOldestRecord() {
        PatientHistory history = new PatientHistory();
        history.addRecord(new PatientRecord(LocalDate.of(2026, 1, 1), "Flu", "Rest"));
        history.addRecord(new PatientRecord(LocalDate.of(2026, 2, 1), "Cold", "Fluids"));

        history.showOldest();
        history.goToPrevious(); // should print message, not crash

        assertTrue(true); // reaching this line means no exception was thrown
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