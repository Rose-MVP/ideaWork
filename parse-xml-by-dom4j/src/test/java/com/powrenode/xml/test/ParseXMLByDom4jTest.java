package com.powrenode.xml.test;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.InputStream;

public class ParseXMLByDom4jTest {
    @Test
    public void testParseMyBatisConfigXML() throws Exception {
        SAXReader reader =new SAXReader();
       InputStream IS = ClassLoader.getSystemClassLoader().getResourceAsStream("mybatis-config.xml");
        Document document =reader.read(IS);

        Element rootElt = document.getRootElement();
        String rootEltName = rootElt.getName();
        System.out.println("根节点的名字"+rootEltName);
    }
}
