package model.dao;

/**
 * <h1>The Class ExampleDAO.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class ExampleDAO extends AbstractDAO {

    /** The sql example by id. */
    // private static String sqlExampleById   = "{call findExampleById(?)}";

    /** The sql example by name. */
    // private static String sqlExampleByName = "{call findExampleByName(?)}";

    /** The sql all examples. */


    /** The id column index. */
    private static int    idColumnIndex    = 1;

    /** The name column index. */
    private static int    nameColumnIndex  = 2;

    /**
     * Gets the example by id.
     *
     * @param id
     *            the id
     * @return the example by id
     * @throws SQLException
     *             the SQL exception
     */
    /**public static Example getExampleById(final int id) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlExampleById);
        Example example = null;
        callStatement.setInt(1, id);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                example = new Example(result.getInt(idColumnIndex), result.getString(nameColumnIndex));
            }
            result.close();
        }
        return example;
    }

    /**
     * Gets the example by name.
     *
     * @param name
     *            the name
     * @return the example by name
     * @throws SQLException
     *             the SQL exception
     */
    /**public static Example getExampleByName(final String name) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlExampleByName);
        Example example = null;

        callStatement.setString(1, name);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                example = new Example(result.getInt(idColumnIndex), result.getString(nameColumnIndex));
            }
            result.close();
        }
        return example;
    }

	private Object connection;

    /**
     * Gets the all examples.
     *
     * @return the all examples
     * @throws SQLException
     *             the SQL exception
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


