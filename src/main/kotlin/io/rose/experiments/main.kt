package io.rose.experiments

import io.rose.Container
import java.awt.Dimension
import javax.swing.JFrame

fun main() {
    val frame = JFrame("App")
    frame.add(Container(app()))
    frame.size = Dimension(800, 600)
    frame.setLocationRelativeTo(null)
    frame.isVisible = true
}
