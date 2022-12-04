import java.sql.*;

public class CreateDbMusic {

	public static void main(String[] args) {
		String createTableAlbum = "CREATE TABLE Album ( AlbumId int, Titolo varchar(20), Artista varchar(255), Anno int, PRIMARY KEY (AlbumId) )";
		String insertValuesTableAlbum = "INSERT INTO Album (AlbumId, Titolo, Artista, Anno)VALUES (1, 'Made In Japan','Deep Purple',1972)";
		
//		Artista varchar(255), Anno int, PRIMARY KEY (AlbumId) );
//		INSERT INTO Album (AlbumId, Titolo, Artista, Anno)
//		VALUES (1, 'Made In Japan','Deep Purple',1972);
//		INSERT INTO Album (AlbumId, Titolo, Artista, Anno)
//		VALUES (2, 'Be','Pain Of Salvation',2004);
//		INSERT INTO Album (AlbumId, Titolo, Artista, Anno)
//		VALUES (3, 'Images And Words','Dream Theater',1992);
//		INSERT INTO Album (AlbumId, Titolo, Artista, Anno)
//		VALUES (4, 'The Human Equation','Ayreon',2004);

		
		
		Connection con = null;
		Statement stmt = null;
		String driver = "org.apache.derby.jdbc.EmbeddedDriver";
		try {
			Class.forName(driver);
			// Creiamo la stringa di connessione
			String url = "jdbc:derby:Music;create=true;";
			// Otteniamo una connessione con username e password
			con = DriverManager.getConnection(url/* , "myUserName", "myPassword" */);
			stmt = con.createStatement();
			stmt.execute(createTableAlbum);
			stmt.execute(insertValuesTableAlbum);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if (stmt != null)
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		}

	}

}
