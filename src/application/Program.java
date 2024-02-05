package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Quantos contribuintes você vai digitar? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite os dados do " + i + "° contribuinte:");
            System.out.print("Renda anual com salário: ");
            double salaryIncome = sc.nextDouble();
            System.out.print("Renda anual com prestação de serviço: ");
            double servicesIncome = sc.nextDouble();
            System.out.print("Renda anual com ganho de capital: ");
            double capitalIncome = sc.nextDouble();
            System.out.print("Gastos médicos: ");
            double healthSpending = sc.nextDouble();
            System.out.print("Gastos educacionais: ");
            double educationSpending = sc.nextDouble();
            System.out.println();
            
            TaxPayer taxPayer = new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending);
            list.add(taxPayer);

            
        }
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            TaxPayer currentTaxPayer = list.get(i);
            double grossTax = ((TaxPayer) currentTaxPayer).grossTax();
            double taxRebate = ((TaxPayer) currentTaxPayer).taxRebate();
            double netTax = currentTaxPayer.netTax();

            System.out.printf("Resumo do %d° contribuinte:%n", i + 1);
            System.out.printf("Imposto bruto total: %.2f%n", grossTax);
            System.out.printf("Abatimento: %.2f%n", taxRebate);
            System.out.printf("Imposto devido: %.2f%n%n", netTax);
        }

        sc.close();
   
    }
}
