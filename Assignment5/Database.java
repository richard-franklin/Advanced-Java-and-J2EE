import java.sql.*;

class Database{
    public static void main(String[] args) {
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection c = DriverManager.getConnection("jdbc:ucanaccess://F://Eclipse//Test//ABC.accdb");
            Statement s = c.createStatement();
            System.out.println("Connection Established");
            s.execute("create table Marks(USN varchar(10), M1 number, M2 number)");
            System.out.println("Table Created");
            s.executeUpdate("insert into Marks values('4AL18CS020',100,89)");
            s.executeUpdate("insert into Marks values('4AL18CS032',99,88)");
            System.out.println("Records inserted");
            ResultSet r = s.executeQuery("select * from Marks");
            System.out.println("The records in the table are : ");
            while(r.next()){
                String usn = r.getString("USN");
                int m1 = r.getInt("M1");
                int m2 = r.getInt("M2");
                System.out.println(usn+", "+m1+", "+m2);
            }
        }catch(Exception e){
            System.out.println("Error");
        }

    }
}