package de.kleesup.minecraft.skullcrates.api;

import de.kleesup.minecraft.skullcrates.api.animation.CrateOpening;
import de.kleesup.minecraft.skullcrates.api.animation.CrateOpeningPreparation;
import de.kleesup.minecraft.skullcrates.api.reward.CrateReward;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;

/**
 * @author KleeSup
 * @version 1.0
 * Class created on 21.03.2022
 */
public interface SkullCrate {

    /**
     * @return The ID of the crate
     */
    String getID();

    /**
     * @return The skull item given to players which opens the crate
     */
    ItemStack getDisplayItem();

    /**
     * @return All possible rewards that can be received by opening this crate.
     */
    Collection<CrateReward> getPossibleRewards();

    /**
     * @return The animation configuration for this crate.
     */
    CrateOpeningPreparation getOpeningAnimation();

    /**
     * Sets the animation configuration for this crate
     * @param crateAnimation The animation configuration
     */
    void setOpeningAnimation(final CrateOpeningPreparation crateAnimation);

    /**
     * Starts opening a crate for a player with the default {@link CrateOpeningPreparation}
     * set for this class
     * @param player The player to open the crate for
     * @return A new instance of {@link CrateOpening}
     */
    CrateOpening open(final Player player);

    /**
     * Starts opening a crate for a player with a given {@link CrateOpeningPreparation}
     * @param player The player to open the crate for
     * @param animation The configuration for the animation
     * @return A new instance of {@link CrateOpening}
     */
    CrateOpening open(final Player player, final CrateOpeningPreparation animation);

}
