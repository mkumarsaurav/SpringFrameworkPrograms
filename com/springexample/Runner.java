package com.springexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
   private static ApplicationContext context;

public static void main(String[] args) {
      context = new ClassPathXmlApplicationContext("BeansDI.xml");
      TextEditor te = (TextEditor) context.getBean("textEditor");
      te.spellCheck();
   }
}
