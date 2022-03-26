package de.kleesup.minecraft.skullcrates.api.backend;

import de.kleesup.minecraft.skullcrates.api.backend.CrateDatabaseBackend;

/**
 * @author KleeSup
 * @version 1.0
 * Class created on 25.03.2022
 *
 * A core class for implementing sql backends.
 */
public abstract class SQLBackend extends CrateDatabaseBackend {

    public SQLBackend(final String url, final String username, final String password){
        connect(url,username,password);
    }

    /**
     * Connects to an SQL database with a given url, username and password.
     * @param url The url to connect to.
     * @param username The username to log in with.
     * @param password The password to log in with.
     */
    public abstract void connect(final String url, final String username, final String password);

}
