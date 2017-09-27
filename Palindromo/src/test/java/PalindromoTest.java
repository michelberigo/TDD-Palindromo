import com.mycompany.palindromo.Palindromo;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import org.junit.Test;

public class PalindromoTest {

    @Test
    public void PalindromoTeste()
    {
    	String Palindromo1 = "Amor é Roma";
        assertTrue (new Palindromo().ehPalindromo(Palindromo1));
        
        String Palindromo2 = "11211";
        assertTrue (new Palindromo().ehPalindromo(Palindromo2));
    }
    
    @Test
    public void NaoPalindromoTeste()
    {
    	String frasePalindromo = "Queria estar morto";
        assertFalse (new Palindromo().ehPalindromo(frasePalindromo));
    }
}
