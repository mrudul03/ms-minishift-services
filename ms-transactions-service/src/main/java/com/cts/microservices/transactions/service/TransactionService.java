package com.cts.microservices.transactions.service;

import java.util.List;

import com.cts.microservices.transactions.model.Transaction;

public interface TransactionService {

	public Transaction getTransactionDetail(long transactionId);
	
	public List<Transaction> getTransactions(String accountId);
}
