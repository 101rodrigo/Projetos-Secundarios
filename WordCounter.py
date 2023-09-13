import re
read = open("Arquive.txt", "r")
Words = re.findall(r'\w+', read)
totalWords = len(set(Words))
print(totalWords)

div.close()
