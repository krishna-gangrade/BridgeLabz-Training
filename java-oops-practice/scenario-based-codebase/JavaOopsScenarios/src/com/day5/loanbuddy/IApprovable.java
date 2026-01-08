package com.day5.loanbuddy;

interface IApprovable {

	boolean approveLoan(Applicant applicant);

	double calculateEMI(double principal, double annualRate, int months);
}
