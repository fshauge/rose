package io.rose.experiments

import io.rose.Render
import java.awt.Color

fun box(color: Color): Render = { (graphics, bounds) ->
    graphics.color = color
    graphics.fillRect(bounds.x, bounds.y, bounds.width, bounds.height)
}
