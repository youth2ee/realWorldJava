package com.iteratrlearning.shu_book.chapter;

@FunctionalInterface
public interface BankTransactionFilter {
	// �Լ��� �������̽�
	boolean test(BankTransaction bankTransaction); 
}
