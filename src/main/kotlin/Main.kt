fun main() {
    print(solution(6, 5))
}

fun solution(score1: Int, score2: Int): Boolean {
    if (score1 == 6 && score2 <= 4)
        return true
    else if (score2 == 6 && score1 <= 4)
        return true
    else if ((score1 == 5 || score1 == 6) && score2 == 7)
        return true
    else if ((score2 == 5 || score2 == 6) && score1 == 7)
        return true

    return false
}