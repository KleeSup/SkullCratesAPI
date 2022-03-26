package de.kleesup.minecraft.skullcrates.api.backend.impl;

import de.kleesup.minecraft.skullcrates.api.backend.SQLBackend;

import java.io.File;

/**
 * @author KleeSup
 * @version 1.0
 * Class created on 25.03.2022
 *
 * An implementation of {@link SQLBackend} which supports SQLite (file sql) database backend.
 */
public abstract class SQLiteCrateBackend extends SQLBackend {

    private final File file;
    public SQLiteCrateBackend(final File file, String url, String username, String password) {
        super(url, username, password);
        this.file = file;
    }
    public SQLiteCrateBackend(final String path, String url, String username, String password) {
        this(new File(path),url,username,password);
    }
    public SQLiteCrateBackend(final String child, final String parent, String url, String username, String password) {
        this(new File(child,parent), url,username,password);
    }

    public File getFile() {
        return file;
    }
}
