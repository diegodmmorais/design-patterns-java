package com.lukeware.observer.entity.checkingaccount;

import com.lukeware.observer.entity.accountowner.IAccountOwner;

/**
 * @author Diego Morais
 */
public interface ICheckingAccount {
  String agency();

  String number();

  IAccountOwner accountOwner();
}
