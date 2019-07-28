package io.rose

import java.awt.Graphics2D

interface Element {
    val children: MutableList<Element>
    fun layout(bounds: Bounds): Bounds
    fun render(graphics: Graphics2D, bounds: Bounds)
}

open class BaseElement : Element {
    override val children: MutableList<Element> = mutableListOf()
    override fun layout(bounds: Bounds): Bounds = bounds
    override fun render(graphics: Graphics2D, bounds: Bounds) = children.forEach {
        it.render(graphics, bounds)
    }
}

fun <T : Element> Element.initElement(element: T, init: T.() -> Unit) =
    children.add(element.apply(init))

fun root(init: Element.() -> Unit): Element = BaseElement().apply(init)
