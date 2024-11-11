package com.spring.jdbc.dao;



import java.util.List;

import javax.swing.tree.RowMapper;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entity.Employee;



public class EmpDaoImpl implements EmpDao{
	
	JdbcTemplate jdbcTemplate;

	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(Employee employee) {
	String q = "insert into emp_data(eid,ename,dname) values(?,?,?)";
	int r= this.jdbcTemplate.update(q,employee.getEid(),employee.getEname(),employee.getDname());
	return r;
	}
	
	public int update(Employee employee) {
		String u="update employee set ename=? where id";
		int r=this.jdbcTemplate.update(u,employee.getEname(),employee.getEid());
		return r;
	}
	public int delete(Employee employee) {
		String u="delete employee set ename=? where eid";
		int r=this.jdbcTemplate.update(u,employee.getEid());
		
		return r;
		
	}

	@Override
	public Employee getEmployee(int Eid) {
		// TODO Auto-generated method stub
		String ca="select from employee where eid=?";
		//RowMapper<Employee> rm=new RawMapperIml();
		RowMapper<Employee> rm=new RawMapperIml();
		Employee employee=this.jdbcTemplate.queryForObject(ca,rm,Eid);
		
		return employee;
	}



	@Override
	public List<Employee> getAllEmp() {
		String a="select from employee";
		List<Employee> employee=this.jdbcTemplate.query(a, new RawmapperIml());
		// TODO Auto-generated method stub
		return null;
	}


	

}