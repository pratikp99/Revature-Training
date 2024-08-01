#Write script to read to numbers and display their sum
#!/bin/bash
echo "Enter two numbers:"
read a
read b
k=$(($a+$b))
echo "Sum is $k"