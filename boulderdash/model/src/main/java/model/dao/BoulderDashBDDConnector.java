package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

final class BoulderDashBDDConnector {

    private static BoulderDashBDDConnector instance;

    private static String user     = "root";

    private static String password = "";

    private static String url = "jdbc:mysql://localhost:3306/boulderdash";

    private Connection connection;

    private Statement statement;

    private BoulderDashBDDConnector() {
        this.open();
    }

    public static BoulderDashBDDConnector getInstance() {
        if (instance == null) {
            setInstance(new BoulderDashBDDConnector());
        }
        return instance;
    }

    private static void setInstance(final BoulderDashBDDConnector instance) {
        BoulderDashBDDConnector.instance = instance;
    }

    private boolean open() {
        try {
            this.connection = DriverManager.getConnection(BoulderDashBDDConnector.url, BoulderDashBDDConnector.user,
                    BoulderDashBDDConnector.password);
            this.statement = this.connection.createStatement();
            return true;
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }
        return false;
    }

    public ResultSet executeQuery(final String query) {
        try {
            return this.getStatement().executeQuery(query);
        } catch (final SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public java.sql.CallableStatement prepareCall(final String query) {
        try {
            return this.getConnection().prepareCall(query);
        } catch (final SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int executeUpdate(final String query) {
        try {
            return this.statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
        } catch (final SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public Connection getConnection() {
        return this.connection;
    }

    public void setConnection(final Connection connection) {
        this.connection = connection;
    }

    public Statement getStatement() {
        return this.statement;
    }

    public void setStatement(final Statement statement) {
        this.statement = statement;
    }

}
