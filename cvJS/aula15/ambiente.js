let num = [5, 8, 9, 3]

console.log (`Nosso vetor é ${num}`)

num[4] = 6
console.log (`Nosso vetor é ${num}`)

num.push(7)
console.log (`Nosso vetor é ${num}`)
console.log (`Qual o tamho do meu vetor ${num.length}`)

//vamos ordenar
num.sort()
console.log (`o Vetor ordenado ficou -> ${num}`)

for (let i = 0; i < num.length; i++){
    console.log (`Vetor chave ${i} => valor: ${num[i]}`)
}

//for otimizado -  Para cada posição de num, esse for para array e objeto
console.log ('FOR OTIMIZADO')
for (let i in num){
    console.log (`Vetor chave ${i} => valor: ${num[i]}`)
}

//Buscar valor dentro de um vetor, se o retorno -1 o valor não foi encontrado
console.log(`O valor 7 esta na posição ${num.indexOf(7)} utilizei o indexOf`)