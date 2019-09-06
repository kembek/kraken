package com.kraken.analysis.entity;

public enum ResultStatus {
  STARTING(false),
  RUNNING(false),
  COMPLETED(true),
  CANCELED(true),
//  TODO a supprimer ?
  FAILED(true);

  ResultStatus(boolean terminal) {
    this.terminal = terminal;
  }

  protected boolean terminal;

  public boolean isTerminal() {
    return this.terminal;
  }
}
