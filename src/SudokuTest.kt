fun main(){

    testSudoku(
        name = "valid Sudoku in 3 * 3 size Without complete Board",
        result = isValidSudoku(
            listOf(
                charArrayOf('3', '_', '_'),
                charArrayOf('2', '_', '3'),
                charArrayOf('1', '3', '_')
            )
        ),
        correctResult = true
    )
    testSudoku(
        name = "valid Sudoku in 3 * 3 size With complete Board",
        result = isValidSudoku(
            listOf(
                charArrayOf('1', '2', '3'),
                charArrayOf('2', '3', '1'),
                charArrayOf('3', '1', '2')
            )
        ),
        correctResult = true
    )
    testSudoku(
        name = "invalid Sudoku in 3 * 3 size with no Digit",
        result = isValidSudoku(
            listOf(
                charArrayOf('_', '_', '_'),
                charArrayOf('_', '_', '_'),
                charArrayOf('_', '_', '_')
            )
        ),
        correctResult = true
    )
    testSudoku(
        name = "Any row in the board contains a duplicate number in 3 * 3 size",
        result = isValidSudoku(
            listOf(
                charArrayOf('1', '2', '3'),
                charArrayOf('2', '3', '1'),
                charArrayOf('3', '2', '2')
            )
        ),
        correctResult = false
    )
    testSudoku(
        name = "Any column in the board contains a duplicate number in 3 * 3 size",
        result = isValidSudoku(
            listOf(
                charArrayOf('1', '2', '3'),
                charArrayOf('2', '1', '3'),
                charArrayOf('3', '1', '2')
            )
        ),
        correctResult = false
    )
    testSudoku(
        name = "The board contains symbols in 3 * 3 size",
        result = isValidSudoku(
            listOf(
                charArrayOf('1', '2', '3'),
                charArrayOf('2', '3', '@'),
                charArrayOf('3', '1', '2')
            )
        ),
        correctResult = false
    )
    testSudoku(
        name = "The board contains Character in 3 * 3 size",
        result = isValidSudoku(
            listOf(
                charArrayOf('1', '2', '3'),
                charArrayOf('2', '3', 'a'),
                charArrayOf('3', '1', '2')
            )
        ),
        correctResult = false
    )
    testSudoku(
        name = "In a 3 * 3 board: contains invalid numbers (values outside the range)",
        result = isValidSudoku(
            listOf(
                charArrayOf('1', '2', '3'),
                charArrayOf('2', '3', '1'),
                charArrayOf('3', '1', '0')
            )
        ),
        correctResult = false
    )

    //////////////////////////////////////////////////////////////////


    testSudoku(
        name = "valid Sudoku in 4 * 4 size With complete Board",
        result = isValidSudoku(
            listOf(
                charArrayOf('1', '2', '4', '3'),
                charArrayOf('3', '4', '1', '2'),
                charArrayOf('2', '1', '3', '4'),
                charArrayOf('4', '3', '2', '1')
            )
        ),
        correctResult = true
    )
    testSudoku(
        name = "valid Sudoku in 4 * 4 size Without complete Board",
        result = isValidSudoku(
            listOf(
                charArrayOf('_', '2', '4', '3'),
                charArrayOf('3', '4', '1', '_'),
                charArrayOf('2', '_', '3', '4'),
                charArrayOf('_', '3', '2', '1')
            )
        ),
        correctResult = true
    )
    testSudoku(
        name = "invalid Sudoku in 4 * 4 size with no Digit",
        result = isValidSudoku(
            listOf(
                charArrayOf('_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_')
            )
        ),
        correctResult = true
    )
    testSudoku(
        name = "Any row in the board contains a duplicate number in 4 * 4 size",
        result = isValidSudoku(
            listOf(
                charArrayOf('2', '2', '_', '4'),
                charArrayOf('3', '4', '1', '2'),
                charArrayOf('1', '_', '3', '_'),
                charArrayOf('_', '4', '1', '3')
            )
        ),
        correctResult = false
    )
    testSudoku(
        name = "Any column in the board contains a duplicate number in 4 * 4 size",
        result = isValidSudoku(
            listOf(
                charArrayOf('_', '2', '_', '4'),
                charArrayOf('3', '4', '1', '2'),
                charArrayOf('1', '_', '3', '_'),
                charArrayOf('_', '4', '1', '2')
            )
        ),
        correctResult = false
    )
    testSudoku(
        name = "Duplicate number found in a 2 * 2 subgrid",
        result = isValidSudoku(
            listOf(
                charArrayOf('_', '2', '_', '4'),
                charArrayOf('3', '4', '1', '2'),
                charArrayOf('1', '_', '3', '_'),
                charArrayOf('_', '4', '1', '2')
            )
        ),
        correctResult = false
    )
    testSudoku(
        name = "The board contains symbols in 4 * 4 size",
        result = isValidSudoku(
            listOf(
                charArrayOf('_', '2', '_', '4'),
                charArrayOf('3', '4', '1', '2'),
                charArrayOf('1', '@', '3', '_'),
                charArrayOf('_', '4', '1', '2')
            )
        ),
        correctResult = false
    )
    testSudoku(
        name = "The board contains character in 4 * 4 size",
        result = isValidSudoku(
            listOf(
                charArrayOf('_', '2', '_', '4'),
                charArrayOf('3', '4', '1', '2'),
                charArrayOf('1', 'A', '3', '_'),
                charArrayOf('_', '4', '1', '2')
            )
        ),
        correctResult = false
    )
    testSudoku(
        name = "In a 4 * 4 board: contains invalid numbers (values outside the range)",
        result = isValidSudoku(
            listOf(
                charArrayOf('_', '2', '_', '4'),
                charArrayOf('3', '4', '1', '2'),
                charArrayOf('1', '0', '3', '_'),
                charArrayOf('_', '4', '1', '2')
            )
        ),
        correctResult = false
    )

    //////////////////////////////////////////////////////////////////

    testSudoku(
        name = "valid Sudoku in 9 * 9 size Without complete Board",
        result = isValidSudoku(
            listOf(
                charArrayOf('5', '3', '_', '_', '7', '_', '_', '_', '_'),
                charArrayOf('6', '_', '_', '1', '9', '5', '_', '_', '_'),
                charArrayOf('_', '9', '8', '_', '_', '_', '_', '6', '_'),
                charArrayOf('8', '_', '_', '_', '6', '_', '_', '_', '3'),
                charArrayOf('4', '_', '_', '8', '_', '3', '_', '_', '1'),
                charArrayOf('7', '_', '_', '_', '2', '_', '_', '_', '6'),
                charArrayOf('_', '6', '_', '_', '_', '_', '2', '8', '_'),
                charArrayOf('_', '_', '_', '4', '1', '9', '_', '_', '5'),
                charArrayOf('_', '_', '_', '_', '8', '_', '_', '7', '9')
            )
        ),
        correctResult = true
    )
    testSudoku(
        name = "Valid Sudoku in 9 * 9 size With complete Board",
        result = isValidSudoku(
            listOf(
                charArrayOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
                charArrayOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
                charArrayOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
                charArrayOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
                charArrayOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
                charArrayOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
                charArrayOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
                charArrayOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
                charArrayOf('3', '4', '5', '2', '8', '6', '1', '7', '9')
            )
        ),
        correctResult = true
    )
    testSudoku(
        name = "invalid Sudoku in 9 * 9 size with no Digit",
        result = isValidSudoku(
            listOf(
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_')
            )
        ),
        correctResult = true
    )
    testSudoku(
        name = "Any row in the board contains a duplicate number in 9 * 9 size",
        result = isValidSudoku(
            listOf(
                charArrayOf('5', '3', '3', '_', '7', '_', '_', '_', '_'),
                charArrayOf('6', '_', '_', '1', '9', '5', '_', '_', '_'),
                charArrayOf('_', '9', '8', '_', '_', '_', '_', '6', '_'),
                charArrayOf('8', '_', '_', '_', '6', '_', '_', '_', '3'),
                charArrayOf('4', '_', '_', '8', '_', '3', '_', '_', '1'),
                charArrayOf('7', '_', '_', '_', '2', '_', '_', '_', '6'),
                charArrayOf('_', '6', '_', '_', '_', '_', '2', '8', '_'),
                charArrayOf('_', '_', '_', '4', '1', '9', '_', '_', '5'),
                charArrayOf('_', '_', '_', '_', '8', '_', '_', '7', '9')
            )
        ),
        correctResult = false
    )
    testSudoku(
        name = "Any column in the board contains a duplicate number in 9 * 9 size",
        result = isValidSudoku(
            listOf(
                charArrayOf('5', '3', '_', '_', '7', '_', '_', '_', '_'),
                charArrayOf('6', '_', '_', '1', '9', '5', '_', '_', '_'),
                charArrayOf('5', '9', '8', '_', '_', '_', '_', '6', '_'),
                charArrayOf('8', '_', '_', '_', '6', '_', '_', '_', '6'),
                charArrayOf('4', '_', '_', '8', '_', '3', '_', '_', '1'),
                charArrayOf('7', '_', '_', '_', '2', '_', '_', '_', '6'),
                charArrayOf('_', '6', '_', '_', '_', '_', '2', '8', '_'),
                charArrayOf('_', '_', '_', '4', '1', '9', '_', '_', '5'),
                charArrayOf('_', '_', '_', '_', '8', '_', '_', '7', '9')
            )
        ),
        correctResult = false
    )
    testSudoku(
        name = "Duplicate number found in a 3 * 3 subgrid",
        result = isValidSudoku(
            listOf(
                charArrayOf('5', '3', '_', '_', '7', '_', '_', '_', '_'),
                charArrayOf('6', '_', '3', '1', '9', '5', '_', '_', '_'),
                charArrayOf('_', '9', '8', '_', '_', '_', '_', '6', '_'),
                charArrayOf('8', '_', '_', '_', '6', '_', '_', '_', '3'),
                charArrayOf('4', '_', '_', '8', '_', '3', '_', '_', '1'),
                charArrayOf('7', '_', '_', '_', '2', '_', '_', '_', '6'),
                charArrayOf('_', '6', '_', '_', '_', '_', '2', '8', '_'),
                charArrayOf('_', '_', '_', '4', '1', '9', '_', '_', '5'),
                charArrayOf('_', '_', '_', '_', '8', '_', '_', '7', '9')
            )
        ),
        correctResult = false
    )
    testSudoku(
        name = "The board contains symbols in 9 * 9 size",
        result = isValidSudoku(
            listOf(
                charArrayOf('5', '3', '_', '_', '7', '_', '_', '_', '_'),
                charArrayOf('6', '_', '_', '1', '9', '5', '_', '_', '_'),
                charArrayOf('_', '#', '8', '_', '_', '_', '_', '6', '_'),
                charArrayOf('8', '_', '_', '_', '6', '_', '_', '_', '3'),
                charArrayOf('4', '_', '_', '8', '@', '3', '_', '_', '1'),
                charArrayOf('7', '_', '_', '_', '2', '_', '_', '_', '6'),
                charArrayOf('_', '6', '_', '_', '_', '_', '2', '8', '_'),
                charArrayOf('_', '_', '_', '4', '1', '9', '_', '_', '5'),
                charArrayOf('_', '_', '_', '_', '8', '_', '_', '7', '9')
            )
        ),
        correctResult = false
    )
    testSudoku(
        name = "The board contains Character in 9 * 9 size",
        result = isValidSudoku(
            listOf(
                charArrayOf('5', '3', '_', '_', '7', '_', '_', '_', '_'),
                charArrayOf('6', '_', '_', '1', '9', '5', '_', '_', '_'),
                charArrayOf('_', '#', '8', '_', '_', '_', '_', '6', '_'),
                charArrayOf('8', '_', '_', '_', '6', '_', '_', '_', '3'),
                charArrayOf('4', '_', '_', '8', 'A', '3', '_', '_', '1'),
                charArrayOf('7', '_', '_', '_', '2', '_', '_', '_', '6'),
                charArrayOf('_', '6', '_', '_', '_', '_', '2', '8', '_'),
                charArrayOf('_', '_', '_', '4', '1', '9', '_', '_', '5'),
                charArrayOf('_', '_', '_', '_', '8', '_', '_', '7', '9')
            )
        ),
        correctResult = false
    )
    testSudoku(
        name = "In a 9 * 9 board: contains invalid numbers (values outside the range)",
        result = isValidSudoku(
            listOf(
                charArrayOf('5', '3', '_', '_', 'A', '_', '_', '_', '_'),
                charArrayOf('6', '_', '_', '1', '9', '1', '_', '_', '_'),
                charArrayOf('_', '9', '8', '_', '_', '_', '_', '6', '_'),
                charArrayOf('8', '_', '_', '_', '6', '_', '_', '_', '3'),
                charArrayOf('4', '_', '_', '8', '1', '3', '_', '_', '1'),
                charArrayOf('7', '_', '_', '_', '2', '_', '_', '_', '6'),
                charArrayOf('_', '6', '_', '_', '_', '_', '2', '8', '_'),
                charArrayOf('_', '_', '_', '4', '1', '9', '_', '_', '5'),
                charArrayOf('_', '_', '_', '_', '8', '_', '_', '7', '0')
            )
        ),
        correctResult = false
    )

    //////////////////////////////////////////////////////////////////

    testSudoku(
        name = "valid Sudoku in 16 * 16 size with no Digit",
        result = isValidSudoku(
            listOf(
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
            )
        ), correctResult = true
    )
    testSudoku(
        name = "Any row in the board contains a duplicate number in 16 * 16 size",
        result = isValidSudoku(
            listOf(
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '5', '5'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
            )
        ), correctResult = false
    )
    testSudoku(
        name = "Any column in the board contains a duplicate number in 16 * 16 size",
        result = isValidSudoku(
            listOf(
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '5'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '5'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
            )
        ), correctResult = false
    )
    testSudoku(
        name = "The board contains character in 16 * 16 size",
        result = isValidSudoku(
            listOf(
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', 'a'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
            )
        ), correctResult = false
    )
    testSudoku(
        name = "The board contains symbols in 16 * 16 size",
        result = isValidSudoku(
            listOf(
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '@'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
            )
        ), correctResult = false
    )
    testSudoku(
        name = "In a 16 * 16 board: contains invalid numbers (values outside the range)",
        result = isValidSudoku(
            listOf(
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '0'),
                charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'),
            )
        ), correctResult = false
    )

    testSudoku(
        name = "Board is zero cell",
        result = isValidSudoku(
            listOf()
        ),
        correctResult = false
    )
    testSudoku(
        name = "Board has less OR more than size of(rows*column)",
        result = isValidSudoku(
            listOf(
                charArrayOf('5', '3', '_'),
                charArrayOf('6', '_', '_'),
                charArrayOf('4', '8', '_', '_'),

                )
        ),
        correctResult = false
    )
}

fun testSudoku(
    name:String,
    result:Boolean,
    correctResult:Boolean
){
    if(correctResult == result){
        println("Success :$name")
    }
    else{
        println("Failed :$name")
    }

}