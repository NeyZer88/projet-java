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
    private static String getLevel5   = "{call (Level5)}";
    private static String getInfoMap   = "{call (infomap)}";
    
    
public static ArrayList<String> getInfoMap(int line) throws SQLException {
        final ArrayList<String> elementsMap = new ArrayList<String>();
        final CallableStatement callStatement = prepareCall(getInfoMap);
        callStatement.setInt(1, line);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
       
    		for (int i = 0; i < 5; i++)
            {
            	elementsMap.add(result.getString(i));
            }
            result.close();
        }
        return elementsMap;
    	}
    
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
	
public static ArrayList<String> getLevel5(int line) throws SQLException {
	final ArrayList<String> elementsMap = new ArrayList<String>();
	final CallableStatement callStatement = prepareCall(getLevel5);
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

	public String getElement(int idLevel, int line, int collumn) throws SQLException{
		String element = "";
		ArrayList<String> elementRow = new ArrayList<String>();
		
		switch(idLevel) {

		case 1:
				elementRow = getLevel1(line);
				break;
		case 2: 
				elementRow= getLevel2(line);
				break;
		case 3:
				elementRow= getLevel3(line);
				break;
		case 4:
            	elementRow= getLevel4(line);
            	break;
		case 5:
            	elementRow= getLevel5(line);
            	break;
		}
		element = elementRow.get(collumn);
		return element;
}
}
