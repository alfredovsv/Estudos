
function carregar (){
    var msg = document.querySelector('div#msg')
    var img = document.querySelector('img#imagem')
    var agora = new Date()
    var hora = agora.getHours()
    var minutos = agora.getMinutes()
    hora = 15

    msg.innerHTML = `Agora são ${hora} horas`

    if (hora >0 && hora < 12){
        //Bom dia! #c49753
        msg.innerHTML += '. Bom dia!'
        img.src = 'img/manha.png';
        document.body.style.background = '#c49753'
        

    }else if (hora >= 12 & hora < 18){
        //Boa tarde!
        msg.innerHTML += '. Boa tarde!'
        img.src = 'img/tarde.png'
        document.body.style.background = '#7e6349'

    }else{
        //Boa noite!
        msg.innerHTML += '. Boa noite!'
        img.src = 'img/noite.png'
        document.body.style.background = '#031a44'
    }

}
