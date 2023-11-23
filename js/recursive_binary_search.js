function recursiveBinarySearch(list, target){
    let midpoint;
    if(list.length == 0){
        return false;
    }else{
        midpoint = (Math.floor((list.length-1)/2));
        if(list[midpoint] == target){
            return true;
        }
        if(list[midpoint]<target){
            return recursiveBinarySearch(list.slice(midpoint+1),target)
        }
        if(list[midpoint]>target){
            return recursiveBinarySearch(list.slice(0,midpoint+1),target);
        }
    }

}
function verify(result){
    console.log("Target found: " + result);
}

let list = [1,2,3,4,5,6,7,8,9,10];


let target = 12;
let result =recursiveBinarySearch(list,target);
verify(result);

target = 3;
result =recursiveBinarySearch(list,target);
verify(result);