package com.example.spark.service;

import org.junit.Test;

public class FilterTest {

  @Test
  public void test() {
    MyFilter filter1=new MyFilter();
    MyFilter filter2=new MyFilter();
    MyFilter filter3=new MyFilter();
    filter1
        .addNext(filter2)
        .addNext(filter3);
    filter1.doFilter("int");
  }
}
