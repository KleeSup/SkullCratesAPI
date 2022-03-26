package de.kleesup.minecraft.skullcrates.api.backend.impl;

import de.kleesup.minecraft.skullcrates.api.backend.CrateDatabaseBackend;

/**
 * @author KleeSup
 * @version 1.0
 * Class created on 23.03.2022
 *
 * An implementation of {@link CrateDatabaseBackend} which supports Redis database backend.
 */
public abstract class RedisCrateBackend extends CrateDatabaseBackend {

    public RedisCrateBackend(final String IP){
        connect(IP);
    }

    /**
     * Connects to a redis database with a given ip.
     * @param ip The ip to connect to.
     */
    public abstract void connect(final String ip);

    /**
     * @return The IP of the current connection.
     */
    public abstract String getIP();

}
