package com.day1.ewalletapplication;

class BusinessWallet extends Wallet {

    public BusinessWallet(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public double getTransferLimit() {
        return 200000;
    }
}