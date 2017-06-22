package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DataDAO extends AbstractDAO {
    private static String getDiamondMap   = "{call (diamondNeeded)}";
    private static String getHeightMap   = "{call (Height)}";
    private static String getWidthMap   = "{call (Width)}";

public static int getDiamondMap(final int idLevel) throws SQLException {
        final java.sql.CallableStatement callStatement = prepareCall(getDiamondMap);
        int diamond = 0;
        callStatement.setInt(1, idLevel);
        if (callStatement.execute()){
            final ResultSet result = callStatement.getResultSet();
            if (result.next()){
                if (result.first()){
                    diamond = result.getInt(1);
                }
            }
            result.close();
        }
        return diamond;
    }
public static int getWidth(final int idLevel) throws SQLException {
    final java.sql.CallableStatement callStatement = prepareCall(getWidthMap);
    int width = 0;
    callStatement.setInt(1, idLevel);
    if (callStatement.execute()){
        final ResultSet result = callStatement.getResultSet();
        if (result.next()){
            if (result.first()){
                width = result.getInt(1);
            }
        }
        result.close();
    }
    return width;
}
public static int getHeight(final int idLevel) throws SQLException {
    final java.sql.CallableStatement callStatement = prepareCall(getHeightMap);
    int height = 0;
    callStatement.setInt(1, idLevel);
    if (callStatement.execute()){
        final ResultSet result = callStatement.getResultSet();
        if (result.next()){
            if (result.first()){
                height = result.getInt(1);
            }
        }
        result.close();
    }
    return height;
}
}