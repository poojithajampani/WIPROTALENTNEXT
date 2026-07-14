class ICICIBank extends GeneralBank {

    @Override
    double getSavingsInterestRate() {
        return 4.0;
    }

    @Override
    double getFixedDepositInterestRate() {
        return 8.5;
    }
}
