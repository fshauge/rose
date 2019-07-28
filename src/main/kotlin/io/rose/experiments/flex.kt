package io.rose.experiments

import io.rose.BaseElement
import io.rose.Bounds
import io.rose.Element
import io.rose.initElement
import java.awt.Graphics2D

enum class FlexDirection {
    ROW,
    COLUMN
}

class Flex(
    val direction: FlexDirection
) : BaseElement() {
    override fun render(graphics: Graphics2D, bounds: Bounds) {
        children.forEachIndexed { index, child ->
            when (direction) {
                FlexDirection.ROW -> {
                    val width = bounds.w / children.size
                    child.render(graphics, bounds.copy(x = bounds.x + width * index, w = width))
                }
                FlexDirection.COLUMN -> {
                    val height = bounds.h / children.size
                    child.render(graphics, bounds.copy(y = bounds.y + height * index, h = height))
                }
            }
        }
    }
}

fun Element.flex(
    direction: FlexDirection = FlexDirection.ROW,
    init: Flex.() -> Unit
) = initElement(
    Flex(
        direction
    ),
    init
)
