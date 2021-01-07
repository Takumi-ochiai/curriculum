package chapter2;

public class EmployeeBean1 {
//	コンストラクタ
	public EmployeeBean1(String empId, String department, String name, String tel, String mailAddress) {
		this._empId = empId;
		this._department = department;
		this._name = name;
		this._tel = tel;
		this._mailAddress = mailAddress;
	}
}
//呼び出し(new したあとで、引数へ与えられた値を元に EmployeeBean1 が生成されます)
	EmployeeBean1 employeeBean1 = new EmployeeBean1("00000", "技術部", "コンストラクタ", "XXX-XXXX-XXXX", "java@ぶるー");


System.out.println(employeeBean1.getName());
