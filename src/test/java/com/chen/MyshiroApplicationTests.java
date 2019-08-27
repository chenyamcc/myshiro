package com.chen;

import com.chen.util.MD5Encrypt;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.Test;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class MyshiroApplicationTests {

    @Test
    public void contextLoads() throws Exception {
        SimpleHash simpleHash = new SimpleHash("MD5", "123456", "xyz", 1024);
        System.out.println(simpleHash);
        String passWord = MD5Encrypt.getPassWord("123456");
        System.out.println(passWord);
    }

}
