package com.iteratrlearning.shu_book.chapter;

@FunctionalInterface
public interface Condition {

    boolean evaluate(Facts facts);
}