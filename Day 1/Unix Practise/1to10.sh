#Write a script to display numbers from 1 to 10

#!/bin/bash

a=1

#while [ $a -lt 11 ]
#do
#   echo $a
#   a=`expr $a + 1`
#done

for((i=1;i<=10;i++))
do
	echo $i
done