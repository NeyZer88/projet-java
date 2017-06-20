package model.dao;


import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class LevelsDAO  extends AbstractDAO{

    private static String getLevel1   = "{call (Level1)}";
    private static String getLevel2   = "{call (Level2)}";
    private static String getLevel3   = "{call (Level3)}";
    private static String getLevel4   = "{call (Level4)}";
    


public static ArrayList<String> getLevel1(int line) throws SQLException {
    final ArrayList<String> elementsMap = new ArrayList<String>();
    final CallableStatement callStatement = prepareCall(getLevel1);
    callStatement.setInt(1, line);
    if (callStatement.execute()) {
        final ResultSet result = callStatement.getResultSet();
   
		
		for (int i = 0; i < 15; i++)
        {
        	elementsMap.add(result.getString(i));
        }
        result.close();
    }
    return elementsMap;
	}


public static ArrayList<String> getLevel2(int line) throws SQLException {
    final ArrayList<String> elementsMap = new ArrayList<String>();
    final CallableStatement callStatement = prepareCall(getLevel2);
    callStatement.setInt(1, line);
    if (callStatement.execute()) {
        final ResultSet result = callStatement.getResultSet();
   
		
		for (int i = 0; i < 30; i++)
        {
        	elementsMap.add(result.getString(i));
        }
        result.close();
    }
    return elementsMap;
	}


public static ArrayList<String> getLevel3(int line) throws SQLException {
    final ArrayList<String> elementsMap = new ArrayList<String>();
    final CallableStatement callStatement = prepareCall(getLevel3);
    callStatement.setInt(1, line);
    if (callStatement.execute()) {
        final ResultSet result = callStatement.getResultSet();
   
		
		for (int i = 0; i < 30; i++)
        {
        	elementsMap.add(result.getString(i));
        }
        result.close();
    }
    return elementsMap;
}




public static ArrayList<String> getLevel4(int line) throws SQLException {
final ArrayList<String> elementsMap = new ArrayList<String>();
final CallableStatement callStatement = prepareCall(getLevel4);
callStatement.setInt(1, line);
if (callStatement.execute()) {
    final ResultSet result = callStatement.getResultSet();

	
	for (int i = 0; i < 30; i++)
    {
    	elementsMap.add(result.getString(i));
    }
    result.close();
}
return elementsMap;
}
}
