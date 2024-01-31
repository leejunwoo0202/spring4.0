package org.example;

import java.sql.Connection;

public interface ConnectionProvider {

    public Connection getConnection();
}
