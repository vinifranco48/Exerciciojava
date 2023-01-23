package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Company;
import Entities.Indivual;
import Entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		List<Pessoa> list = new ArrayList<>();
		System.out.println("Enter the Number of tax players: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax player #" + i + "data: ");
			System.out.println("Individual or company: (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Anual Income: ");
			double income = sc.nextDouble();
			if (ch == 'i') {
				System.out.println("Heath expenditures: ");
				double heathExpenditures = sc.nextDouble();
				list.add(new Indivual(name, income, heathExpenditures));
			}
			if (ch == 'c') {
				System.out.println("number of employees: ");
				int numberOfEmployees = sc.nextInt();

				list.add(new Company(name, income, numberOfEmployees));
			}
		}
		double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID: ");
		for(Pessoa p : list) {
			double tax = p.tax();
			System.out.println(p.getName() + ": $" + String.format("%.2f", tax));
			sum += tax;
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		sc.close();

	}

}
