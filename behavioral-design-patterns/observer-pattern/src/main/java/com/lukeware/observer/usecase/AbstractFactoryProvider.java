package com.lukeware.observer.usecase;

import com.lukeware.observer.usecase.checkingaccount.CheckingAccountFactory;
import com.lukeware.observer.usecase.company.CompanyFactory;
import com.lukeware.observer.usecase.representative.RepresentativeFactory;

import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Diego Morais
 */
public final class AbstractFactoryProvider {

  private static AbstractFactoryProvider instance;

  private AbstractFactoryProvider() {
    super();
  }

  public static AbstractFactoryProvider getInstance() {
    if (Objects.isNull(instance)) {
      synchronized (AbstractFactoryProvider.class) {
        if (Objects.isNull(instance)) {
          instance = new AbstractFactoryProvider();
        }
      }
    }
    return instance;
  }

  public IRuleFactory create(FactoryType type) {
    return switch (type) {
      case COMPANY -> CompanyFactory.getInstance();
      case REPRESENTATIVE -> RepresentativeFactory.getInstance();
      case CHECKING_ACCOUNT -> CheckingAccountFactory.getInstance();
    };
  }


  public Set<IRuleFactory> createAll() {
    return getRulesFactory();
  }

  private Set<IRuleFactory> getRulesFactory() {
    return Stream.of(FactoryType.values())
                 .map(type -> AbstractFactoryProvider.getInstance().create(type))
                 .collect(Collectors.toSet());
  }

}
