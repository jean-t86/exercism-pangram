object Pangram {
    private const val alphabet = "abcdefghijklmnopqrstuvwxyz"

    fun isPangram(input: String): Boolean =
        input.toLowerCase().toHashSet().let { inputByUniqueChars ->
            return inputByUniqueChars.containsAll(alphabet.toSet())
        }
}
