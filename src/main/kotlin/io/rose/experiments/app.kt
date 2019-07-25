package io.rose.experiments

import io.rose.Render
import java.awt.Color

fun app(): Render = flexRow(
    flexColumn(
        box(Color.RED),
        box(Color.GREEN)
    ),
    flexColumn(
        box(Color.BLUE),
        box(Color.YELLOW)
    )
)
