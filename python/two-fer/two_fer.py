# Default argument is none, name is optional
def two_fer(name=None):

    if name is None:
        output_name = "you"
    else:
        output_name = name

    return "One for " + output_name + ", one for me."

