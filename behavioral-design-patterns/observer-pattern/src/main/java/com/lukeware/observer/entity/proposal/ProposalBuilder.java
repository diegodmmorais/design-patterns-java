package com.lukeware.observer.entity.proposal;

import com.lukeware.observer.entity.checkingaccount.ICheckingAccount;
import com.lukeware.observer.entity.company.IComapny;
import com.lukeware.observer.entity.representative.IRepresentative;

/**
 * @author Diego Morais
 */
public final class ProposalBuilder {

  String identifierCode;
  IComapny comapny;
  IRepresentative representative;
  ICheckingAccount checkingAccoun;

  private ProposalBuilder() {
    super();
  }

  public static ProposalBuilder builder() {
    return new ProposalBuilder();
  }

  public ProposalBuilder comapny(IComapny comapny) {
    this.comapny = comapny;
    return this;
  }

  public ProposalBuilder checkingAccoun(ICheckingAccount checkingAccoun) {
    this.checkingAccoun = checkingAccoun;
    return this;
  }

  public ProposalBuilder identifierCode(String identifierCode) {
    this.identifierCode = identifierCode;
    return this;
  }

  public ProposalBuilder representative(IRepresentative representative) {
    this.representative = representative;
    return this;
  }

  public IProposal build() {
    return new Proposal(this.identifierCode, this.comapny, this.representative, this.checkingAccoun);
  }


}
