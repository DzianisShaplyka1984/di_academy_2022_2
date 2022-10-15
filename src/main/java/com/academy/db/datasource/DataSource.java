package com.academy.db.datasource;

public interface DataSource {
  void connect();

  void query(String sql);

  void close();
}
