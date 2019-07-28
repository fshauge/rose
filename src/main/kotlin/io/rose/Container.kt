package io.rose

import java.awt.Component
import java.awt.Graphics
import java.awt.Graphics2D
import java.awt.RenderingHints

class Container(private val element: Element) : Component() {
    override fun paint(graphics: Graphics) {
        when (graphics) {
            is Graphics2D -> paint(graphics)
            else -> throw Error("Invalid graphics object")
        }
    }

    private fun paint(graphics: Graphics2D) {
        graphics.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON
        )

        element.render(graphics, Bounds(0.0, 0.0, width.toDouble(), height.toDouble()))
    }
}
