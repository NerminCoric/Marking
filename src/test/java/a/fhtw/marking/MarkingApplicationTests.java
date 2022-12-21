package a.fhtw.marking;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest

class UptimeControllerTest {

    @Test
    void Marking() {
        // A - Arrange
        MarkingController controller = new MarkingController();

        // A - Act
        var result = controller.mark(60);

        // A - Assert
        assertEquals(60, result);
    }

}