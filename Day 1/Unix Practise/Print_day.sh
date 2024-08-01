#!/bin/bash
echo "Enter number between 0 to 6:"
read a

if((a>6||a<0))
then 
	echo "Invalid"
fi

case $a in
	0) echo "Sunday";;
	1) echo "Monday";;
	2) echo "Tuesday";;
	3) echo "Wednesday";;
	4) echo "Thursday";;
	5) echo "Friday";;
	6) echo "Saturday";;
esac
