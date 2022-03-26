package de.kleesup.minecraft.skullcrates.api.reward;

import org.bukkit.entity.Player;

/**
 * @author KleeSup
 * @version 1.0
 * Class created on 22.03.2022
 *
 * A core class for reward implementations
 */
public interface CrateReward {

    void givePlayer(final Player player);

}
