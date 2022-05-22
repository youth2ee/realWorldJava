//package com.iteratrlearning.shu_book.chapter;
//
//import java.time.LocalDate;
//import java.time.Month;
//
//import org.junit.Assert;
////import org.junit.jupiter.api.Test;
//import org.junit.Test;
//
//import com.iteratrlearning.shu_book.chapter.BankStatementCSVParser;
//import com.iteratrlearning.shu_book.chapter.BankTransaction;
//
//class BankStatementCSVParserTest {
//
//	private final BankStatementCSVParser statementParser = new BankStatementCSVParser();
//	
//	//@Test
//	public void shouldParseOneCorrectLine() throws Exception {
//		Assert.fail("Not yet implemented");
//	}
//	
//	@Test
//	public void shouldParseoneCorrectLine() throws Exception {
//		final String line = "30-01-2017,-50,Tesco";
//		
//		final BankTransaction result = statementParser.parseFrom(line);
//		
//		BankTransaction expected = new BankTransaction(LocalDate.of(2017, Month.JANUARY, 30), -50, "Tesco");
//        Assert.assertEquals(expected.getDate(), result.getDate());
//        Assert.assertEquals(expected.getAmount(), result.getAmount(), 0.0d);
//        Assert.assertEquals(expected.getDescription(), result.getDescription());
//	
//        
//	}
//
//}
