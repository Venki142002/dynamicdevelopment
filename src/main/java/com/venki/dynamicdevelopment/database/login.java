//package com.venki.dynamicdevelopment.database;
//
//import com.venki.dynamicdevelopment.entity.loginvalidation;
//import org.springframework.stereotype.Component;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//@Component
//public class login
//{
//    public String loginresult="";
//public void validate(loginvalidation data)
//{
//   process(data);
//}
//private void process(loginvalidation data)
//{
//    String correct_password = "";
//    try {
//        Statement smt = db_connection.con.createStatement();//creating statement for executing the query
//        ResultSet result = smt.executeQuery("select PRO.MEDWAY.PASSWORD FROM PRO.MEDWAY WHERE MAIL_ID ='" + data.getMail() + "'");//executing query
//        if (result.next())//retrieving password for particular username
//        {
//            correct_password = result.getString(1);
//        }
//        if(correct_password.equals(""))//if retrieving password is blank then username is not registered in our database
//        {
//            loginresult = "Account Not Found";
//        }
//        else if (correct_password.equals(data.getPassword()))
//        {
//            loginresult = "Sucess";
//        }
//        else
//        {
//            loginresult = "Worng Password";
//        }
//    }
//   catch (SQLException throwables)
//   {
//        throwables.printStackTrace();
//    }
//}
//}
