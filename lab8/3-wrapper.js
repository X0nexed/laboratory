function contract(fn, ...types) {
    const resultType = types.pop().name.toLowerCase();

    return function(...args) {
        if (args.length !== types.length) {
            throw new TypeError('Args count mismatch');
        }

        for (let i = 0; i < args.length; i++) {
            if (typeof args[i] !== types[i].name.toLowerCase()) {
                throw new TypeError('Arg ' + i + ' invalid');
            }
        }

        const res = fn(...args);

        if (typeof res !== resultType) {
            throw new TypeError('Result invalid');
        }

        return res;
    };
}

function add(a, b) {
    return a + b;
}

const addNumbers = contract(add, Number, Number, Number);
console.dir(addNumbers(2, 3)); // 5