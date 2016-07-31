/**
 * @param {number[]} citations
 * @return {number}
 */
var hIndex = function(citations) {
    citations.sort(function(a,b){
        return b-a;
    });
    var res=citations.length;
    for(var key in citations){
        if(parseInt(key)+1==citations[key]){
            res=citations[key];
            break;
        }
        else 
            if(parseInt(key)+1>citations[key]){
                res=parseInt(key);
                break;
            }
    }
    return res;
};