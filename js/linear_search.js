function linearSearch(list, target){
    //returns index position of the target if found, el returns none

    for(number of list){
        if(number == target){
            return target;
        }
    }
    return null;
}

function verify(index){
    list = [1,2,3,4,5,6,7,8,9,10];
    result = linearSearch(list, index);
    if(result!=null){
        console.log("target found in position: "+ index);
    }else{
        console.log("target not found in list");
    }
}
verify(1);