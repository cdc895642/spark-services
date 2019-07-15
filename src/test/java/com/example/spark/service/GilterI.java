package com.example.spark.service;

public interface GilterI {

  void doFilter(String input);

  GilterI addNext(GilterI next);
}
