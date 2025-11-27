const pipe = (...fns) => {
    for (const fn of fns) {
        if (typeof fn !== 'function') {
            throw new Error('404');
        }
    }
    return (x) => {
        return fns.reduce((value, func) => func(value), x);
    };
};
const inc = x => ++x;
const twice = x => x * 2;
const cube = x => x ** 3;

const f = pipe(inc, twice, cube);
const x = f(5);
console.log(x);
try {
    const fError = pipe(inc, 7, cube);
} catch (e) {
    console.error("error:", e.message);
}