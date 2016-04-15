import os

commit = input("please input commit:\n")

commands = ('git add .',
    "git commit -m '"+commit+"'",
    "git push")

for s in commands:
	print(s)
	os.system(s)
