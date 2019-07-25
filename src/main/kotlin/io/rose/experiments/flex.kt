package io.rose.experiments

import io.rose.Context
import io.rose.Render

fun flexRow(vararg renders: Render): Render = { (graphics, bounds) ->
    renders.forEachIndexed { index, render ->
        val width = (bounds.width - bounds.x) / renders.size
        render(Context(graphics, bounds.copy(x = bounds.x + width * index, width = width)))
    }
}

fun flexColumn(vararg renders: Render): Render = { (graphics, bounds) ->
    renders.forEachIndexed { index, render ->
        val height = (bounds.height - bounds.y) / renders.size
        render(Context(graphics, bounds.copy(y = bounds.y + height * index, height = height)))
    }
}
