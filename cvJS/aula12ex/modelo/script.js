
document.querySelector('input[type="button"]').addEventListener('click', verificar)


function verificar() {

    var anoNasc = document.querySelector('input#anoNascimento')?.value
    var sexo = document.querySelector('input[name="sexo"]:checked')?.value
    var msg = 'Detecatamos '
    var src = 'img/'
    var agora = new Date()
    var ano = agora.getFullYear()
    anoNasc = parseInt(anoNasc)

    //VALIDAÇÕES DOS DADOS

    //Validar se ano nacimento esta em branco
    if (!anoNasc || Number.isNaN(anoNasc)){
        window.alert('Ano de Nascimento vazio!')
        return
    }

    //valida se ano de nascimento é valido
    if (anoNasc <= 1930 || anoNasc > ano){
        window.alert('Ano de Nascimento inválido!')
        return
    }

    //Validar sexo  esta em branco
    if (!sexo || sexo.trim() === ""){
        window.alert('Sexo vazio!')
        return
    }



    //Calcular idade
    var idade = ano - anoNasc


    //FORMA NOMES E MENSAGEM CONFORME REGRA
    //Verficação de idade e imagem
    /*
        HOMEM
        0 - 12
        13 - 18
        18 - 50
        >50
    
        MULHER
        0 - 12
        13 - 18
        18 - 50
        >50
    */

    //Coninua na formação da msg e inicia o nome do arquivo
    if (sexo == "feminino") {
        msg += `uma mulher com ${idade} anos `
        src += 'mulher'
    } else {
        msg += `um homem com ${idade} anos `
        src += 'homem'

    }


    //Continua na formação do nome da imagem, pois já definimos se é homem ou mulher no nome. Ex: src = img/homem
    switch (true) {
        case (idade <= 12):
            src += '0'
            break
        case (idade <= 18):
            src += '12'
            break
        case (idade < 50):
            src += '18'
            break
        case (idade >= 50):
            src += '50'
            break
        default:
            break
    }

    //Continua na formação do nome da imagem colocando .png
    src += '.png'

    //FIM FORMAÇÃO DE MENSAGEM E NOME DA IMAGEM

    //Adiciona ao html
    var resul = document.querySelector('div#resultado')
    resul.innerHTML = `<p> ${msg} </p><img src='${src}'>`
}




