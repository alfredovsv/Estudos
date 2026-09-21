
//Declarar objeto é com { }, já um array é [ ], mas ambos são typeoff objetc, são da mesma classe
let amigo = {
    nome: 'José',
    sexo: 'Masculino',
    peso: 93.5,

    //Posso colocar o item com função
    engordar(p=0){
        this.peso += p
        
    }
}

console.log(amigo)

amigo.engordar(2)

console.log(`Meu amigo ${amigo.nome} pesa ${amigo.peso} kg`)