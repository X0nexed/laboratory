function removeElements(array, ...items) {

    items.forEach(item => {
        const index = array.indexOf(item);
        if (index !== -1) {
            array.splice(index, 1);
        }
    });
}

const arrayNumbers = [1, 2, 3, 4, 5, 6, 7];
removeElements(arrayNumbers, 5, 1, 6);
console.log(arrayNumbers);

const arrayCities = ['Kiev', 'Beijing', 'Lima', 'Saratov'];
removeElements(arrayCities, 'Lima', 'Berlin', 'Kiev');
console.log(arrayCities);
