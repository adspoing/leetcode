/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    var old = x;
    var mirror = 0;
    
    while(x) {
        mirror = mirror*10 + x%10;
        x = parseInt(x / 10);
    }
    return mirror === old;
};