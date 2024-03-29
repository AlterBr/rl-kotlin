package org.hexworks.cavesofzircon.extensions

import org.hexworks.zircon.api.data.impl.Position3D


fun Position3D.sameLevelNeighborsShuffled(): List<Position3D> {
    return (-1..1).flatMap { x ->
        (-1..1).map { y ->
            this.withRelativeX(x).withRelativeY(y)
        }
    }.minus(this).shuffled()
}