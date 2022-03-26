package de.kleesup.minecraft.skullcrates.api.animation;

import de.kleesup.minecraft.skullcrates.api.SkullCrate;
import org.bukkit.entity.Player;

/**
 * @author KleeSup
 * @version 1.0
 * Class created on 22.03.2022
 *
 * A static class that will implement the code of animation ticks for {@link CrateOpening}
 * events (GUI animations).
 */
public abstract class CrateOpeningPreparation {

    private final SkullCrate crate;
    private int turns, sleepTicks;
    public CrateOpeningPreparation(final SkullCrate crate, final int turns, final int sleepTicks){
        this.crate = crate;
        this.turns = turns;
        this.sleepTicks = sleepTicks;
    }

    /**
     * This method will update the crate animation every {@link CrateOpeningPreparation#sleepTicks}.
     * Needs to be overridden when creating own animations with the API!
     * @param opening The crate opening that the animation should be updated for.
     */
    public abstract void doAnimationTick(final CrateOpening opening);

    /**
     * @return How often a crate animation should receive a {@link CrateOpeningPreparation#doAnimationTick(CrateOpening)} call
     *          before finishing.
     */
    public int getTurns() {
        return turns;
    }

    /**
     * @return The time span in ticks to sleep after every {@link CrateOpeningPreparation#doAnimationTick(CrateOpening)}.
     */
    public int getSleepTicks() {
        return sleepTicks;
    }

    public void setTurns(int turns) {
        this.turns = turns;
    }

    public void setSleepTicks(int sleepTicks) {
        this.sleepTicks = sleepTicks;
    }

    public SkullCrate getCrate() {
        return crate;
    }


}
