package de.kleesup.minecraft.skullcrates.api.backend;

/**
 * @author KleeSup
 * @version 1.0
 * Class created on 21.03.2022
 *
 * Class taken from <a href="https://github.com/KleeSup/CloverPluginUtilities">CloverPluginUtilities</a>
 */
public interface Backend<T> {

    /**
     * Checks whether data can be written to a {@link Backend} implementation
     * @return {@code true} if writing to backend is possible, {@code false} otherwise
     */
    boolean canWrite();

    /**
     * Checks whether data can be read from a {@link Backend} implementation
     * @return {@code true} if reading from backend is possible, {@code false} otherwise
     */
    boolean canRead();

}
