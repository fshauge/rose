package io.rose

import java.awt.Component
import java.awt.Graphics

class Container(private val render: Render) : Component() {
    override fun paint(graphics: Graphics) {
        render(Context(graphics, Bounds(0, 0, width, height)))
    }
}
