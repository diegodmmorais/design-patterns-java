package com.lukeware.observer.entity.representative;

import com.lukeware.observer.entity.accountowner.IAccountOwner;

/**
 * @author Diego Morais
 */
public interface IRepresentative extends IAccountOwner {

  String firstName();

  String lastName();
}
