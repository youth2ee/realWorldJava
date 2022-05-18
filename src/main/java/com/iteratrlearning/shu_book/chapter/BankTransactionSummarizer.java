package com.iteratrlearning.shu_book.chapter;

@FunctionalInterface
public interface BankTransactionSummarizer {
	double summarize(double accumulator, BankTransaction bankTransaction);
}
