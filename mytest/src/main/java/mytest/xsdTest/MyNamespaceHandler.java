package mytest.xsdTest;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class MyNamespaceHandler extends NamespaceHandlerSupport {
	public void init() {
		registerBeanDefinitionParser("userTest", new UserBeanDefinitionParser());
	}
}
