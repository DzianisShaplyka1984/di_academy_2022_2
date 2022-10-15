package com.academy.db.datasource.impl;

import com.academy.db.datasource.DataSource;

public class MysqlDataSource implements DataSource {
  public void connect() {
    System.out.println("Mysql connection was opened");
  }

  public void query(String sql) {
    System.out.println("Mysql " + sql + " was invoked");
  }

  public void close() {
    System.out.println("Mysql connection was closed");
  }

  public void init() {
    System.out.println("Init Mysql datasource");
  }
}
