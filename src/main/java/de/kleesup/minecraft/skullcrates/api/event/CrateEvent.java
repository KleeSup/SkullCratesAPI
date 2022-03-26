package de.kleesup.minecraft.skullcrates.api.event;

import de.kleesup.minecraft.skullcrates.api.SkullCrate;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerEvent;

/**
 * @author KleeSup
 * @version 1.0
 * Class created on 22.03.2022
 *
 * A core implementation for crate events.
 */
public abstract class CrateEvent extends PlayerEvent {

    private final SkullCrate skullCrate;
    public CrateEvent(Player who, final SkullCrate crate) {
        super(who);
        this.skullCrate = crate;
    }

    public SkullCrate getSkullCrate(){
        return skullCrate;
    }

}
