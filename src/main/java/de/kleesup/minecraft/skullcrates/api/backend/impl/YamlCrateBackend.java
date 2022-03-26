package de.kleesup.minecraft.skullcrates.api.backend.impl;

import de.kleesup.minecraft.skullcrates.api.backend.CrateBackend;
import de.kleesup.minecraft.skullcrates.api.backend.CrateFileBackend;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

/**
 * @author KleeSup
 * @version 1.0
 * Class created on 23.03.2022
 *
 * An implementation of {@link CrateBackend} which supports YAML file backend.
 */
public abstract class YamlCrateBackend extends CrateFileBackend {

    public YamlCrateBackend(File file) {
        super(file);
    }

    public YamlCrateBackend(String path) {
        super(path);
    }

    public YamlCrateBackend(String parent, String child) {
        super(parent, child);
    }

    public abstract YamlConfiguration getHandler();

}
