package com.example.spark.service;

public class MyFilter implements GilterI {

  private GilterI next;

  public MyFilter() {

  }

  @Override
  public void doFilter(String input) {
    if (input == null) {
      return;
    } else {
      System.out.println("input");
      if (next != null) {
        next.doFilter(input);
      }
    }
  }

  @Override
  public GilterI addNext(GilterI next) {
    this.next = next;
    return next;
  }
}
