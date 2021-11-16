/* --------------------------------------------------------------------------------
  This file was automatically generated by the Athlos Project Editor.
  Athlos Framework: http://nkasenides.github.io/athlos
  Generated on: 16-11-2021 12:37:22
  Athlos Project Editor, v0.1.0 BETA
-------------------------------------------------------------------------------- */

package com.nkasenides.minesweeper.persistence;


import com.nkasenides.athlos.persistence.*;
import com.nkasenides.minesweeper.model.*;
import com.raylabz.objectis.Objectis;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;


public class MAGameSessionDAO implements MultiDAO<MAGameSession> {


    @Override
    public boolean create(MAGameSession object) {
        Objectis.create(object); //NEW
        return true; //NEW
    }

    @Override
    public boolean update(MAGameSession object) {
        Objectis.update(object); //NEW
        return true; //NEW
    }

    @Override
    public boolean delete(MAGameSession object) {
        Objectis.delete(object); //NEW
        return true; //NEW
    }

    @Override
    public MAGameSession get(String id) {
        return Objectis.get(MAGameSession.class, id); //NEW
    }

    @Override
    public Collection<MAGameSession> getMany(String... ids) {
        return Objectis.getMany(MAGameSession.class, ids); //NEW
    }

    @Override
    public Collection<MAGameSession> list() {
        return Objectis.list(MAGameSession.class); //NEW
    }

    @Override
    public boolean create(Collection<MAGameSession> objects) {
        Objectis.createAll(new ArrayList<>(objects)); //NEW
        return true; //NEW
    }

    @Override
    public boolean update(Collection<MAGameSession> objects) {
        for (MAGameSession object : objects) { //NEW
            Objectis.create(object); //NEW
        } //NEW
        return true; //NEW
    }

    @Override
    public boolean delete(Collection<MAGameSession> objects) {
        Objectis.deleteAll(new ArrayList<>(objects));//NEW
        return true;//NEW
    }

    /**
     * Retrieves the player of the provided session.
     * @param gameSessionID The session's ID.
     * @return Returns a player object 
     */
    public MAPlayer getPlayer(final String gameSessionID) {
        final MAGameSession maGameSession = get(gameSessionID);//NEW
        return Objectis.get(MAPlayer.class, maGameSession.getPlayerID());//NEW
    }

    /**
     * Retrieves multiple world sessions using the provided IDs.
     * @param ids A list of world session IDs.
     * @return Returns a list of world sessions.
     */
    public List<MAGameSession> getMany(List<String> ids) {
        return Objectis.getMany(MAGameSession.class, ids);//NEW
    }


}


