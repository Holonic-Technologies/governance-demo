package net.chrisrichardson.ftgo.orderservice.domain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class OrderAuditReader {

  public String readFirstEntry(String path) throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader(path));
    return reader.readLine();
  }
}
