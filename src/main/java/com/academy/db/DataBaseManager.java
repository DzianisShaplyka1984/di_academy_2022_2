package com.academy.db;

import com.academy.db.datasource.DataSource;
import lombok.Data;

@Data
public class DataBaseManager {
  private DataSource dataSource;
  private String name;

  public DataBaseManager(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  public DataBaseManager() {
  }

  public void init() {
    System.out.println("Init " + name);
    connect();
  }
  public void connect() {
    dataSource.connect();
  }

  public void query(String sql) {
    dataSource.query(sql);
  }

  public void close() {
    dataSource.close();
  }

  public void destroy() {
    close();
  }
}
