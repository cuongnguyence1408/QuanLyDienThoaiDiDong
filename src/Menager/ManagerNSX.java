/**
 * 
 */
package Menager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DB.Database;
import Entity.NhaSanXuat;

/**
 * @author Admin
 *
 */
public class ManagerNSX {
	
	public List<NhaSanXuat>getAllNSX(){
		List<NhaSanXuat>dsNSX=new ArrayList<NhaSanXuat>();
		Connection con= Database.getConnection();
		PreparedStatement stmt=null;
		ResultSet rs=null;
		try {
			stmt=con.prepareStatement("select *from NhaSanXuat");
			rs=stmt.executeQuery();
			while(rs.next()){
				dsNSX.add(new NhaSanXuat(rs.getString("MaNSX"),rs.getString("TenNSX")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dsNSX;
		
	}
}	
