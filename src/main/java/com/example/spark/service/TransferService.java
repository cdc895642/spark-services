package com.example.spark.service;

import com.example.spark.exception.TransferException;
import com.example.spark.model.Account;
import java.math.BigDecimal;

public interface TransferService {

  public boolean sendMoney(Account from, Account to, BigDecimal amount) throws TransferException;
}
