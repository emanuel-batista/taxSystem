package entities;

public class Individual extends TaxPayer{
    private Double healthExpenditures;

    public Individual(){
        super();
    }

    public Individual(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        if (getAnnualIncome() < 20000.00 && healthExpenditures > 0){
            return getAnnualIncome() * 15 / 100 - (healthExpenditures * 50 / 100);
        }else if(getAnnualIncome() >= 20000.00 && healthExpenditures > 0){
            return getAnnualIncome() * 25 / 100 - (healthExpenditures * 50 / 100);
        }else if (getAnnualIncome() < 20000.00){
            return getAnnualIncome() * 15 / 100;
        }else{
            return getAnnualIncome() * 25 / 100;
        }
    }
}
