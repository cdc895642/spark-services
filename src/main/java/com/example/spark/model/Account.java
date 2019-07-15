package com.example.spark.model;

import java.math.BigDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@EqualsAndHashCode(exclude = {"balance"})
public class Account {

  @Getter
  private final String owner;
  @Getter
  private final Currency currency;
  @Getter
  @Setter
  private BigDecimal balance;

}
