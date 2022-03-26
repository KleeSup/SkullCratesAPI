package de.kleesup.minecraft.skullcrates.api.serialization.impl;

import de.kleesup.minecraft.skullcrates.api.SkullCrate;
import de.kleesup.minecraft.skullcrates.api.serialization.CrateSerializer;

import java.util.Map;

/**
 * @author KleeSup
 * @version 1.0
 * Class created on 26.03.2022
 */
public interface CrateMapSerializer extends CrateSerializer {

    @Override
    Map<String, Object> serializeCrate(final SkullCrate skullCrate);

    @Override
    SkullCrate deserializeCrate(final Object data);
}
