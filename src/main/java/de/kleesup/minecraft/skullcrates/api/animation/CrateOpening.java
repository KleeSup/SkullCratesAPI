package de.kleesup.minecraft.skullcrates.api.animation;

import de.kleesup.minecraft.skullcrates.api.SkullCrate;
import org.bukkit.entity.Player;

import java.util.HashMap;

/**
 * @author KleeSup
 * @version 1.0
 * Class created on 22.03.2022
 *
 * The class will handle crate animations. This class will be temporarily created when a player
 * opens a crate.
 */
public abstract class CrateOpening {

    /**
     * This Map can be used for {@link CrateOpeningPreparation#doAnimationTick(CrateOpening)} to
     * save and gather information about the current animation progress.
     */
    public HashMap<String, Object> animationMemory = new HashMap<>();

    private boolean running = false;
    private final Player player;
    private final SkullCrate crate;
    public CrateOpening(final Player player, final SkullCrate crate){
        this.player = player;
        this.crate = crate;
        running = true;
        open();
    }

    public abstract void open();

    public Player getPlayer() {
        return player;
    }

    public SkullCrate getCrate() {
        return crate;
    }

    public boolean isRunning() {
        return running;
    }
}
