
fun main () {

    val text = "Live, Live Abundantly"

    println("Original text: $text")

    println( "Expunge vowels: %s".format( expungeVowels(text) ) )
}

fun expungeVowels( text: String ): String {

    val result = StringBuilder()

    for ( char in text ) {

        if ( !"aeiou".contains(char.toLowerCase()) ) {

            result.append( char )
        }
    }

    return result.toString()
}