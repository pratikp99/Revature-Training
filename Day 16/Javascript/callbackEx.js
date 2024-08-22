function doingHomework(subject,callback){
    //console.log("Doing my "+subject+" homework");
    //using back ticks for dynamic values-- called template literals
    console.log(`Doing my ${subject} homework`);
    callback();
    //finishingHomework();
}

function finishingHomework(){
    console.log("Home work finished");
}

doingHomework("Science",finishingHomework);