package com.academy.db.datasource.impl;

import com.academy.db.datasource.DataSource;

public class OracleDataSource implements DataSource {
  public void connect() {
    System.out.println("Oracle connection was opened");
  }

  public void query(String sql) {
    System.out.println("Oracle " + sql + " was invoked");
  }

  public void close() {
    System.out.println("Oracle connection was closed");
  }
}
