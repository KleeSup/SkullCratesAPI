package de.kleesup.minecraft.skullcrates.api.backend.impl;

import de.kleesup.minecraft.skullcrates.api.backend.CrateDatabaseBackend;

/**
 * @author KleeSup
 * @version 1.0
 * Class created on 23.03.2022
 *
 * An implementation of {@link CrateDatabaseBackend} which supports MongoDB database backend.
 */
public abstract class MongoDBCrateBackend extends CrateDatabaseBackend {

    public MongoDBCrateBackend(final String URI, final String databaseName){
        connect(URI, databaseName);
    }

    /**
     * Connects to an MongoDB database with a given URI-string.
     * @param URI The URI for the database to connect to.
     * @param databaseName The name of the database within the MongoDB database
     */
    public abstract void connect(final String URI, final String databaseName);

    /**
     * @return The URI from the current connection.
     */
    public abstract String getURI();

}
