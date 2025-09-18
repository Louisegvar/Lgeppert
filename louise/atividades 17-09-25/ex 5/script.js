const num1Input = document.getElementById('num1');
const num2Input = document.getElementById('num2');
const btnSomar = document.getElementById('somar');
const resultadoSpan = document.getElementById('resultado');
btnSomar.addEventListener('click', () => {
 const num1 = Number(num1Input.value);
 const num2 = Number(num2Input.value);
 const soma = num1 + num2;
 resultadoSpan.textContent = soma;
});