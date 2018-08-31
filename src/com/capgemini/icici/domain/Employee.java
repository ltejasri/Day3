package com.capgemini.icici.domain;

public class Employee {

	private static int empId;
	private String empName;
	private double empHRA;
	private double empPF;
	private double empPT=200;
	//private double empBasicSalary;
	private double empGrossSalary;
	//private double empmedical;
	private double empnetsalary;
	public Employee()
	{
		
	}
	public Employee(int empId, String empName)
	{
	this.empId = empId;
	this.empName = empName;
	
	
	}
	public double findempHRA(int empBasicSalary)
	{
		double result = 0.5*empBasicSalary;
		return result;
	}
	public double findempPF(int empBasicSalary)
	{
		double result = 0.12*empBasicSalary;
		return result;
	}
	public double findempGrossSalary(double empHRA ,double empBasicSalary,double medical)
	{
		double result = empHRA + empBasicSalary + medical;
		return result;
	}
	public double findnetsalary(double empGrossSalary, double empPF, double empPT)
	{
		double result = empGrossSalary - (empPF + empPT);
		return result;
	}
	public double salaryCalculation(int basic, int medical) {
		empHRA = findempHRA(basic);
		empPF = findempPF(basic);
		empGrossSalary = findempGrossSalary(empHRA, basic, medical);
		empnetsalary = findnetsalary(empGrossSalary, empPF, empPT);
		System.out.println("Employee-ID : "+empId);
		System.out.println("Employee-Name : "+empName);
		System.out.println("Employee-NetSalary : "+empnetsalary);
		
		// TODO Auto-generated method stub
		return empnetsalary;
	}
	
}
