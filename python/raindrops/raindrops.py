def convert(number):
    result = ""
    isFactor = False
    if number % 3 == 0:
        result += "Pling"
        isFactor = True
    if number % 5 == 0:
        result += "Plang"
        isFactor = True
    if number % 7 == 0:
        result += "Plong"
        isFactor = True
    if not isFactor:
        result += str(number)
    return result
