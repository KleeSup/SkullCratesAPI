package de.kleesup.minecraft.skullcrates.api.backend;

/**
 * @author KleeSup
 * @version 1.0
 * Class created on 23.03.2022
 *
 * An implementation of {@link CrateBackend} to support database backend implementations.
 */
public abstract class CrateDatabaseBackend extends CrateBackend {

    /**
     * @return Whether the backend has a connection to the database.
     */
    public abstract boolean isConnected();

    /**
     * Terminates current database connections.
     */
    public abstract void disconnect();

    @Override
    public boolean canWrite() {
        return isConnected();
    }

    @Override
    public boolean canRead() {
        return isConnected();
    }
}
