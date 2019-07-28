package io.rose.experiments

import io.rose.BaseElement
import io.rose.Bounds
import io.rose.Element
import java.awt.Color
import java.awt.Graphics2D

class Box(val color: Color) : BaseElement() {
    override fun render(graphics: Graphics2D, bounds: Bounds) {
        graphics.color = color
        graphics.fillRect(
            bounds.x.toInt(),
            bounds.y.toInt(),
            bounds.w.toInt(),
            bounds.h.toInt()
        )
    }
}

fun Element.box(color: Color) {
    children.add(Box(color))
}
