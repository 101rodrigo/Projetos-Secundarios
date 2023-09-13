import csv
from sqlite3 import Cursor
import MySQLdb
#MySQLdb Linux installing: sudo apt-get install python-mysqldb

mydb = MySQLdb.coonect(host='localhost', user='exemple', passwd='exemp', db='exemp')
cursor = mydb.cursor()
cont = 1
csv_data = csv.reader(file('exemple.csv'))


for row in csv_data:
  try:
    cursor.execute('INSERT int TableExemple VALUES(%s, %s, %s, $s)', row)
    print("Cadastro", cont, "realizado com sucesso!")
    cont = cont + 1
  except MySQLdb.Error as e:
    print("Erro ao inserir o cadastro :/", cont)
    
mydb.commit()
cursor.close()
    
