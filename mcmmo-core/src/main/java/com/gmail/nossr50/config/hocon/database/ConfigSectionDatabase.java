package com.gmail.nossr50.config.hocon.database;

import ninja.leaping.configurate.objectmapping.Setting;
import ninja.leaping.configurate.objectmapping.serialize.ConfigSerializable;

@ConfigSerializable
public class ConfigSectionDatabase {

    /*
     * CONFIG NODES
     */

    @Setting(value = "Database-Name", comment = "The database name for your DB, this DB must already exist on the SQL server.")
    private String databaseName = "example_database_name";

    @Setting(value = "Table-Prefix", comment = "The Prefix that will be used for tables in your DB")
    private String tablePrefix = "mcmmo_";

    @Setting(value = "Debug", comment = "Enables printing of exceptions for mysql errors")
    private boolean debugMode = false;

    /*
     * GETTER BOILERPLATE
     */

    public String getDatabaseName() {
        return databaseName;
    }

    public String getTablePrefix() {
        return tablePrefix;
    }


    public boolean isDebug() {
        return debugMode;
    }
}