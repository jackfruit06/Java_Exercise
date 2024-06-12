package com.hus.oop.exercise05;

class Officer extends People{
    private String company;
    private String id; // Company id
    private int salary; // VND
    private int yoe; // year of experience
    private String major;

public Officer(String name, String id, int age, String company, String companyId, int salary, int yoe, String major) {
    super(name , id , age);
    this.company = company;
    this.id = companyId;
    this.salary = salary;
    this.yoe = yoe;
    this.major = major;
}

public String getCompany() {
    return company;
}
public void setCompany(String company) {
    this.company = company;
}

@Override
public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}

public int getSalary() {
    return salary;
}

public void setSalary(int salary) {
    this.salary = salary;
}

public int getYoe() {
    return yoe;
}

public void setYoe(int yoe) {
    this.yoe = yoe;
}

public String getMajor() {
    return major;
}

public void setMajor(String major) {
    this.major = major;
}

/**
 * This method check if officer can get off work.
 *
 * @param hour the time officer have worked
 * @return true if the time is > 8
 */
public boolean isFinish(int hour){
    /*TODO*/
    if (hour >= 8) {
        return true;
    }
    return false;
}

/**
 * This method implements promotions for employees.
 *
 * @param major new major
 * @param salary new salary
 */
public void raise(String major, int salary){
    /*TODO*/
    this.major = major;
    setMajor(major);
    this.salary = salary;
    setSalary(salary);
}

/**
 * This method implements salary raises for employees.
 * @param amount The additional salary portion.
 */
public void raise(int amount) {
    /*TODO*/
    this.salary = this.salary + amount;
}

/**
 * This method implements dismissal employees and set salary to 0
 */
public void dismissal(){
    /*TODO*/
    this.salary = 0;
    this.id = null;
}

@Override
public String toString() {
    return "Officer{" + "company='" + company + '\'' + ", id='" + id + '\'' + ", salary=" + salary + ", yoe=" + yoe + ", major='" + major + '\'' + '}';
}
}
