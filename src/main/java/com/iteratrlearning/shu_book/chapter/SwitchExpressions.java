package com.iteratrlearning.shu_book.chapter;


public class SwitchExpressions {

	public enum Stage {
		LEAD, INTERESTED, EVALUATING, CLOSED 
	}
	
    public static void main(String[] args) {
        var dealStage = Stage.LEAD;
        var amount = 10;
        double forecastedAmount = 0;

        // ������ switch��
        switch (dealStage) {
    	case LEAD:
    		forecastedAmount = amount * 0.2;
    		break;
    	case EVALUATING:
    		forecastedAmount = amount * 0.5;
    		break;
    	case INTERESTED:
    		forecastedAmount = amount * 0.8;
    		break;
    	case CLOSED:
    		forecastedAmount = amount;
    		break;
        }
        
        System.out.println(forecastedAmount);
        
        // ���ο� switch�� (�ڹ� 14�̻�)
//        var forecastedAmount = amount * switch (dealStage) {
//            case LEAD -> 0.2;
//            case EVALUATING -> 0.5;
//            case INTERESTED -> 0.8;
//            case CLOSED -> 1;
//        };
//
        
    }
}
