function binarySearch(list, target){
    let first = 0;
    let last = list.length -1;
    while (first <= last){
        let midpoint = Math.floor((first+last)/2);

        if(list[midpoint] == target){
            return midpoint;
        }else if(list[midpoint]<target){
            first = midpoint+1;
        }else if(list[midpoint]>target){
            last = midpoint-1;
        }

    }
    return null;
}


function verify(index){
    list = [1,2,3,4,5,6,7,8,9,10];
    result = binarySearch(list, index);
    if(result!=null){
        console.log("target found in position: "+ result);
    }else{
        console.log("target not found in list");
    }
}
verify(6);
verify(12);