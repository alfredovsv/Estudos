function parimpar (n){
    if (n%2==0){
        return 'par'
    }else{
        return 'impar'
    }

}

let resul = parimpar(5)

console.log (resul)

//Outro modo de escrever, é uma liguagem funcional
let func = function (){
    return 'ola mundo'
}

console.log(func)
console.log(func())

//Outro modo de escrever, é uma liguagem funcional
let funcX = function (x){
    return x*2
}

console.log(funcX(2))

// => 


//Maneira recursividade, a função chama ela mesmo
function fatorial (n){
    if (n==1){
        return 1
    }

    return n * fatorial (n-1)

}

console.log (fatorial(5))