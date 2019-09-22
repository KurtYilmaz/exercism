def latest(scores):
    return scores[-1]


def personal_best(scores):
    max = 0
    for score in scores:
        if score > max:
            max = score
    return max


def personal_top_three(scores):
    scores.sort(reverse=True)
    return scores[:3]
