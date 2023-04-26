'''
TITLE:
Tic-Tac-Toe Checker

DESCRIPTION:
if we were to set up a Tic-Tac-Toe game, we would want to know whether
the board's current state is solved, wouldn't we? Our goal is to create
a function that will check that for us!

Assume that the board comes in the form of a 3x3 array, where the value
is 0 if a spot is empty, 1 if it is an "X", or 2 if it is an "O", like so:

[[0, 0, 1],
 [0, 1, 2],
 [2, 1, 0]]

We want our function to return:

    -1 if the board is not yet finished AND no one has won yet (there are empty spots),
    1 if "X" won,
    2 if "O" won,
    0 if it's a cat's game (i.e. a draw).

You may assume that the board passed in is valid in the context of a game of Tic-Tac-Toe.
'''



def is_solved(board):
    # unpacking sequences into lists:
    columns = []
    diagonal1 = []
    diagonal2 = []
    has_empty_space = False

    for i in range(len(board)):
        if 0 in board[i]: has_empty_space = True
        columns.append([])
        diagonal1.append(board[i][i])
        diagonal2.append(board[len(board) - i - 1][len(board) - 1 - i])
        for j in range(len(board)):
            columns[i].append(board[j][i])

    sequences = board + columns + [diagonal1] + [diagonal2]

    # checking for winners:
    for sequence in sequences:
        if len(set(sequence)) == 1 and sequence[0] != 0:
            return sequence[0]

    # if there is no winner, checking if it's unfinished or if it's a tie:
    if has_empty_space:
        return -1
    else:
        return 0


def is_solved2(board):
    # checking for winners:
    if board[0][0] == board[0][1] == board[0][2]: return board[0][0]
    if board[0][0] == board[1][0] == board[2][0]: return board[0][0]
    if board[0][0] == board[1][1] == board[2][2]: return board[0][0]

    if board[0][2] == board[1][1] == board[2][0]: return board[1][1]
    if board[1][0] == board[1][1] == board[1][2]: return board[1][1]
    if board[0][1] == board[1][1] == board[2][1]: return board[1][1]

    if board[0][2] == board[1][2] == board[2][2]: return board[2][2]
    if board[2][0] == board[2][1] == board[2][2]: return board[2][2]

    # checking if it's unfinished:
    for sequence in board:
        if 0 in sequence: return -1

    # then it must be a tie:
    return 0