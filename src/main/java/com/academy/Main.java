package com.academy;

import com.academy.db.DataBaseManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

  public static void main(String[] args) {


    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    DataBaseManager dataBaseManager = context.getBean("manager", DataBaseManager.class);

    dataBaseManager.connect();
    dataBaseManager.query("select * from book");
    dataBaseManager.close();

    DataBaseManager second = context.getBean("secondManager", DataBaseManager.class);

    second.connect();
    second.query("select * from employee");
    second.close();

    Author author = context.getBean(Author.class);

    System.out.println(dataBaseManager.getDataSource().equals(second.getDataSource()));
    System.out.println(dataBaseManager.equals(second));


  }
}
