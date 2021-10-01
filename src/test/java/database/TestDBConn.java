package database;

import java.sql.SQLException;

public class TestDBConn {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

//
//					//MY SQL
//		DbManager.setMysqlDbConnection();
//		System.out.println(DbManager.getMysqlQuery("select tutorial_author from selenium where tutorial_id = 2"));

		// POSTgre SQL
		DbManager.setPostgreDbConnection();
		System.out.println(
				DbManager.getPostgreQuery("select endweek,salesorg from bl.promotion p where p.promotionid ='a38B0000000PYHTIA4'"));

	}

}
