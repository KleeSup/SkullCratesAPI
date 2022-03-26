package de.kleesup.minecraft.skullcrates.api.reward;

import org.bukkit.inventory.ItemStack;

/**
 * @author KleeSup
 * @version 1.0
 * Class created on 22.03.2022
 *
 * An implementation of {@link CrateReward} which uses an ItemStack as reward.
 */
public abstract class ItemCrateReward implements CrateReward {

    private final ItemStack item;
    public ItemCrateReward(final ItemStack item){
        this.item = item;
    }

    public ItemStack getItem() {
        return item;
    }
}
