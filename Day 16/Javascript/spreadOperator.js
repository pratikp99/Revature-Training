function add(...numbersToAdd)
{
    let sumSpread=0;
    for(let i of numbersToAdd)
    {
        sumSpread+=i;
    }
    return sumSpread;
}

var numbers=[1,2,3,4];
console.log("Using spread::"+add(...numbers));
add(1,2,3)
