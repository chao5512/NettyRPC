package come.chao.test;

import com.newlandframework.rpc.configuration.YamlReader;
import org.junit.Test;

public class YamlTest {
    @Test
    public void testRead(){
        System.out.println(YamlReader.getInstance().getValueByKey("server" ,"port"));
    }
}
