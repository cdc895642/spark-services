package com.example.spark.service;

import com.example.spark.exception.TransferException;
import com.example.spark.model.Account;
import java.math.BigDecimal;

public class TransferServiceImpl implements TransferService {

  public boolean sendMoney(Account from, Account to, BigDecimal amount) throws TransferException {
    if (!from.getCurrency().equals(to.getCurrency())) {
      throw new TransferException("currency must be the same in both accounts");
    }
    if (from.equals(to)) {
      throw new TransferException("accounts in transfer can not be the same");
    }
    return false;
  }
}
