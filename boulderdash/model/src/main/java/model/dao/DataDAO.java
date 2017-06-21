package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DataDAO extends AbstractDAO {
    private static String getDiamondMap   = "{call (diamondNeeded)}";
    private static String getHeightMap   = "{call (Height)}";
    private static String getWidthMap   = "{call (Width)}";

public static ArrayList<String> getHeightMap(int line) throws SQLException {
	final ArrayList<String> heightMap = new ArrayList<String>();
	final CallableStatement callStatement = prepareCall(getHeightMap);
	callStatement.setInt(1, line);
	if (callStatement.execute()) {
		final ResultSet result = callStatement.getResultSet();

		for (int i = 0; i < 5; i++)
		{
			heightMap.add(result.getString(i));
		}
		result.close();
	}
	return heightMap;
	}

public static ArrayList<String> getWidthMap(int line) throws SQLException {
	final ArrayList<String> widthMap = new ArrayList<String>();
	final CallableStatement callStatement = prepareCall(getWidthMap);
	callStatement.setInt(1, line);
	if (callStatement.execute()) {
		final ResultSet result = callStatement.getResultSet();

		for (int i = 0; i < 5; i++)
		{
			widthMap.add(result.getString(i));
		}
		result.close();
	}
	return widthMap; 
}
public static ArrayList<String> getDiamondMap(int line) throws SQLException {
		final ArrayList<String> diamondMap = new ArrayList<String>();
		final CallableStatement callStatement = prepareCall(getDiamondMap);
		callStatement.setInt(1, line);
		if (callStatement.execute()) {
			final ResultSet result = callStatement.getResultSet();

			for (int i = 0; i < 5; i++)
			{
				diamondMap.add(result.getString(i));
			}
			result.close();
		}
		return diamondMap;
		}
}