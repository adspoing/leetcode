/*
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
  var map=[];
  if(s.length!=t.length)
    return false;
  for(var x in s){
      if(isNaN(map[s[x]])) map[s[x]]=1;
      else map[s[x]]++;
      if(isNaN(map[t[x]])) map[t[x]]=-1;
      else map[t[x]]--;
  }
  for(var key in map){
      if(map[key]!==0)   
        return false;
  }
  return true;
};