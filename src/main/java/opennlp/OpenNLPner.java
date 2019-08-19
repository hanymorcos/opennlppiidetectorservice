package opennlp;


import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import opennlp.tools.namefind.NameFinderME;
import opennlp.tools.namefind.TokenNameFinderModel;
import opennlp.tools.tokenize.SimpleTokenizer;
import opennlp.tools.util.Span;

class OpenNLPner
{

    public List<Span>  getPersons(String content) throws IOException
    {
        SimpleTokenizer tokenizer = SimpleTokenizer.INSTANCE;
        String[] tokens = tokenizer
        .tokenize(content);
    
        InputStream inputStreamNameFinder = getClass()
        .getResourceAsStream("/en-ner-person.bin");
        TokenNameFinderModel model = new TokenNameFinderModel(
        inputStreamNameFinder);
        NameFinderME nameFinderME = new NameFinderME(model);
        List<Span> spans = Arrays.asList(nameFinderME.find(tokens));

        return spans;
    }
}