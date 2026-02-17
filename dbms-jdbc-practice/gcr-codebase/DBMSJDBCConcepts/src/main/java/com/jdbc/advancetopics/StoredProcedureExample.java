package com.jdbc.advancetopics;

import java.sql.*;

import com.jdbc.establishdatabaseconnection.newconnection.DatabaseConnection;

public class StoredProcedureExample {

	// Create this stored procedure in MySQL first:
	/*
	 * DELIMITER // CREATE PROCEDURE GetStudentsByGrade(IN grade_param VARCHAR(10))
	 * BEGIN SELECT * FROM students WHERE grade = grade_param; END // DELIMITER ;
	 */

	public static void callStoredProcedure(String grade) {
		String sql = "{CALL GetStudentsByGrade(?)}";

		try (Connection conn = DatabaseConnection.getConnection(); CallableStatement cstmt = conn.prepareCall(sql)) {

			cstmt.setString(1, grade);

			boolean hasResults = cstmt.execute();

			if (hasResults) {
				ResultSet rs = cstmt.getResultSet();

				while (rs.next()) {
					System.out.println("ID: " + rs.getInt("id"));

					System.out.println("Name: " + rs.getString("name"));
					System.out.println("Grade: " + rs.getString("grade"));
					System.out.println("----");
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Stored procedure with OUT parameter
	/*
	 * DELIMITER // CREATE PROCEDURE GetStudentCount(OUT total INT) BEGIN SELECT
	 * COUNT(*) INTO total FROM students; END // DELIMITER ;
	 */

	public static void callProcedureWithOutParam() {
		String sql = "{CALL GetStudentCount(?)}";

		try (Connection conn = DatabaseConnection.getConnection(); CallableStatement cstmt = conn.prepareCall(sql)) {

			cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
			cstmt.execute();

			int totalStudents = cstmt.getInt(1);
			System.out.println("Total students: " + totalStudents);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}