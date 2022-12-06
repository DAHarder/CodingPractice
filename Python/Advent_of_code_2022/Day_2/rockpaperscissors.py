data_file = open("data.txt", "r")

score = 0
full_array = []
count = 0

values = {
    "AY": 4,
    "AX": 3,
    "AZ": 8,
    "BY": 5,
    "BX": 1,
    "BZ": 9,
    "CY": 6,
    "CX": 2,
    "CZ": 7
}

# ROCK 1
# PAPER 2
# SCISSOR 3

# DRAW 3
# LOSE 0
# WIN 6

# a = ROCK
# b = PAPER
# c = SCISSORS

# x = lose
# y = draw
# z = win

for line in data_file:
    line_array = line.replace(" ", "").strip()
    full_array.append(line_array)

for item in full_array:
    score += values.get(item)

print (score)

data_file.close()
        