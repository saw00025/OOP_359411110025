package lab9;

import java.sql.*;
import java.util.ArrayList;

public class mobilestore {
    public static void main (String[]args){
        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("Driver load successfully.");

        }catch (ClassNotFoundException e){
        e.printStackTrace();


        }
        String SQCONN = "jdbc:sqlite:studio.sqlite";
        try {
            Connection conn = DriverManager.getConnection(SQCONN);
          if (conn==null) {
              System.out.println("Could not connect to database.");
          }else{
              System.out.println("connected to database.");
          }
          Statement stmt = conn.createStatement();
          String sql ="select * from mobilestore";
          ResultSet rs =stmt.executeQuery(sql);
          //
            if (rs==null){
                System.out.println("Could not found any data");

            }else {
                System.out.println("casestudy data from  database:");
                ArrayList<casestudy> std=new ArrayList<>();
                while (rs.next()){
//                while (rs.next()){
//                    System.out.println("############");
//                    System.out.println("id:"+rs.getInt(1));
//                    System.out.println("brabd:"+rs.getInt(2));
//                    System.out.println("gen:"+rs.getInt(3));
//                    System.out.println("price"+rs.getDouble(4));
//                    System.out.println("version"+rs.getDouble(5));
                   casestudy s = new casestudy (rs.getInt(1),
                           rs.getString(2),rs.getString(3),rs.getDouble(4), rs.getString(5));
                    std.add(s);

                }
                DisplayObject(std);

            }
            rs.close();
            stmt.close();
            conn.close();






        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private static void DisplayObject(ArrayList<casestudy> std) {
     for ( casestudy s: std) {
        System.out.println(s.toString());
    }
    }

}
