import kotlin.math.sqrt

fun main() {
    println(
        isValidSudoku(
            listOf(
                charArrayOf('1', '2', '4', '3'),
                charArrayOf('3', '4', '1', '2'),
                charArrayOf('2', '1', '3', '4'),
                charArrayOf('4', '3', '2', '1')
            )
        )
    )
}

fun isValidSudoku(board: List<CharArray>): Boolean {
    val size = board.size
    val boxSize = sqrt(size.toDouble()).toInt()

    if (board.any { it.size != size } ||
        size !in listOf(0, 3, 4, 9, 16)) return false

    for (i in 0..<size) {
        val rowSet = mutableSetOf<Char>()
        val colSet = mutableSetOf<Char>()
        val boxSet = mutableSetOf<Char>()

        for (j in 0..<size) {
            val rowVal = board[i][j]
            val colVal = board[j][i]
            val boxVal = if(size != 3)board[boxSize * (i / boxSize) + (j / boxSize)][boxSize * (i % boxSize) + (j % boxSize)] else board[i][j]

            if (rowVal != '_' && !rowSet.add(rowVal)) return false
            if (colVal != '_' && !colSet.add(colVal)) return false
            if (boxVal != '_' && !boxSet.add(boxVal)) return false
            if (!rowVal.isDigit() && rowVal != '_') return false
        }
    }
    return true
}