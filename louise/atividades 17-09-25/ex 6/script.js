const frases = [
 "Acredite em si mesmo.",
 "O sucesso nasce do caos.",
 "A vida é uma jornada, não um destino.",
 "Seja a mudança que você quer ver no mundo."
];
const btnGerarFrase = document.getElementById('gerar-frase');
const fraseParagrafo = document.getElementById('frase');
btnGerarFrase.addEventListener('click', () => {
 const indiceAleatorio = Math.floor(Math.random() * frases.length);
 fraseParagrafo.textContent = frases[indiceAleatorio];
});