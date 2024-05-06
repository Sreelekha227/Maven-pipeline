import static org.junit.Assert.assertEquals:
import org.junit.Test:
public class HelloTest {
@Test
Public void testGetHelloMessage(){
String expected = “Hello,World!”;
String actual = Hello.getHelloMessage();
assetEquals(expected,actual);
}
}
