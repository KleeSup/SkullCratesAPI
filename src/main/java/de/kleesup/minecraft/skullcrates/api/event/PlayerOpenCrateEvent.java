package de.kleesup.minecraft.skullcrates.api.event;

import de.kleesup.minecraft.skullcrates.api.SkullCrate;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

/**
 * @author KleeSup
 * @version 1.0
 * Class created on 22.03.2022
 *
 * A cancelable crate event that gets called when a player is about to open a crate.
 */
public class PlayerOpenCrateEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final SkullCrate crate;
    private boolean cancelled;
    public PlayerOpenCrateEvent(final Player who, final SkullCrate crate) {
        super(who);
        this.crate = crate;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        cancelled = cancel;
    }

    public SkullCrate getCrate() {
        return crate;
    }
}
