package de.kleesup.minecraft.skullcrates.api;

import de.kleesup.minecraft.skullcrates.api.animation.CrateOpening;
import de.kleesup.minecraft.skullcrates.api.backend.CrateBackend;
import org.bukkit.entity.Player;

public abstract class SkullCratesAPI {

    public static SkullCratesAPI instance;

    private CrateBackend crateBackend;
    public SkullCratesAPI(final CrateBackend defaultCrateBackend){
        this.crateBackend = defaultCrateBackend;
    }

    /**
     * Returns a crate by its string identifier
     * @param id The id of the crate
     * @return The crate with the corresponding ID
     */
    public abstract SkullCrate getCrateByID(final String id);

    /**
     * Returns the {@link CrateOpening} instance from a crate opening of a player (in case they are opening a crate)
     * @param player The player to get the opening from
     * @return The {@link CrateOpening} instance if the player's opening a crate, {@code null} otherwise
     */
    public abstract CrateOpening getRunningCrateOpening(final Player player);

    /**
     * Checks whether a player is opening a crate
     * @param player The player to check for
     * @return {@code true} if the specified player is currently opening a crate, {@code false} otherwise
     */
    public boolean isOpeningCrate(final Player player){
        return getCrateBackend() != null;
    }

    /**
     * Sets the backend to a given backend instance
     * @param backend The backend
     */
    public void setCrateBackend(final CrateBackend backend){
        this.crateBackend = backend;
        reload();
    }

    /**
     * @return The backend for crates that is currently in use
     */
    public CrateBackend getCrateBackend() {
        return crateBackend;
    }

    /**
     * Reloads the backend with all crates, configs etc.
     */
    public abstract void reload();





}
