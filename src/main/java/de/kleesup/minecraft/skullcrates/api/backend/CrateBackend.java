package de.kleesup.minecraft.skullcrates.api.backend;

import de.kleesup.minecraft.skullcrates.api.SkullCrate;
import de.kleesup.minecraft.skullcrates.api.serialization.CrateSerializer;

/**
 * @author KleeSup
 * @version 1.0
 * Class created on 23.03.2022
 *
 * A class that handles crate saving and loading from a backend implementation.
 * This can be used to support i.e. MySQL, MongoDB, Redis ...
 */
public abstract class CrateBackend implements Backend<SkullCrate> {

    /**
     * Saves the crate to the backend
     * @param crate The crate
     */
    public void saveCrate(final SkullCrate crate){
        saveSerializedCrate(getSerializer().serializeCrate(crate));
    }

    /**
     * Saves an already serialized crate to the backend
     * @param data The serialized data from a crate
     */
    public abstract void saveSerializedCrate(final Object data);

    /**
     * Checks whether a crate is saved to the backend.
     * @param id The id of the crate
     * @return {@code true} if a crate with the given id is saved, {@code false} otherwise.
     */
    public abstract boolean isCrateSaved(final String id);

    /**
     * Returns a crate saved by its ID
     * @param id The id to return the crate from
     * @return The
     */
    public SkullCrate getCrate(final String id){
        return getSerializer().deserializeCrate(getSerializedCrate(id));
    }

    public abstract Object getSerializedCrate(final String id);

    public abstract CrateSerializer getSerializer();

}
