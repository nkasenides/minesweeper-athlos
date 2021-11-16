/* --------------------------------------------------------------------------------
  This file was automatically generated by the Athlos Project Editor.
  Athlos Framework: http://nkasenides.github.io/athlos
  Generated on: 16-11-2021 12:37:22
  Athlos Project Editor, v0.1.0 BETA
-------------------------------------------------------------------------------- */

package com.nkasenides.minesweeper.model;

import com.nkasenides.athlos.proto.Transmittable;
import com.nkasenides.athlos.proto.GenericTransmittable;
import com.nkasenides.minesweeper.proto.*;
import com.nkasenides.athlos.model.*;
import com.raylabz.objectis.annotation.ObjectisObject;

import java.io.Serializable;

@ObjectisObject
public class MAWorldSession implements IWorldSession, Transmittable<MAWorldSessionProto.Builder>, Serializable {
    private PartialStatePreference partialStatePreference;    
    private String worldID;    
    private String playerName;    
    private String ipAddress;    
    private MatrixPosition cameraPosition;    
    private long expiresOn;    
    private String id;    
    private long createdOn;    
    private String playerID;    
    private int points;

    public MAWorldSession() { } //NEW

    public PartialStatePreference getPartialStatePreference() {    
        return partialStatePreference;        
    }    
    
    public String getWorldID() {    
        return worldID;        
    }    
    
    public String getPlayerName() {    
        return playerName;        
    }    
    
    public String getIpAddress() {    
        return ipAddress;        
    }    
    
    public MatrixPosition getCameraPosition() {    
        return cameraPosition;        
    }    
    
    public long getExpiresOn() {    
        return expiresOn;        
    }    
    
    public String getId() {    
        return id;        
    }    
    
    public long getCreatedOn() {    
        return createdOn;        
    }    
    
    public String getPlayerID() {    
        return playerID;        
    }    
    
    public int getPoints() {    
        return points;        
    }    
    

    public void setPartialStatePreference(PartialStatePreference partialStatePreference) {    
        this.partialStatePreference = partialStatePreference;        
    }    
    
    public void setWorldID(String worldID) {    
        this.worldID = worldID;        
    }    
    
    public void setPlayerName(String playerName) {    
        this.playerName = playerName;        
    }    
    
    public void setIpAddress(String ipAddress) {    
        this.ipAddress = ipAddress;        
    }    
    
    public void setCameraPosition(MatrixPosition cameraPosition) {    
        this.cameraPosition = cameraPosition;        
    }    
    
    public void setExpiresOn(long expiresOn) {    
        this.expiresOn = expiresOn;        
    }    
    
    public void setId(String id) {    
        this.id = id;        
    }    
    
    public void setCreatedOn(long createdOn) {    
        this.createdOn = createdOn;        
    }    
    
    public void setPlayerID(String playerID) {    
        this.playerID = playerID;        
    }    
    
    public void setPoints(int points) {    
        this.points = points;        
    }    
    

    @Override    
    public com.nkasenides.minesweeper.proto.MAWorldSessionProto.Builder toProto() {    
        com.nkasenides.minesweeper.proto.MAWorldSessionProto.Builder protoBuilder = com.nkasenides.minesweeper.proto.MAWorldSessionProto.newBuilder();        
        protoBuilder.setPartialStatePreference(partialStatePreference.toProto().build());        
        protoBuilder.setWorldID(worldID);        
        protoBuilder.setPlayerName(playerName);        
        protoBuilder.setIpAddress(ipAddress);        
        protoBuilder.setCameraPosition(cameraPosition.toProto().build());        
        protoBuilder.setExpiresOn(expiresOn);        
        protoBuilder.setId(id);        
        protoBuilder.setCreatedOn(createdOn);        
        protoBuilder.setPlayerID(playerID);        
        protoBuilder.setPoints(points);        
        return protoBuilder;        
    }    
    

}