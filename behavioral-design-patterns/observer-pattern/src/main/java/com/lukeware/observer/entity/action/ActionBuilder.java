package com.lukeware.observer.entity.action;

/**
 * @author diegomorais
 */
public final class ActionBuilder {

  private String action;
  private TypeAction type;

  private ActionBuilder() {
    super();
  }

  public static ActionBuilder builder() {
    return new ActionBuilder();

  }

  public ActionBuilder action(String action) {
    this.action = action;
    return this;
  }

  public ActionBuilder type(TypeAction type) {
    this.type = type;
    return this;
  }


  public IAction build() {
    return new Action(this.action, this.type);
  }

}
