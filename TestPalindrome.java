import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestPalindrome{
  @Test
  public  void Testcase1(){
    assertTrue(PalindromeCheck.isPalindrome("a"));
  }
  @Test
  public  void Testcase2(){
    assertTrue(PalindromeCheck.isPalindrome("aba"));
  }
  @Test
  public  void Testcase3(){
    assertTrue(!PalindromeCheck.isPalindrome("aaad"));
  }

}
