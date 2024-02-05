# Calculadora de Imposto de Renda

Neste artigo, discutiremos a implementação de uma calculadora de imposto de renda em Java, seguindo as regras específicas de um determinado país. O programa calculará o imposto de renda que uma pessoa deve pagar com base em suas várias fontes de renda e despesas dedutíveis. Para isso, vamos criar a classe `TaxPayer` que representará cada contribuinte e implementará os cálculos necessários.

## Classe TaxPayer

A classe `TaxPayer` terá os seguintes atributos e métodos:

### Atributos:

- `SalaryIncome` (Renda com salário): double
- `ServicesIncome` (Renda com prestação de serviços): double
- `CapitalIncome` (Renda com ganho de capital): double
- `HealthSpending` (Gastos com saúde): double
- `EducationSpending` (Gastos com educação): double

### Métodos:

- `SalaryTax(): double`
- `ServicesTax(): double`
- `CapitalTax(): double`
- `GrossTax(): double`
- `TaxRebate(): double`
- `NetTax(): double`

### Método `SalaryTax()`:

Calcula o imposto sobre o salário com base na tabela fornecida:

- Abaixo de 3000 por mês: Isento
- 3000 até 5000 exclusive: 10%
- 5000 ou acima: 20%

### Método `ServicesTax()`:

Calcula o imposto sobre a renda obtida com prestação de serviços, com uma taxa de 15%.

### Método `CapitalTax()`:

Calcula o imposto sobre ganho de capital, com uma taxa de 20%.

### Método `GrossTax()`:

Calcula o imposto bruto total somando os impostos sobre salário, serviços e capital.

### Método `TaxRebate()`:

Calcula o valor do abatimento com base nos gastos médicos e educacionais, limitado a 30% do imposto bruto total.

### Método `NetTax()`:

Calcula o imposto líquido a ser pago após os abatimentos.

## Diagrama de classes
```mermaid
classDiagram
    class TaxPayer {
        - salaryIncome : double
        - servicesIncome : double
        - capitalIncome : double
        - healthSpending : double
        - educationSpending: double

        
        + SalaryTax(): double
        + ServicesTax(): double
        + CapitalTax(): double
        + GrossTax(): double
        + TaxRebate(): double
        + NetTax(): double
        
    }
    



