package com.cts.microservices.transactions.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.microservices.transactions.model.Transaction;

@Service
public class TransactionServiceImpl implements TransactionService{

	@Override
	public Transaction getTransactionDetail(long transactionId) {
		Transaction transaction = new Transaction(transactionId, "123", "FromAcc-Detail", "2014-12-12", transactionId);
		return transaction;
	}

	@Override
	public List<Transaction> getTransactions(String accountId) {
		List<Transaction> transactions = new ArrayList<Transaction>();
		for(int i=0; i<3; i++){
			Transaction transaction = new Transaction(i, accountId, "FromAcc-"+i, "2014-12-12", 10);
			transactions.add(transaction);
		}
		
		return transactions;
	}

}
