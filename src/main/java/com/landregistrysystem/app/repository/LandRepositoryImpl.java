package com.landregistrysystem.app.repository;

import com.landregistrysystem.app.model.Land;
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
public class LandRepositoryImpl implements LandRepository {
    JdbcTemplate jdbcTemplate;

    public  LandRepositoryImpl(DataSource dataSource){
        jdbcTemplate=new JdbcTemplate(dataSource);
    }
    @Override
    public Land save(final Land land) {
        Land land_=null;
        int update=0;
        try {
            final String sql="insert into land(location, landusage, size) values(?,?,?)";
            update=jdbcTemplate.update(new PreparedStatementCreator() {
                @Override
                public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                    PreparedStatement ps=connection.prepareStatement(sql);
                    ps.setString(1,land.getLocation());
                    ps.setString(2,land.getLandusage());
                    ps.setString(3,land.getSize());
                    return ps;
                }
            });
          if(update>0){
              land_=land;
              return land_;
          }
        }catch (Exception e){
            e.getMessage();
        }
        return land_;
    }

    @Override
    public List<Land> getAllLandByLocations(String location) {
        String sql="select * from land where location="+location;
        List<Land> list=jdbcTemplate.query(sql, new RowMapper<Land>() {
            @Override
            public Land mapRow(ResultSet rs, int i) throws SQLException {
                Land lands=new Land();
                lands.setId(rs.getInt("id"));
                lands.setLocation(rs.getString("location"));
                lands.setLandusage(rs.getString("landusage"));
                lands.setSize(rs.getString("size"));
                return lands;
            }
        });
        return list;
    }

    @Override
    public List<Land> getFullListLandByLocations() {

        String sql="select * from land ";
        List<Land> list=jdbcTemplate.query(sql, new RowMapper<Land>() {
            @Override
            public Land mapRow(ResultSet rs, int i) throws SQLException {
                Land land=new Land();
                land.setId(rs.getInt("id"));
                land.setLocation(rs.getString("location"));
                land.setLandusage(rs.getString("landusage"));
                land.setSize(rs.getString("size"));
                return land;
            }
        });
        return list;
    }

    @Override
    public Land getAllLandByID(int id) {
        final String sql="select * from land where id="+id;
        return jdbcTemplate.query(sql, new ResultSetExtractor<Land>() {
            @Override
            public Land extractData(ResultSet rs) throws SQLException, DataAccessException {
                if(rs.next()){
                    Land land=new Land();
                    land.setId(rs.getInt("id"));
                    land.setLocation(rs.getString("location"));
                    land.setLandusage(rs.getString("landusage"));
                    land.setSize(rs.getString("size"));
                    return land;
                }
                return  null;
            }
        });
    }

    @Override
    public void updateLand(final Land land) {
        Land land_=null;
        int update=0;
        try {
            final String sql="update land set location=?, landusage=?, size=? where id=? ";
            jdbcTemplate.update(new PreparedStatementCreator() {
                @Override
                public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                    PreparedStatement ps=connection.prepareStatement(sql);
                    ps.setString(1,land.getLocation());
                    ps.setString(2,land.getLandusage());
                    ps.setString(3,land.getSize());
                    ps.setInt(4,land.getRegid());
                    return ps;
                }
            });

        }catch (Exception e){
            e.getMessage();
        }

    }

    @Override
    public void delete(int id) {
        String sql = "delete from  land where id=?";
        jdbcTemplate.update(sql, id);
    }
}
