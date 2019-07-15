package com.example.spark.service;

import com.example.spark.exception.TransferException;
import com.example.spark.model.Account;
import com.example.spark.model.Currency;
import java.math.BigDecimal;
import org.junit.Test;

public class TransferServiceTest {

  @Test(expected = TransferException.class)
  public void sendMoney_differentCurrency_throwsException() throws TransferException {
    //Arrange
    Account from = new Account("owner1", Currency.EUR);
    Account to = new Account("owner2", Currency.USD);
    TransferService transferService = new TransferServiceImpl();

    //Act
    transferService.sendMoney(from, to, BigDecimal.ONE);
    //Assert
  }

  @Test(expected = TransferException.class)
  public void sendMoney_theSameAccount_throwsException() throws TransferException {
    //Arrange
    Account from = new Account("owner1", Currency.EUR);
    Account to = new Account("owner1", Currency.EUR);
    TransferService transferService = new TransferServiceImpl();

    //Act
    transferService.sendMoney(from, to, BigDecimal.ONE);
    //Assert
  }

}