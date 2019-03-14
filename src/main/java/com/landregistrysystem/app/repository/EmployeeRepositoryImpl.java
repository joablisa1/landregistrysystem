package com.landregistrysystem.app.repository;

import com.landregistrysystem.app.model.Employee;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements  EmployeRepository {
    private JdbcTemplate jdbcTemplate;
    public EmployeeRepositoryImpl(DataSource dataSource){
     jdbcTemplate=new JdbcTemplate(dataSource);
    }
    @Override
    public Employee save(final Employee employ) {
        Employee employee_=null;
        int update=0;
        try {
        final String sql="insert into employee(firstname, lastname, email, idnumber, phone, ssn, occupation, salary, datecreated, income) VALUES(?,?,?,?,?,?,?,?,?,?)";
        update=jdbcTemplate.update(new PreparedStatementCreator() {
         @Override
         public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
             PreparedStatement ps=connection.prepareStatement(sql);
             ps.setString(1,employ.getFirstname());
             ps.setString(2,employ.getLastname());
             ps.setString(3,employ.getEmail());
             ps.setInt(4,employ.getIdnumber());
             ps.setString(5,employ.getPhone());
             ps.setString(6,employ.getSocialsecuritynumber());
             ps.setString(7,employ.getOccupation());
             ps.setDouble(8,employ.getSalary());
             ps.setString(9,employ.getDatecreated());
             ps.setString(10,employ.getIncome());
             return ps ;
         }
     });
     if(update>0){
         employee_=employ;
         return  employee_;
     }
        }catch (Exception e){
            e.getMessage();
        }
        return employee_;
    }

    @Override
    public List<Employee> getAllEmployeeByOccupations(String occupation) {
        String sql="select * from employee where occupation="+occupation;
        List<Employee> list=jdbcTemplate.query(sql, new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int i) throws SQLException {
                    Employee employee=new Employee();
                    employee.setId(rs.getInt("id"));
                    employee.setFirstname(rs.getString("firstname"));
                    employee.setLastname(rs.getString("lastname"));
                    employee.setEmail(rs.getString("email"));
                    employee.setIdnumber(rs.getInt("idnumber"));
                    employee.setPhone(rs.getString("phone"));
                    employee.setSocialsecuritynumber(rs.getString("ssn"));
                    employee.setOccupation(rs.getString("occupation"));
                    employee.setSalary(rs.getDouble("salary"));
                    employee.setDatecreated(rs.getString("datecreated"));
                    employee.setIncome(rs.getString("income"));
                   return employee ;
            }
        });
        return list;
    }

    @Override
    public List<Employee> getAllEmployees() {
        String sql="select * from employee ";
        List<Employee> list=jdbcTemplate.query(sql, new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int i) throws SQLException {
                Employee employee=new Employee();
                employee.setId(rs.getInt("id"));
                employee.setFirstname(rs.getString("firstname"));
                employee.setLastname(rs.getString("lastname"));
                employee.setEmail(rs.getString("email"));
                employee.setIdnumber(rs.getInt("idnumber"));
                employee.setPhone(rs.getString("phone"));
                employee.setSocialsecuritynumber(rs.getString("ssn"));
                employee.setOccupation(rs.getString("occupation"));
                employee.setSalary(rs.getDouble("salary"));
                employee.setDatecreated(rs.getString("datecreated"));
                employee.setIncome(rs.getString("income"));
                return employee ;
            }
        });
        return list;
    }

    @Override
    public Employee getEmployeById(int id) {
        final String sql="select * from employee where id="+id;
        return jdbcTemplate.query(sql, new ResultSetExtractor<Employee>() {
            @Override
            public Employee extractData(ResultSet rs) throws SQLException, DataAccessException {
                if(rs.next()){
                    Employee employee=new Employee();
                    employee.setId(rs.getInt("id"));
                    employee.setFirstname(rs.getString("firstname"));
                    employee.setLastname(rs.getString("lastname"));
                    employee.setEmail(rs.getString("email"));
                    employee.setIdnumber(rs.getInt("idnumber"));
                    employee.setPhone(rs.getString("phone"));
                    employee.setSocialsecuritynumber(rs.getString("ssn"));
                    employee.setOccupation(rs.getString("occupation"));
                    employee.setSalary(rs.getDouble("salary"));
                    employee.setDatecreated(rs.getString("datecreated"));
                    employee.setIncome(rs.getString("income"));
                    return  employee;
                }
                return null;
            }
        });
    }

    @Override
    public Employee getEmployeById() {
        final String sql="select * from employee";
        return jdbcTemplate.query(sql, new ResultSetExtractor<Employee>() {
            @Override
            public Employee extractData(ResultSet rs) throws SQLException, DataAccessException {
                if(rs.next()){
                    Employee employee=new Employee();
                    employee.setId(rs.getInt("id"));
                    employee.setFirstname(rs.getString("firstname"));
                    employee.setLastname(rs.getString("lastname"));
                    employee.setEmail(rs.getString("email"));
                    employee.setIdnumber(rs.getInt("idnumber"));
                    employee.setPhone(rs.getString("phone"));
                    employee.setSocialsecuritynumber(rs.getString("ssn"));
                    employee.setOccupation(rs.getString("occupation"));
                    employee.setSalary(rs.getDouble("salary"));
                    employee.setDatecreated(rs.getString("datecreated"));
                    employee.setIncome(rs.getString("income"));
                    return  employee;
                }
                return null;
            }
        });
    }

    @Override
    public Employee updateEmployee(final Employee employee) {
        int update=0;
        Employee employee_=null;
        try {
            final String sql="update employee set firstname=?, lastname=?,email=?,idnumber=?, phone=?, ssn=?,occupation=?,salary=?,datecreated=?,income=? where id=? ";
             jdbcTemplate.update(sql, new PreparedStatementCreator() {
                @Override
                public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                    PreparedStatement ps=connection.prepareStatement(sql);
                    ps.setString(1,employee.getFirstname());
                    ps.setString(2,employee.getLastname());
                    ps.setString(3,employee.getEmail());
                    ps.setInt(4,employee.getIdnumber());
                    ps.setString(5,employee.getPhone());
                    ps.setString(6,employee.getSocialsecuritynumber());
                    ps.setString(7,employee.getOccupation());
                    ps.setDouble(8,employee.getSalary());
                    ps.setString(9,employee.getDatecreated());
                    ps.setString(10,employee.getIncome());
                    ps.setInt(11,employee.getId());
                    return ps ;
                }
            });
             if(update>0){
                 employee_=employee;
                 return employee_;
             }
        }catch (Exception e){
            e.getMessage();
        }
        return employee_;
    }

    @Override
    public List<Employee> getAllEmployees(int pageid, int total) {
        String sql= "SELECT * FROM employee LIMIT "+(pageid-1)+","+total;
        return jdbcTemplate.query(sql, new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int i) throws SQLException {
                Employee employee=new Employee();
                employee.setId(rs.getInt("id"));
                employee.setFirstname(rs.getString("firstname"));
                employee.setLastname(rs.getString("lastname"));
                employee.setEmail(rs.getString("email"));
                employee.setIdnumber(rs.getInt("idnumber"));
                employee.setPhone(rs.getString("phone"));
                employee.setSocialsecuritynumber(rs.getString("ssn"));
                employee.setOccupation(rs.getString("occupation"));
                employee.setSalary(rs.getDouble("salary"));
                employee.setDatecreated(rs.getString("datecreated"));
                employee.setIncome(rs.getString("income"));
                return employee ;
            }
        });


    }

    @Override
    public void delete(int id) {
        String sql = "delete from employee where id=?";
        jdbcTemplate.update(sql, id);
    }
}
