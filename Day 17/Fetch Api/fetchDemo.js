
function getData(){
    fetch("https://reqres.in/api/users").then((response)=>{
        //console.log(response.json()); 
        return response.json();
    }).then((mydata)=>{
        console.log(mydata.data[0].first_name);
    }).catch((error)=>{
        console.log(error);
    })
}

getData()