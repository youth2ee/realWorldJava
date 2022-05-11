package com.iteratrlearning.shu_book.chapter_02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class BankStatementAnalyzer {
	private static final String RESOURCES = "src/main/resources/";
	
//	public static void main(String[] args) throws IOException {
////		final Path path = Paths.get(RESOURCES + args[0]);
////		// Path 클래스는 파일 시스템의 경로를 가리킨다. 
////		
////		final List<String> lines = Files.readAllLines(path);
////		//행 목록을 반환한다. 파일의 모든 행을 가져온다.
////		
//		
//		final BankStatementCSVParser bankStatementParser = new BankStatementCSVParser();
//		
//		final String fileName = "bank-data-simple.csv";
////		final String fileName = args[0];
//		final Path path = Paths.get(RESOURCES + fileName);
//		final List<String> lines = Files.readAllLines(path);
//		
//		final List<BankTransaction> bankTransactions = bankStatementParser.parseLinesFromCSV(lines);
//		final BankStatementProcessor bankStatementProcessor = new BankStatementProcessor(bankTransactions);
//		
//		collectSummary(bankStatementProcessor);
//		
//	}
	
    public void analyze(final String fileName, final BankStatementParser bankStatementParser) throws IOException {

        final Path path = Paths.get(RESOURCES + fileName);
        final List<String> lines = Files.readAllLines(path);

        final List<BankTransaction> bankTransactions = bankStatementParser.parseLinesFrom(lines);

        final BankStatementProcessor bankStatementProcessor = new BankStatementProcessor(bankTransactions);

        collectSummary(bankStatementProcessor);

    }
	
	
	private static void collectSummary (final BankStatementProcessor bankStatementProcessor) {
		System.out.println("The total for all transactions is " + bankStatementProcessor.calculateTotalAmount());
		System.out.println("The total for transactions in January is " + bankStatementProcessor.calculateTotalInMonth(Month.JANUARY));
		System.out.println("The total for transactions in February is " + bankStatementProcessor.calculateTotalInMonth(Month.FEBRUARY));
		System.out.println("The total salary received is " + bankStatementProcessor.calculateTotalForCategory("Salary"));
	}
	

}
