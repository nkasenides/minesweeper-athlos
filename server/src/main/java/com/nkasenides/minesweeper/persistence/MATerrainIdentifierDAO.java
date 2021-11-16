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


public class MATerrainIdentifierDAO implements WorldBasedDAO<MATerrainIdentifier> {


    @Override
    public boolean create(MATerrainIdentifier object) {
        Objectis.create(object);//NEW
        return true; //NEW
    }

    @Override
    public boolean update(MATerrainIdentifier object) {
        Objectis.update(object); //NEW
        return true; //NEW
    }

    @Override
    public boolean delete(MATerrainIdentifier object) {
        Objectis.delete(object); //NEW
        return true; //NEW
    }

    @Override
    public MATerrainIdentifier get(String itemID) {
        return Objectis.get(MATerrainIdentifier.class, itemID); //NEW
    }

    @Override
    public MATerrainIdentifier getForWorld(String worldID, String itemID) {
        //NEW
        return Objectis.collection(MATerrainIdentifier.class,worldID + "_identifiers")
                .filter()
                .whereEqualTo("worldID", itemID)
                .limit(1)
                .fetch()
                .getItems()
                .get(0);
    }

    @Override
    public Collection<MATerrainIdentifier> listForWorld(String worldID) {
        return Objectis.collection(MATerrainIdentifier.class,worldID + "_identifiers").list();//NEW
    }

}

