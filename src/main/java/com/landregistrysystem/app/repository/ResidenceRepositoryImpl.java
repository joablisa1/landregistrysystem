package com.landregistrysystem.app.repository;

import com.landregistrysystem.app.model.Residence;
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
import java.util.List;
@Repository
public class ResidenceRepositoryImpl implements  ResidenceRepository {
    JdbcTemplate jdbcTemplate;

    public ResidenceRepositoryImpl(DataSource dataSource){
        jdbcTemplate=new JdbcTemplate(dataSource);
    }

    @Override
    public Residence save(final Residence residence) {
        Residence residence_=null;
        int update=0;
        try {
           final  String sql="insert into resident(residentname, category, datecreated, address, age) values(?,?,?,?,?)";
            update=jdbcTemplate.update(new PreparedStatementCreator() {
                @Override
                public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                    PreparedStatement ps=connection.prepareStatement(sql);
                    ps.setString(1,residence.getResidencename());
                    ps.setString(2,residence.getCategory());
                    ps.setString(3,residence.getDaycreated());
                    ps.setString(4,residence.getResidenceaddress());
                    ps.setInt(5,residence.getAge());
                    return ps;
                }
            });
            if(update>0){
                residence_=residence;
                return  residence_;
            }

        }catch (Exception e){
            e.getMessage();
        }
        return residence_;
    }

    @Override
    public List<Residence> getAllResidenceByOccupation(String location) {
        final String sql="select * from resident where location="+location;
        List<Residence> list=jdbcTemplate.query(sql, new RowMapper<Residence>() {
            @Override
            public Residence mapRow(ResultSet rs, int i) throws SQLException {
                Residence residence=new Residence();
                residence.setId(rs.getInt("id"));
                residence.setResidencename(rs.getString("residentname"));
                residence.setCategory(rs.getString("category"));
                residence.setDaycreated(rs.getString("datecreated"));
                residence.setResidenceaddress(rs.getString("address"));
                residence.setAge(rs.getInt("age"));
                return  residence;
            }
        });
        return  list;
    }

    @Override
    public List<Residence> getAllResidence() {
        final String sql="select * from resident";
        List<Residence> list=jdbcTemplate.query(sql, new RowMapper<Residence>() {
            @Override
            public Residence mapRow(ResultSet rs, int i) throws SQLException {
                    Residence residence=new Residence();
                    residence.setId(rs.getInt("id"));
                    residence.setResidencename(rs.getString("residentname"));
                    residence.setCategory(rs.getString("category"));
                    residence.setDaycreated(rs.getString("datecreated"));
                    residence.setResidenceaddress(rs.getString("address"));
                    residence.setAge(rs.getInt("age"));

                return  residence;
            }
        });
        return  list;
    }

    @Override
    public Residence getResidenceById(int id) {
        String sql="select * from resident where id=?"+id;
        return jdbcTemplate.query(sql, new ResultSetExtractor<Residence>() {
            @Override
            public Residence extractData(ResultSet rs) throws SQLException, DataAccessException {
                if(rs.next()){
                    Residence residence=new Residence();
                    residence.setId(rs.getInt("id"));
                    residence.setResidencename(rs.getString("residentname"));
                    residence.setCategory(rs.getString("category"));
                    residence.setDaycreated(rs.getString("datecreated"));
                    residence.setResidenceaddress(rs.getString("address"));
                    residence.setAge(rs.getInt("age"));
                    return  residence;
                }
                return null;
            }
        });
    }

    @Override
    public void update_residence(final Residence residence) {
        final String sql="update resident set residentname=?, category=?, datecreated=?, address=?, age=? where id=?";
        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps=connection.prepareStatement(sql);
                ps.setString(1,residence.getResidencename());
                ps.setString(2,residence.getCategory());
                ps.setString(3,residence.getDaycreated());
                ps.setString(4,residence.getResidenceaddress());
                ps.setInt(5,residence.getAge());
                ps.setInt(6,residence.getId());
                return ps;
            }
        });
    }

    @Override
    public void delete(int id) {
        String sql = "delete from  where id=?";
        jdbcTemplate.update(sql, id);
    }
}
