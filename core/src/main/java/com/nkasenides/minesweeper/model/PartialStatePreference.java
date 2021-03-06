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
public class PartialStatePreference implements Transmittable<PartialStatePreferenceProto.Builder>, Serializable {
    private int width;    
    private int height;

    public PartialStatePreference() { } //NEW

    public int getWidth() {
        return width;        
    }    
    
    public int getHeight() {    
        return height;        
    }    
    

    public void setWidth(int width) {    
        this.width = width;        
    }    
    
    public void setHeight(int height) {    
        this.height = height;        
    }    
    

    @Override    
    public com.nkasenides.minesweeper.proto.PartialStatePreferenceProto.Builder toProto() {    
        com.nkasenides.minesweeper.proto.PartialStatePreferenceProto.Builder protoBuilder = com.nkasenides.minesweeper.proto.PartialStatePreferenceProto.newBuilder();        
        protoBuilder.setWidth(width);        
        protoBuilder.setHeight(height);        
        return protoBuilder;        
    }    
    

}
