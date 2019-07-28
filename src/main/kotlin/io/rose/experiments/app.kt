package io.rose.experiments

import io.rose.experiments.FlexDirection.ROW
import io.rose.root
import java.awt.Color

fun app() = root {
    flex(direction = ROW) {
        box(Color.BLUE)
        box(Color.GREEN)
    }
}
