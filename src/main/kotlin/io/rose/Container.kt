package io.rose

import java.awt.Component
import java.awt.Dimension
import java.awt.Graphics
import javax.swing.JFrame

class Container(
    render: Render,
    title: String = "Rose",
    width: Int = 800,
    height: Int = 600
) : JFrame(title) {
    init {
        size = Dimension(width, height)
        add(object : Component() {
            override fun paint(graphics: Graphics) {
                render(Context(graphics, Bounds(0, 0, size.width, size.height)))
            }
        })
    }

    fun run() {
        setLocationRelativeTo(null)
        isVisible = true
    }
}
