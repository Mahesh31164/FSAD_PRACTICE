//package com.klu.model;
/*import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="dept")
public class Department {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY);
	@GeneratedValue(strategy=GenerationType.IDENTITY)
 private int  deptid;
 private String deptname;
 @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
 private List<Employee> empoleeys;

 public void setDeptId(int deptid)
 {
	 this.deptid=deptid;
 }
 public int getDeptId() {
	 return deptid;
 }
 public void setDeptName(String deptname) {
	 this.deptname=deptname;
 }
 public String getDeptName() {
	 return deptname;
 }
 
}
//*/