package com.sust.test;

import java.io.File;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class InsertPic {

	private static final Log logger = LogFactory.getLog(InsertPic.class);
	
	public static void main(String[] args) {
		
		List<String> all = getDowenIfo("C:/Users/Zhang/Desktop/pic/");
        for (int i = 0; i < all.size(); i++) {
			logger.info(all.get(i)+"++"+insert(all.get(i),i));
		}
		//insert2();
        logger.info("完成！");
	}
	
	public static List<String> getDowenIfo(String path) {
		List<String> filelist = new ArrayList<String>();
		try {
			File dir = new File(path);
			File[] files = dir.listFiles(); // 该文件目录下文件全部放入数组
			if (files != null) {
				for (int i = 0; i < files.length; i++) {
					String fileName = files[i].getName();
					if (files[i].isFile()) {
						//fileName.substring(0, fileName.lastIndexOf("."))
						filelist.add(fileName);
					}
				}
			}
		} catch (Exception e) {
			logger.error("获取文件列表失败！", e);
		}
		return filelist;
	}
	
	private static int insert(String str,int a) {
	    Connection conn = getConn();
	    int i = 0;
	    long aa = new java.util.Date().getTime();
	    String sql = "insert into pic_picture (us_id,pi_title,pi_uptime,pi_str1,pi_str2) values(?,?,?,?,?)";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement) conn.prepareStatement(sql);
	        pstmt.setInt(1, 1);
	        pstmt.setString(2, "毕业快乐");
	        pstmt.setDate(3, new java.sql.Date(aa));
	        pstmt.setString(4, str);
	        pstmt.setString(5, "3");
	        i = pstmt.executeUpdate();
	        pstmt.close();
	        conn.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return i;
	}
	
	private static int insert2() {
	    Connection conn = getConn();
	    int i=0;
	    String sql = "insert into pic_picture (pi_str2) values(?)";
	    PreparedStatement pstmt;
	    for (int j = 0; j < 35; j++) {
	    	 try {
	 	        pstmt = (PreparedStatement) conn.prepareStatement(sql);
	 	        pstmt.setInt(1, j);
	 	        i = pstmt.executeUpdate();
	 	        pstmt.close();
	 	        conn.close();
	 	    } catch (SQLException e) {
	 	        e.printStackTrace();
	 	    }
		}
	    return i;
	}
	
	private static Connection getConn() {
	    String driver = "com.mysql.jdbc.Driver";
	    String url = "jdbc:mysql://localhost:3306/pictures";
	    String username = "root";
	    String password = "root";
	    Connection conn = null;
	    try {
	        Class.forName(driver); //classLoader,加载对应驱动
	        conn = (Connection) DriverManager.getConnection(url, username, password);
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return conn;
	}
}
