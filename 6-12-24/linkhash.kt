package demoSetExample

fun main() {
    val set = LinkedHashSet<String>()
    set.add("Aarav")
    set.add("Ishita")
    set.add("Rohan")
    set.add("Ananya")
    set.add("Kabir")
    set.add("Meera")

    for (name in set) {
        println(name)
    }
}
