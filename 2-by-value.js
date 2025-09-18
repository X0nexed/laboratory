'use strict';
const a = 5;
const inc = (a) => {
    return a + 1;
   
};
const b = inc(a)
console.log (b);
module.exports = { inc };
