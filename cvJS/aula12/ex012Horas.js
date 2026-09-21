var agora= new Date()
var hora = agora.getHours()
var minuto = agora.getMinutes()

console.log (`Agora são extamente ${hora} horas.`)

if (hora < 12){
    console.log ('Bom Dia!')
} else if (hora < 18 || (hora == 18 && minuto <= 20)){
    console.log ('Boa Tarde!')
} else{
    console.log ('Boa Noite')
}