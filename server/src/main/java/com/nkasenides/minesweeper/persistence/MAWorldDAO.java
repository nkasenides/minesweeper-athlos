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


public class MAWorldDAO implements MultiDAO<MAWorld> {


    @Override
    public boolean create(MAWorld object) {
        Objectis.create(object);//NEW
        return true;//NEW
    }

    @Override
    public boolean update(MAWorld object) {
        Objectis.update(object);//NEW
        return true;//NEW
    }

    @Override
    public boolean delete(MAWorld object) {
        Objectis.delete(object); //NEW
        return true; //NEW
    }

    @Override
    public MAWorld get(String id) {
        return Objectis.get(MAWorld.class, id); //NEW
    }

    @Override
    public Collection<MAWorld> getMany(String... ids) {
        return Objectis.getMany(MAWorld.class, ids); //NEW
    }

    @Override
    public Collection<MAWorld> list() {
        return Objectis.list(MAWorld.class); //NEW
    }

    @Override
    public boolean create(Collection<MAWorld> objects) {
        Objectis.createAll(new ArrayList<>(objects)); //NEW
        return true;
    }

    @Override
    public boolean update(Collection<MAWorld> objects) {
        for (MAWorld object : objects) { //NEW
            Objectis.update(object); //NEW
        } //NEW
        return true; //NEW
    }

    @Override
    public boolean delete(Collection<MAWorld> objects) {
        Objectis.deleteAll(new ArrayList<>(objects)); //NEW
        return true;
    }


     /**
     * Retrieve a world by name.
     * @param name The name of the world.
     * @return Returns a World object.
     */
    public MAWorld getByName(String name) {
        //NEW
        final List<MAWorld> list = Objectis.list(MAWorld.class);
        for (MAWorld maWorld : list) {
            if (maWorld.getName().equals(name)) {
                return maWorld;
            }
        }
        return null;
    }

    /**
     * Lists a player's worlds.
     * @param playerID The player.
     * @return Returns a collection of worlds.
     */
    public Collection<MAWorld> listByPlayer(String playerID) {
        //NEW
        ArrayList<MAWorld> worlds = new ArrayList<>();
        final List<MAWorld> list = Objectis.list(MAWorld.class);
        for (MAWorld maWorld : list) {
            if (maWorld.getOwnerID().equals(playerID)) {
                worlds.add(maWorld);
            }
        }
        return worlds;
    }

}


