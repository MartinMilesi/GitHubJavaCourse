package futbol;

public class ConectorSql {
	
	static final String JDCB_DRIVER = "com.mysql.jdbc.Driver";
	public static String DB_URL = "";
	public static String USER = "";
	public static String PASS = "";
	
	public static String getDB_URL() {
		return DB_URL;
	}
	public static void setDB_URL(String dB_URL) {
		DB_URL = dB_URL;
	}
	public static String getUSER() {
		return USER;
	}
	public static void setUSER(String uSER) {
		USER = uSER;
	}
	public static String getPASS() {
		return PASS;
	}
	public static void setPASS(String pASS) {
		PASS = pASS;
	}
}