import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringReader;

public class StandardOutputStream extends PrintStream {
    private BufferedReader br = new BufferedReader(new StringReader(""));

    public StandardOutputStream() {
        super(new ByteArrayOutputStream());
    }

    /**
     *Read one line of string
     * @return Characters that do not contain newlines. Null for termination
     */
    public String readLine() {
        String line;
        try {
            if ((line = br.readLine()) != null) return line;
            br = new BufferedReader(new StringReader(out.toString()));
            ((ByteArrayOutputStream) out).reset();
            return br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}