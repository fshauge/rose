package io.rose.experiments

import io.rose.experiments.FlexDirection.COLUMN
import io.rose.experiments.FlexDirection.ROW
import io.rose.root
import java.awt.Color

fun app() = root {
    flex(direction = ROW) {
        flex(direction = COLUMN) {
            box(Color.RED)
            box(Color.GREEN)
        }
        flex(direction = COLUMN) {
            box(Color.BLUE)
            box(Color.YELLOW)
        }
    }
}
