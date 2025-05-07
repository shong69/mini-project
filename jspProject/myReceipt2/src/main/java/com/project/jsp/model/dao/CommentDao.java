package com.project.jsp.model.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.project.jsp.model.domain.Comment;

public class CommentDao {
	private PreparedStatement pstmt;
	private Statement stmt;
	private ResultSet rs;
	private Properties prop;
	
	public CommentDao() {
		try {
			prop = new Properties();
			String filePath = 
					Comment.class.getResource("/com/project/jsp/util/sql/comment-sql.xml").getPath();
			
			prop.loadFromXML(new FileInputStream(filePath));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public int insert(Connection conn, int postId, int memberId, String content, int parentCommentId) {
		int result =0;
		
		String sql = prop.getProperty("insert");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, postId);
			pstmt.setInt(2, memberId);
			pstmt.setString(3, content);
	        if (parentCommentId == -1) {
	            pstmt.setNull(4, java.sql.Types.INTEGER);
	        } else {
	            pstmt.setInt(4, parentCommentId);
	        }
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!= null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

}
