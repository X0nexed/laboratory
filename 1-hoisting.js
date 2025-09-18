'use strict';

const fn = () => {
    console.log(x)
    var x = 25
    console.log(x)   
};
fn()
module.exports = { fn };
