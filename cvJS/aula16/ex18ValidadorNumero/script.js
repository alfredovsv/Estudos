
//Adiciona função ao eveto de clique dos botões
document.querySelector('input#adicionar').addEventListener('click',adicionar)
document.querySelector('input#finalizar').addEventListener('click',finalizar)

var matrizNum = []

function adicionar (){

    /*COLETAR DADOS
    Set variáveis, apesar de pode pegar a input direto, vou fazer pegando o formulário para treinar*/
  
    //Coletei o dados do formulaŕio
    let dadosForm = new FormData (document.querySelector('form'))
    //Transformei os dados do formulario em objeto simples, ex dados.num
    let dados = Object.fromEntries(dadosForm)
    let numTxt = dados.numero;
   

    /*VALIDAÇÃO DOS DADOS
    Vamos verficar se esta em branco, se esta entre 1 e 100, e se já existe o número*/

    //Valida se esta em branco, como ainda é string validei com tamanho da string
    if(numTxt.length == 0){
        alert ("Digite um número válido!")
        return //sai da função adicionar

    }

    //Valida se esta entre 0 e 100
    let num = Number(numTxt)
    if(num <0 || num >100){
        alert (`Número ${num} não está entre 0 e 100!`)
        return //saida da função adicionar
    }

    //valida se o número já não foi adicionado ou se existe na matriz, posso usar tanto o array.indexOff() que retorna a localização ou -1, ou array.includes() que retorna true ou false
    if (matrizNum.includes(num)){
        alert ('Número já existe na matriz')
        return //saida da função adicionar
    }


    /*REGRAS DO NEǴOCIO E CALCULOS
    Vamos adicionar ao select e também em uma matriz*/
    
    //Adicionando na matriz, usei o push, mas poderia ser matriz[] = num
    matrizNum.push(num)

    /*REGRAS no visual,vamos trabalhar com os objetivos html no caso o select*/

    //seta o elemento hmtl na váriavel
    let selectMatriz = document.querySelector('select#matrizNum')

    //Valida se é o primeiro option e limpa
    if (matrizNum.length <= 1){
        //Limpa as opções
        selectMatriz.innerHTML = ''
    }


    let newOption = document.createElement('option')


    newOption.innerHTML =  `Valor ${num} adicionado`
    
    //Adiciona no select
    selectMatriz.appendChild(newOption)

}

function finalizar (){

    //Set variáveis
    let resul = document.querySelector('div#resultado')

    //Calcula a quantidade posições na matriz
    let qteNum = matrizNum.length
    resul.innerHTML += `<p>Ao todo, temos ${qteNum} números cadastrados</p>`

    //calcula o maior número da matriz
    let numMaior = Math.max(...matrizNum)
    resul.innerHTML += `<p>O maior valor informado foi ${numMaior}.</p>`

    //calcula o emnor número da matriz
    let numMenor = Math.min(...matrizNum)
    resul.innerHTML += `<p>O menor valor informado foi ${numMenor}.</p>`

    //calcula a soma dos números da matriz
    let numSoma = 0;
    for (let i in matrizNum ){
        numSoma += matrizNum[i]
    }
    resul.innerHTML += `<p>Somando todos os valores, temos ${numSoma}.</p>`

    //calcula a media dos números da matriz
    let numMedia = numSoma / qteNum
    resul.innerHTML += `<p>A média dos valores digitados é ${numMedia}.</p>`
}