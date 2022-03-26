package de.kleesup.minecraft.skullcrates.api.io;

import de.kleesup.minecraft.skullcrates.api.SkullCrate;


/**
 * @author KleeSup
 * @version 1.0
 * Class created on 22.03.2022
 *
 * A class that handles crate serialization and deserialization.
 */
public interface CrateSerializer {

    Object serializeCrate(final SkullCrate skullCrate);

    SkullCrate deserializeCrate(final Object data);

}
