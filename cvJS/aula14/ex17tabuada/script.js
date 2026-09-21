document.querySelector('input#gerar').addEventListener('click',gerarTabuada)

function gerarTabuada (){
    
    //Coleta dados do formulário
    const formTabuada = new FormData (document.querySelector('form#formToTabuada'))

    //Tranforma os formulário em objeto simples
    let dados = Object.fromEntries(formTabuada)

    //Valida se número esta vázio
    if(!dados.numero){
        alert('Digite um número')
        return
    }
    
    let num = Number(dados.numero)
    let selectTab = document.querySelector('select#tabuada')
    
    //limpa o selectTab
    selectTab.innerHTML = ""
    
    for (let i = 0; i <=10; i++){
        //calcula 
        let resulTab = num * i
        let option = document.createElement('option')
        option.text = `${num} x ${i} = ${resulTab}`
        option.value = `${i}`
        selectTab.appendChild(option)

    }
}