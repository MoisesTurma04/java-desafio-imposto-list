package entities;

public class TaxPayer {
	private double salaryIncome;
	private double servicesIncome;
	private double capitalIncome;
	private double healthSpending;
	private double educationSpending;

	public TaxPayer() {

	}

	public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending,
			double educationSpending) {
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public double getSalaryIncome() {
		return salaryIncome / 12.0;
	}

	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public double getServicesIncome() {
		return servicesIncome / 12.0;
	}

	public void setServicesIncome(double servicesIncome) {
		this.servicesIncome = servicesIncome;

	}

	public double getCapitalIncome() {
		return capitalIncome / 12.0;
	}

	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(double educationSpending) {
		this.educationSpending = educationSpending;
	}

	public double salaryTax() {
        double monthlySalaryIncome = getSalaryIncome();
        if (monthlySalaryIncome < 3000) {
            return 0;
        } else if (monthlySalaryIncome >= 3000 && monthlySalaryIncome <= 5000) {
            return monthlySalaryIncome * 0.1 * 12; 
        } else {
            return monthlySalaryIncome * 0.2 * 12; 
        }
    }

    public double servicesTax() {
        double monthlyServicesIncome = getServicesIncome();
        if (monthlyServicesIncome > 0.00) {
            return monthlyServicesIncome * 0.15 * 12; 
        } else {
            return 0.00;
        }
    }

    public double capitalTax() {
        double monthlyCapitalIncome = getCapitalIncome();
        if (monthlyCapitalIncome > 0.00) {
            return monthlyCapitalIncome * 0.2 * 12;
        } else {
            return 0.00;
        }
    }

    public double grossTax() {
        return salaryTax() + servicesTax() + capitalTax();
    }

    public double taxRebate() {
        double maxDeduction = grossTax() * 0.3;
        double deduction = healthSpending + educationSpending;

        if (deduction < maxDeduction) {
            return deduction;
        } else {
            return maxDeduction;
        }
    }

    public double netTax() {
        return grossTax() - taxRebate();
    }

    public String toString() {
        return String.format("TaxPayer[salaryIncome=%.2f/month, servicesIncome=%.2f/month, capitalIncome=%.2f/month, healthSpending=%.2f, educationSpending=%.2f]",
                getSalaryIncome(), getServicesIncome(), getCapitalIncome(), healthSpending, educationSpending);
    }

}
