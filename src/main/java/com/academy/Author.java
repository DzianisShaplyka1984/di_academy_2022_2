package com.academy;

import java.util.Map;
import java.util.Properties;
import java.util.Set;
import lombok.Data;

@Data
public class Author {
  private Map<String, Book> books;
  private Set<String> alias;
  private String name;
  private Map<String, String> phones;
  private Properties props;
  private double pi;
  private int age;
  private boolean adult;

  public Author(int age) {
    this.age = age;
  }
}
