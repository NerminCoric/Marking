package a.fhtw.marking;


import jdk.jshell.spi.ExecutionControl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.security.InvalidParameterException;

@RestController
public class MarkingController {

    @GetMapping("/complementary")
    public String mark(@RequestParam int percentage) {

           if (percentage >= 88)
            return "1";
        if ((percentage >= 75) && (percentage < 88))
            return "2";
        if ((percentage >= 63) && (percentage < 75))
            return "3";
        if ((percentage >= 50) && (percentage < 63))
            return "4";
        if (percentage < 50)
            return "5";
        if (percentage > 100)
            throw new InvalidParameterException();
        else
            throw new InvalidParameterException();
    }
}





