const compose = (...fns) => {
    const listeners = [];

    const composed = function(initialValue) {
        let result = initialValue;

        try {
            for (let i = fns.length - 1; i >= 0; i--) {
                result = fns[i](result);
            }
            return result;
        } catch (error) {
            listeners.forEach(handler => handler(error));
            return undefined;
        }
    };

    composed.on = (event, handler) => {
        if (event === 'error' && typeof handler === 'function') {
            listeners.push(handler);
        }
    };

    return composed;
};

const add2 = x => x + 2;
const square = x => x * x;
const double = x => x * 2;
const throwError = x => {
    throw new Error(`Error ${x}`);
};

const f = compose(add2, square, double);
const fError = compose(add2, throwError, double);

fError.on('error', e => {
    console.log(e.message);
});

console.log(f(3));
console.log(fError(5));