package com.day5.loanbuddy;

class PersonalLoan extends LoanApplication {

    public PersonalLoan(int termMonths) {
        super(termMonths, 12.5); // higher interest
    }

    @Override
    public boolean approveLoan(Applicant applicant) {

        if (applicant.getCreditScore() >= 600 &&
            applicant.getIncome() >= 20000) {

            setApproved(true);
            return true;
        }

        setApproved(false);
        return false;
    }
}