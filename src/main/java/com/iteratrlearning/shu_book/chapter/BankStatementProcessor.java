package com.iteratrlearning.shu_book.chapter;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class BankStatementProcessor {

	private final List<BankTransaction> bankTransactions;
	
	public BankStatementProcessor(final List<BankTransaction> bankTransactions) {
		this.bankTransactions = bankTransactions;
	}
	
	public double calculateTotalAmount() {
		double total = 0;
		for (final BankTransaction bankTransaction : bankTransactions) {
			total += bankTransaction.getAmount();
		}
		return total;
	}
	
//	public double calculateTotalInMonth(final Month month) {
//		double total = 0;
//		for (final BankTransaction bankTransaction : bankTransactions) {
//			if(bankTransaction.getDate().getMonth() == month) {
//				total += bankTransaction.getAmount();
//			}
//		}
//		return total;
//	}
	public double calculateTotalInMonth(final Month month) {
		return summarizeTransactions((acc, bankTransaction) -> 
										bankTransaction.getDate().getMonth() == month ? acc + bankTransaction.getAmount() : acc );
	}
	
	public double calculateTotalForCategory(final String category) {
		double total = 0;
		for (final BankTransaction bankTransaction : bankTransactions) {
			if(bankTransaction.getDescription().equals(category)) {
				total += bankTransaction.getAmount();
			}
		}
		return total;
	}
	
	//3¿Â
//	public List<BankTransaction> findTransactionsGreaterThanEqual(final int amount) {
//		final List<BankTransaction> result = new ArrayList<>();
//		for (final BankTransaction bankTransaction : bankTransactions) {
//			if (bankTransaction.getAmount() >= amount) {
//				result.add(bankTransaction);
//			}
//		}
//		return result;
//	}
	public List<BankTransaction> findTransactionsGreaterThanEqual(final int amount) {
		return findTransactions(bankTransaction -> bankTransaction.getAmount() >= amount);
	}
	
	public List<BankTransaction> findTransactionsInMonth(final Month month) {
		final List<BankTransaction> result = new ArrayList<>();
		for (final BankTransaction bankTransaction : bankTransactions) {
			if (bankTransaction.getDate().getMonth() == month) {
				result.add(bankTransaction);
			}
		}
		return result;
	}
	
	public List<BankTransaction> findTransactionsInMonthAndGreater(final Month month, final int amount) {
		final List<BankTransaction> result = new ArrayList<>();
		for (final BankTransaction bankTransaction : bankTransactions) {
			if (bankTransaction.getDate().getMonth() == month && bankTransaction.getAmount() >= amount) {
				result.add(bankTransaction);
			}
		}
		return result;
	}
	
	public List<BankTransaction> findTransactions(final BankTransactionFilter bankTransactionFilter) {
		final List<BankTransaction> result = new ArrayList<>();
		for (final BankTransaction bankTransaction : bankTransactions) {
			if (bankTransactionFilter.test(bankTransaction)) {
				result.add(bankTransaction);
			}
		}
		return result;
	}
	
	// 3-11
	public double summarizeTransactions(final BankTransactionSummarizer bankTrasactionSummarizer) {
		double result = 0;
		for (final BankTransaction bankTransaction : bankTransactions) {
			result = bankTrasactionSummarizer.summarize(result, bankTransaction);
		}
		return result;
	}

 	
}
