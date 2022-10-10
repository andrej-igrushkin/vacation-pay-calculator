package com.neoflex.calculator;

import java.text.DecimalFormat;

public class Employee {

	private double averageSalary;
	private int numDay;
	private String vacationPayAmount;
	DecimalFormat decimalFormat = new DecimalFormat( "#.##" );
	
	public double getAverageSalary() {
	  return averageSalary;
	}

	public void setAverageSalary(double averageSalary) {
	  this.averageSalary = averageSalary;
	}

	public int getNumDay() {
		return numDay;
	}

	public void setNumDay(int numDay) {
		this.numDay = numDay;
	}

	public String getVacationPayAmount() {
		return vacationPayAmount;
	}

	public void setVacationPayAmount(String vacationPayAmount) {
		this.vacationPayAmount = vacationPayAmount;
	}
	
	public void calculatePay() {
		vacationPayAmount = decimalFormat.format(averageSalary/29.3*numDay);//29.3 - среднее количество дней в месце
	}

}
