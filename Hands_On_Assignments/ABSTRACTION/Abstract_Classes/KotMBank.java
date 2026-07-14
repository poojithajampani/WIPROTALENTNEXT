class KotMBank extends GeneralBank {

    @Override
    double getSavingsInterestRate() {
        return 6.0;
    }

    @Override
    double getFixedDepositInterestRate() {
        return 9.0;
    }
}
