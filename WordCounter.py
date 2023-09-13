import re
div = open("Arquive.txt", "r")
Words = re.findall(r'\w+', div)
totalWords = len(set(Words))
print(totalWords)

div.close()
