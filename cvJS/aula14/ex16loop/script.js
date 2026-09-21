
document.querySelector('input[type="button"]').addEventListener('click', contar)


function contar() {

    //Coleta a tag form para coletar os dados
    const formC = document.querySelector('form#formContador')
    const resul = document.querySelector('div#resultado')
    const dadosForm = new FormData(formC)
    //var dados = Object.fromEntries(dadosForm)

    let msgError = document.createElement('div')
    msgError.setAttribute('name', 'msgError')
    let error = false



    dadosForm.forEach((valor, chave) => {

        //Valida se o campo esta vazio
        //GUSTAVO usuou value.length == 0 para validar se tem dado
        if (!valor.trim()) {
            let pError = document.createElement('p')
            pError.textContent = `Campo ${chave} invalido. Campo em branco`
            msgError.appendChild(pError)
            error = true
        }

    })
    //Se tiver algum error de validação, retorna msg e para o código
    if (error) {
        resul.appendChild(msgError)
        return
    }

    //REGRAS E CALCULOS
    /*
    NOTA: Poderia transoforma em objeto comum
    */
    // //Transforma todos os campos do formulário em um objeto comum
    // const dados = Object.fromEntries(dadosForm);

    //     // Os valores vêm como texto, converta-os ao aplicar na regra de negócio:
    // const ini = Number(dados.inicio);
    // const fim = Number(dados.fim);
    // const pas = Number(dados.passo);


    //Seta váriaveis
    const ini = Number(dadosForm.get('txtInicio'))
    const fim = Number(dadosForm.get('txtFim'))
    const pas = Number(dadosForm.get('txtPasso'))
    resul.innerHTML = ''


    if (ini < fim) {
        for (let cor = ini; cor <= fim; cor += pas) {
            //html de retorno
            //corrida += `${cor} \u{1F449}`
            resul.innerHTML += `${cor} \u{1F449}`
        }
    } else {
        for (let cor = ini; cor >= fim; cor -= pas){
            resul.innerHTML +=`${cor} \u{1F448}`
        }
    }





    //resul.innerHTML = `${corrida} \u{01F3C1} `
    resul.innerHTML += ` \u{01F3C1} `






}




