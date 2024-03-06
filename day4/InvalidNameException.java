package com.learning.core.day4;

class InvalidNameException extends CatheyBankException {
    public InvalidNameException() {
        super("Invalid Applicant Name");
    }
}
