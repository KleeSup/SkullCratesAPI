package de.kleesup.minecraft.skullcrates.api.event;

import de.kleesup.minecraft.skullcrates.api.SkullCrate;
import de.kleesup.minecraft.skullcrates.api.reward.CrateReward;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

/**
 * @author KleeSup
 * @version 1.0
 * Class created on 22.03.2022
 *
 * A crate event that gets called when a player finished with the crate opening and receives their reward(s).
 */
public class PlayerCrateOpeningFinishEvent extends CrateEvent {

    private CrateReward[] rewards;
    public PlayerCrateOpeningFinishEvent(Player who, final SkullCrate crate, final CrateReward[] prices) {
        super(who, crate);
        this.rewards = prices;
    }

    public void setReward(final CrateReward[] rewards) {
        this.rewards = rewards;
    }

    public CrateReward[] getRewards() {
        return rewards;
    }

    @Override
    public HandlerList getHandlers() {
        return null;
    }
}
