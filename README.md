# 🌹 Rose
A Kotlin library for making user interfaces

# Experiments

````kotlin
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
````

The above code produces the following result:

![Experiments](assets/experiments.png)
