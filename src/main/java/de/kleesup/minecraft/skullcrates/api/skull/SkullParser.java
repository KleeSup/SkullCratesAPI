package de.kleesup.minecraft.skullcrates.api.skull;

import org.bukkit.inventory.ItemStack;

/**
 * @author KleeSup
 * @version 1.0
 * Class created on 23.03.2022
 *
 * A parser class that creates plain skull items with a texture bases on a value, player name or texture(-link).
 */
public abstract class SkullParser {

    public static SkullParser instance;

    /**
     * Parses a new skull item with the texture of a players skin.
     * @param playerName The players name.
     * @return The newly created skull-item with the texture.
     */
    public abstract ItemStack parseFromPlayer(final String playerName);

    /**
     * Parses a new skull item with the texture of value-string.
     * @param value The value string.
     * @return The newly created skull-item with the texture.
     */
    public abstract ItemStack parseFromValue(final String value);

    /**
     * Parses a new skull item with a given texture(-link).
     * @param texture The texture(-link)
     * @return The newly created skull-item with the texture.
     */
    public abstract ItemStack parseFromTexture(final String texture);




}
