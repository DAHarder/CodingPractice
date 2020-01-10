def mathEquation():
    import re
    i = 0
    while i < 5:
        mathString = input(
            "Enter a simple math equation in the format xx+xx (example: 12 + 44) You may only use the following four operators (+ - * /)")
        mathString = mathString.replace(" ", "")
        validationVar = re.search("^\d+[+*/-]\d+$", mathString)
        divideByZeroVar = re.search("[/][0]", mathString)
        if validationVar == None:
            print("That is not a valid equation, please try again")
        elif divideByZeroVar != None:
            print("Jesus, are you trying to destroy the universe? Try again fool!")
        else:
            # print(validationVar)
            print("the math equation is", mathString)
            break
        #print(i)
        i += 1
    print("The answer is " + str(round(eval(mathString),2)))

mathEquation()