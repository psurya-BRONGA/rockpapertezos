package com.gap.rockpapertezos.exception;

public class RockPaperTezosException extends Exception {
    private String message;

    public RockPaperTezosException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
