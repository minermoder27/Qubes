/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame.cubes;

import com.jme3.math.ColorRGBA;
import com.jme3.scene.Geometry;
import mygame.Cube;

/**
 *
 * @author Campbell Suter
 */
public class WoodCube extends Cube {

    public WoodCube(Geometry geom) {
        super(geom);
        geom.getMaterial().setColor("Color", ColorRGBA.Brown.add(new ColorRGBA(0, 0, 0, -0.25f)));
    }
}
