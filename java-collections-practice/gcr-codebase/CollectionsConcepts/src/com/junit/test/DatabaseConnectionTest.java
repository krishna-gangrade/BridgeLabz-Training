
package com.junit.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import com.junit.lifecycle.DatabaseConnection;

public class DatabaseConnectionTest {

    DatabaseConnection db;

    @BeforeEach
    void setup() {
        db = new DatabaseConnection();
        db.connect();
    }

    @AfterEach
    void cleanup() {
        db.disconnect();
    }

    @Test
    void testConnectionStatus() {
        assertTrue(db.isConnected());
    }
}
