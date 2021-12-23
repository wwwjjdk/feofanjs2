package com.company;

@FunctionalInterface
public interface OnTaskErrorListener {
    void notDone(String string);
}
