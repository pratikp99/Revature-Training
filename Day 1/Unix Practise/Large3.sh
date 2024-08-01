#Input two numbers and find largest from two numbers
#!/bin/bash
echo "Enter two numbers:"
read a
read b
read c
if((a>b&&a>c));
then
	echo "$a is greater"
elif((c>b&&c>a));
then
	echo "$c is greater"
else
	echo "$b is greater"
fi
