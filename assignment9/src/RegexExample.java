
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexExample {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog.";
        String regex = "^[A-Z].*\\.$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);
        if (matcher.matches()) {
            System.out.println("The sentence matches the pattern.");
        } else {
            System.out.println("The sentence does not match the pattern.");
        }
    }
}
