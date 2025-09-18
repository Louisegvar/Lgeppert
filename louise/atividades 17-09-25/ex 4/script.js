const senha1 = document.getElementById('senha1');
const senha2 = document.getElementById('senha2');
const btnVerificar = document.getElementById('verificar');
const resultado = document.getElementById('resultado');
btnVerificar.addEventListener('click', () => {
 if (senha1.value === senha2.value) {
 resultado.textContent = 'Senhas OK!';
 resultado.style.color = 'green';
 } else {
 resultado.textContent = 'As senhas não coincidem.';
 resultado.style.color = 'red';
 }
});