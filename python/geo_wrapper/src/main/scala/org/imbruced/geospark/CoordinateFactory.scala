package org.imbruced.geospark

import com.vividsolutions.jts.geom.Coordinate

object CoordinateFactory {
  def createCoordinates(x: Float, y: Float): Coordinate = {
    new Coordinate(x, y)
  }
}
