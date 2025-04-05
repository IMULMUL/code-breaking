package com.ar3h.postgresqljdbcattack;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.sun.org.apache.xerces.internal.parsers.XMLParser;

public class XMLTest {
    public static void main(String[] args) throws Exception {
        new ClassPathXmlApplicationContext("file:///D:/pro/code-breaking/2025/poc.xml");
    }
}
