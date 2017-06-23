package model.dao;


import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class LevelsDAO  extends AbstractDAO{
	/* 
	 * the sql for the Level 1
	 */
    private static String getLevel1   = "{call (Level1)}";
	/* 
	 * the sql for the Level 2
	 */
    private static String getLevel2   = "{call (Level2)}";
	/* 
	 * the sql for the Level 3
	 */
    private static String getLevel3   = "{call (Level3)}";
	/* 
	 * the sql for the Level 4
	 */
    private static String getLevel4   = "{call (Level4)}";
	/* 
	 * the sql for the Level 5
	 */
    private static String getLevel5   = "{call (Level5)}";

    
   /**  
    * Get the level 1
    *  Instanciation of the ArrayList "elementsMap"
 *  We did it 30 in a row cause the map have a height of 30
 * 	Close the stored procedure
    * @param line
	* @return elementsMap
    * @throws SQLException
    */
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

/**
 * Get the level 2
 *  Instanciation of the ArrayList "elementsMap"
 *  We did it 30 in a row cause the map have a height of 30
 * 	Close the stored procedure
 * @param line
 * @return elementsMap
 * @throws SQLException
 */
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

/**
 * Get the level 4
 *  Instanciation of the ArrayList "elementsMap"
 *  We did it 30 in a row cause the map have a height of 30
 * 	Close the stored procedure
 * @param line
 * @return elementsMap
 * @throws SQLException
 */
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

/**
 * Get the level 4
 * Instanciation of the ArrayList "elementsMap"
 *  We did it 30 in a row cause the map have a height of 30
 * 	Close the stored procedures
 *
 * @param line
 * @return elementsMap
 * @throws SQLException
 */
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

/**
 * Get the level 5
 *  Instanciation of the ArrayList "elementsMap"
 *  We did it 30 in a row cause the map have a height of 30
 * 	Close the stored procedure
 * @param line
 * @return elementsMap
 * @throws SQLException
 */

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


/**
 * 
 * @param idLevel
 * @param line
 * @param collumn
 * @return
 * @throws SQLException
 */
 
	public static String getElement(int idLevel, int line, int collumn) throws SQLException{
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
