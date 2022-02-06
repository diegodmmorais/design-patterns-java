package com.lukeware.observer.entity.proposal;

import com.lukeware.observer.entity.checkingaccount.ICheckingAccount;
import com.lukeware.observer.entity.company.IComapny;
import com.lukeware.observer.entity.representative.IRepresentative;

/**
 * @author diegomorais
 */
final record Proposal(String identifierCode,
                      IComapny comapny,
                      IRepresentative representative,
                      ICheckingAccount checkingAccount) implements IProposal {

}
