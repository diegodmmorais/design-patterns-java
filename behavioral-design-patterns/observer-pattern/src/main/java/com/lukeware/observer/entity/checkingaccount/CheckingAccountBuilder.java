package com.lukeware.observer.entity.checkingaccount;

import com.lukeware.observer.entity.accountowner.IAccountOwner;

/**
 * @author Diego Morais
 */
public final class CheckingAccountBuilder {

  String agency;
  String number;
  IAccountOwner accountOwner;

  private CheckingAccountBuilder() {
    super();
  }

  public static CheckingAccountBuilder builder() {
    return new CheckingAccountBuilder();
  }


  public CheckingAccountBuilder agency(String agency) {
    this.agency = agency;
    return this;
  }

  public CheckingAccountBuilder number(String number) {
    this.number = number;
    return this;
  }


  public CheckingAccountBuilder accountOwner(IAccountOwner accountOwner) {
    this.accountOwner = accountOwner;
    return this;
  }

  public ICheckingAccount build() {
    return new CheckingAccount(this.agency, this.number, this.accountOwner);
  }

}
