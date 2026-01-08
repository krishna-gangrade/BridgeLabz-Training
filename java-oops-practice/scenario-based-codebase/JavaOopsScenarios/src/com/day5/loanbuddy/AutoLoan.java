package com.day5.loanbuddy;

class AutoLoan extends LoanApplication {

    public AutoLoan(int termMonths) {
        super(termMonths, 10.5); // higher interest
    }

    @Override
    public boolean approveLoan(Applicant applicant) {

        if (applicant.getCreditScore() >= 650 &&
            applicant.getIncome() >= 25000) {

            setApproved(true);
            return true;
        }

        setApproved(false);
        return false;
    }
}