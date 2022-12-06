data_file = open("data.txt", "r")

elf_number = 1
elf_most_calories1 = 0
calorie_count = 0
highest_calorie = 0
highest_calorie2 = 0
highest_calorie3 = 0

data_array = []

for line in data_file:
    additem = line.strip()
    if (additem == ""):
        data_array.append(additem)
    else:
        data_array.append(int(additem))

for item in data_array:
    if (item == ""):
        if (calorie_count > highest_calorie):
            highest_calorie = calorie_count
        calorie_count = 0
    else:
        calorie_count += item

calorie_count = 0

for item in data_array:
    if (item == ""):
        if (calorie_count > highest_calorie2 and calorie_count != highest_calorie):
            highest_calorie2 = calorie_count
        calorie_count = 0
    else:
        calorie_count += item

calorie_count = 0

for item in data_array:
    if (item == ""):
        if (calorie_count > highest_calorie3 and calorie_count != highest_calorie2 and calorie_count != highest_calorie):
            highest_calorie3 = calorie_count
        calorie_count = 0
    else:
        calorie_count += item

combined_calorie = highest_calorie + highest_calorie2 + highest_calorie3

print (f"Elf Number: {elf_number} \n \
highest calorie: {highest_calorie} \n \
highest calorie2: {highest_calorie2} \n \
highest calorie3: {highest_calorie3} \n \
combined calorie: {combined_calorie}")

data_file.close()