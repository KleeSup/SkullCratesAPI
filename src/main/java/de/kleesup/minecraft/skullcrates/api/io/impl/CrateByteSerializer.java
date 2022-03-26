package de.kleesup.minecraft.skullcrates.api.io.impl;

import de.kleesup.minecraft.skullcrates.api.SkullCrate;
import de.kleesup.minecraft.skullcrates.api.io.CrateSerializer;

/**
 * @author KleeSup
 * @version 1.0
 * Class created on 23.03.2022
 *
 * An implementation of {@link CrateSerializer} for serializing/deserializing crates to/from bytes.
 */
public interface CrateByteSerializer extends CrateSerializer {

    @Override
    byte[] serializeCrate(final SkullCrate skullCrate);

    @Override
    SkullCrate deserializeCrate(final Object data);
}
