package de.kleesup.minecraft.skullcrates.api.backend;

import java.io.File;

/**
 * @author KleeSup
 * @version 1.0
 * Class created on 23.03.2022
 *
 * An implementation of {@link CrateBackend} for file backend implementations.
 */
public abstract class CrateFileBackend extends CrateBackend {

    private final File file;
    public CrateFileBackend(final File file){
        this.file = file;
    }
    public CrateFileBackend(final String path){
        this(new File(path));
    }
    public CrateFileBackend(final String parent, final String child){
        this(new File(parent,child));
    }

    public File getFile() {
        return file;
    }
}
