package com.day5.loanbuddy;

class HomeLoan extends LoanApplication {

    public HomeLoan(int termMonths) {
        super(termMonths, 8.5); // lower interest
    }

    @Override
    public boolean approveLoan(Applicant applicant) {

        if (applicant.getCreditScore() >= 700 &&
            applicant.getIncome() >= 40000) {

            setApproved(true);
            return true;
        }

        setApproved(false);
        return false;
    }
}