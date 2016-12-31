package com.leqi.dao.club;

import com.leqi.bean.RiderEntity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2016/12/30.
 */
public class GetClubMembersDaoIml {
    private String url="jdbc:mysql://119.29.111.167:3306/leqi?characterEncoding=UTF-8";
    private String user="root";
    private String pass="huyulin";

    public GetClubMembersDaoIml() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,pass);
    }

    public List<RiderEntity> getMembers(int clubID) throws SQLException {
        Connection connection=getConnection();
        String sql="select * from club_member natural join rider where club_id="+clubID;
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        ResultSet resultSet=preparedStatement.executeQuery();
        List<RiderEntity> riderEntities=new ArrayList<>();
        while(resultSet.next()){
            String name=resultSet.getString("nickname");
            String sex=resultSet.getString("gender");
            String tele=resultSet.getString("contact");
            String province=resultSet.getString("province");
            String city=resultSet.getString("city");
            String district=resultSet.getString("district");
            String detail=resultSet.getString("detail");
            RiderEntity riderEntity=new RiderEntity();
            riderEntity.setNickname(name);
            riderEntity.setGender(sex);
            riderEntity.setContact(tele);
            riderEntity.setProvince(province);
            riderEntity.setCity(city);
            riderEntity.setDistrict(district);
            riderEntity.setDetail(detail);
            riderEntities.add(riderEntity);
        }
        preparedStatement.close();
        resultSet.close();
        connection.close();
        return riderEntities;
    }

}
