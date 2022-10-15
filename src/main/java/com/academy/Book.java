package com.academy;

import lombok.Data;
import lombok.Setter;

@Data
public class Book {
  private String isbn;
  private String title;
  private Author author;
}
