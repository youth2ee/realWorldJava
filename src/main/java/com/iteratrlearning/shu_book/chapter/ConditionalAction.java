package com.iteratrlearning.shu_book.chapter;

public interface ConditionalAction {
    void perform(Facts facts);
    boolean evaluate(Facts facts);

}