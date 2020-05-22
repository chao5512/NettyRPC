package come.chao.test;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.junit.Test;

public class Lang3Test {
    private String s = "ss";
    private String s1 = "ssss";

    @Override
    public String toString(){
        return ReflectionToStringBuilder.toString(this);
        //return ReflectionToStringBuilder.toStringExclude(this, new String[]{"typeParameters", "s1"});
    }

    @Test
    public void print(){
        System.out.println(new Lang3Test());
    }
}
