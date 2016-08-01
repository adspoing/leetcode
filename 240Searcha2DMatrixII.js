/**
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
var searchMatrix = function(matrix, target) {
     var row = matrix.length-1;
     var col = matrix[0].length-1;
     if(matrix==null || row<0||col<0){
         return false;
     }
     var rowt=0;var colt=col;
     while(colt >=0 && rowt <= row){
         if(target == matrix[rowt][colt]){
             return true;
         }else if(target < matrix[rowt][colt]){
             colt--;
         }else if(target > matrix[rowt][colt]){
             rowt++;
         }
         
     }
     return false;
     
};