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

import java.util.List;
import java.util.Collection;


public class MATerrainChunkDAO implements WorldBasedDAO<MATerrainChunk> {


    @Override
    public boolean create(MATerrainChunk object) {
        Objectis.create(object); //NEW
        return true; //NEW
    }

    @Override
    public boolean update(MATerrainChunk object) {
        Objectis.update(object); //NEW
        return true; //NEW
    }

    @Override
    public boolean delete(MATerrainChunk object) {
        Objectis.delete(object); //NEW
        return true; //NEW
    }

    @Override
    public MATerrainChunk get(String itemID) {
        return Objectis.get(MATerrainChunk.class, itemID); //NEW
    }

    @Override
    public MATerrainChunk getForWorld(String worldID, String itemID) {
        //NEW
        return Objectis.collection(MATerrainChunk.class,worldID + "_chunks")
                .filter()
                .whereEqualTo("worldID", itemID)
                .limit(1)
                .fetch()
                .getItems()
                .get(0);
    }

    @Override
    public Collection<MATerrainChunk> listForWorld(String worldID) {
        return Objectis.collection(MATerrainChunk.class,worldID + "_chunks").list();//NEW
    }

}


