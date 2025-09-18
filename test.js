const arr = [42, "Hello", true, null, {name: "Alex"}, [1, 2, 3], 3.14, undefined];
const countTypesInArray = (arr) => {
    const dict = {};
    for (const item of arr) {
        const type = typeof item;
        dict[type] = dict[type] + 1 || 1;
    }
    return dict;
    };
const result = countTypesInArray(arr);
console.dir(arr);
console.dir(result);
module.exports = { countTypesInArray};