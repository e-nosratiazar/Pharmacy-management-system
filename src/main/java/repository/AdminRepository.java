package repository;

import model.User;
import util.Application;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminRepository {
    public int insertAdmin(User admin) throws SQLException {
        String sql="insert into t_user (firstName,lastName,age,nationalCode,userName,password,userType) values (?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = Application.getConnection().prepareStatement(sql);
        preparedStatement.setString(1, admin.getFirstName());
        preparedStatement.setString(2, admin.getLastName());
        preparedStatement.setInt(3,admin.getAge());
        preparedStatement.setString(4, admin.getNationalCode());
        preparedStatement.setString(5, admin.getUserName());
        preparedStatement.setString(6, admin.getPassword());
        preparedStatement.setString(7,admin.getUserType().toString());
        return preparedStatement.executeUpdate();
    }

    public boolean findUsernameAndPassword(String username,String password) throws SQLException {
        boolean found=false;
        String sql="select id from t_user where username=? and password=?";
        PreparedStatement preparedStatement = Application.getConnection().prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()){
            found=true;
        }
        return found;
    }


}
