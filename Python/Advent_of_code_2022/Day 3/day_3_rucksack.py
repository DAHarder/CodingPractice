data_file = open("data.txt", "r")

line_array = []
result_value = 0

for line in data_file:
    line_data = []
    mid_point = int(len(line) / 2)
    line_data.append(line[:mid_point].strip())
    line_data.append(line[mid_point:].strip())
    line_array.append(line_data)

for item in line_array:
    first_dict = {}
    for character in item[0]:
        first_dict[character] = 1
    for character2 in item[1]:
        if (character2 in first_dict):
            if (first_dict[character2] > 0):
                if (character2.islower()):
                    result_value += (ord(character2)-96)
                    first_dict[character2] -= 1
                else:
                    result_value += (ord(character2)-38)
                    first_dict[character2] -= 1

print (result_value)

data_file.close()

