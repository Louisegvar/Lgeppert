const btnAlternarTema = document.getElementById('alternar-tema');
let temaClaro = true;
btnAlternarTema.addEventListener('click', () => {
 if (temaClaro) {
 document.body.style.backgroundColor = '#111';
 document.body.style.color = '#fff';
 } else {
 document.body.style.backgroundColor = '#fff';
 document.body.style.color = '#111';
 }
 temaClaro = !temaClaro;
});