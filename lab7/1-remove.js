function removeElement(array, item) {
    const index = array.indexOf(item);

    if (index !== -1) {
        array.splice(index, 1);
    }
}

const numbers = [1, 2, 3, 4, 5, 6, 7];
removeElement(numbers, 5);
console.log(numbers);

const cities = ['Kiev','Lviv', 'Odesa', 'Warsaw'];
removeElement(cities, 'Lviv');
removeElement(cities, 'Berlin');
console.log(cities);
