package barry.tool.command;

import org.assertj.core.util.Strings;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CommandApplicationTests {

    @Test
    void hello() {
        String hello = "hello";
        String world = "world";
        Assert.assertEquals("hello world", Strings.concat(hello, " ", world));
    }

}
