package com.yash;

public class Highest_Salary {
	     int id;	     
	    String name;	     
	    int age;
	   String gender;
	 	   String department;
	     
	    int yearOfJoining;
	     
	    double salary;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public int getYearOfJoining() {
			return yearOfJoining;
		}

		public void setYearOfJoining(int yearOfJoining) {
			this.yearOfJoining = yearOfJoining;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Highest_Salary [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender
					+ ", department=" + department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
		}

		public Highest_Salary(int id, String name, int age, String gender, String department, int yearOfJoining,
				double salary) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.department = department;
			this.yearOfJoining = yearOfJoining;
			this.salary = salary;
		}

		public Highest_Salary() {
			super();
			// TODO Auto-generated constructor stub
		}
}
