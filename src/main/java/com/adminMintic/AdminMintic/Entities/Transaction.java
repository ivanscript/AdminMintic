package com.adminMintic.AdminMintic.Entities;

import java.util.Date;

public class Transaction {
    private String idTransaction;
    private String conceptTransaction;
    private Double incomes;
    private Double outcomes;
    private Date date;

    public Transaction(String idTransaction, String conceptTransaction, Double incomes, Double outcomes, Date date) {
        this.idTransaction = idTransaction;
        this.conceptTransaction = conceptTransaction;
        this.incomes = incomes;
        this.outcomes = outcomes;
        this.date = date;
    }

    public Transaction(){}

    public String getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(String idTransaction) {
        this.idTransaction = idTransaction;
    }

    public String getConceptTransaction() {
        return conceptTransaction;
    }

    public void setConceptTransaction(String conceptTransaction) {
        this.conceptTransaction = conceptTransaction;
    }

    public Double getIncomes() {
        return incomes;
    }

    public void setIncomes(Double incomes) {
        this.incomes = incomes;
    }

    public Double getOutcomes() {
        return outcomes;
    }

    public void setOutcomes(Double outcomes) {
        this.outcomes = outcomes;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
