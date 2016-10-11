package App;

import java.sql.Connection;

import DB.Database;

public class Test {
	public static void main(String[] args) {
		Connection con=Database.getConnection();
	}
}
