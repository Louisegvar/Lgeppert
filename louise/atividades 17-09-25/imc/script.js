const peso= document.getElementById('peso');
const altura= document.getElementById('altura');
const btnimc= document.getElementById('calcular');
const resul= document.getElementById('resultado');

btnimc.addEventListener ('click', () => {
    const peso = Number (pesoInput.value);
    const altura = Number (alturaInput.value);
    const alt= altura/100;
    const imc = peso / (alt * alt);
    if (imc<18.5) {
        resul.textContent = "Você está abaixo do peso.";
    } else if (imc => 18.5 && imc <= 24.9) {
        resul.textContent = "Você está com o peso normal.";
    } else if (imc => 25 && imc<= 29.9) {
        resul.textContent = "Você está com sobrepeso.";
    } else {
        resul.textContent = "Você está com obesidade.";
    }
})