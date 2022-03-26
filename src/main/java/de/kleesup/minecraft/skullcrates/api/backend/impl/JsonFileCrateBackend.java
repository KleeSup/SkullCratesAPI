package de.kleesup.minecraft.skullcrates.api.backend.impl;

import de.kleesup.minecraft.skullcrates.api.backend.CrateFileBackend;

import java.io.File;

/**
 * @author KleeSup
 * @version 1.0
 * Class created on 23.03.2022
 *
 * An implementation of {@link CrateFileBackend} which supports json file backend.
 */
public abstract class JsonFileCrateBackend extends CrateFileBackend {
    public JsonFileCrateBackend(File file) {
        super(file);
    }

    public JsonFileCrateBackend(String path) {
        super(path);
    }

    public JsonFileCrateBackend(String parent, String child) {
        super(parent, child);
    }
}
