#Input two numbers and find largest from two numbers
#!/bin/bash
echo "Enter two numbers:"
read a
read b
if(($a>$b))
then
	echo "$a is greater"
else
	echo "$b is greater"
fi
