import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BracerCheckerShould {

    /* TODO
     "" => False
     number => False
     "madrid" => False
     "(){}[]"   =>  True
     "([{}])"   =>  True
     "(}"       =>  False
     "[(])"     =>  False
      "[({})](]" =>  False
     *
     */


    BracerChecker bracerChecker = new BracerChecker();

    @Test
    public void not_allow_empty_strings(){
        assertFalse(bracerChecker.stringValidator(""));
    }
    @Test
    public void just_allow_braces(){
        assertFalse(bracerChecker.stringValidator("hola"));
        assertFalse(bracerChecker.stringValidator("245"));
        assertFalse(bracerChecker.stringValidator("&*@#$"));
        assertFalse(bracerChecker.stringValidator("_-==+"));
    }

}
