package de.kleesup.minecraft.skullcrates.api.backend.impl;

import de.kleesup.minecraft.skullcrates.api.backend.SQLBackend;

/**
 * @author KleeSup
 * @version 1.0
 * Class created on 23.03.2022
 *
 * An implementation of {@link SQLBackend} which supports MySQL database backend.
 */
public abstract class MySQLCrateBackend extends SQLBackend {

    public MySQLCrateBackend(final String url, final String username, final String password){
        super(url, username, password);
    }



}
