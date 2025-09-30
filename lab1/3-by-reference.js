'use strict';
const Num = {
  n : 5
};
const inc = (obj) => {
 obj.n+= 1
 console.log(obj.n)
};
inc(Num)
module.exports = { inc };
