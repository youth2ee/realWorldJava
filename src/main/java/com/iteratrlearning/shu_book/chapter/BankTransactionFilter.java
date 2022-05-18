package com.iteratrlearning.shu_book.chapter;

@FunctionalInterface
public interface BankTransactionFilter {
	// 함수형 인터페이스
	boolean test(BankTransaction bankTransaction); 
}
