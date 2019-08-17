package opennlp;

import java.io.IOException;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import opennlp.tools.util.Span;

@RestController
public class DataController {

    @PostMapping("/opennlp_ner")
    public List<Span> getdata(@RequestBody Data data) throws IOException {
        return (new OpenNLPner()).getPersons(data.getText());
    }
}
