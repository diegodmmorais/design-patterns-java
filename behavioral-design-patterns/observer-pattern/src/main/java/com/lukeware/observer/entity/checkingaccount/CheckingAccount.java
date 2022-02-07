package com.lukeware.observer.entity.checkingaccount;

import com.lukeware.observer.entity.accountowner.IAccountOwner;

/**
 * @author Diego Morais
 */
final record CheckingAccount(String agency, String number, IAccountOwner accountOwner) implements ICheckingAccount {
}
