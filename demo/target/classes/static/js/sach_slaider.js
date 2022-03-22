const sliders = document.querySelectorAll('input[type="range"]');
const div = document.getElementById('input_text1');
const div1 = document.getElementById('input_text2');
const carl = document.querySelector('.carl');
const btn_sach = document.querySelector('.btn_sach');

sliders[0].addEventListener('input', (e) => {
    if (+sliders[0].value + 200 > +sliders[1].value) {
        sliders[1].value = +sliders[0].value + 200;
    }
});

sliders[1].addEventListener('input', (e) => {
    if (+sliders[1].value - 200 < +sliders[0].value) {
        sliders[0].value = +sliders[1].value - 200;
    }
});

sliders.forEach((slider) => {
    slider.addEventListener('change', () => {
        console.log(`from ${sliders[0].value} to ${sliders[1].value}`);
        div.value = `${sliders[0].value}`;
        div1.value = `${sliders[1].value}`;
    })
});

btn_sach.addEventListener('click', () => {
    var xhr = new XMLHttpRequest();

    var json = JSON.stringify({
        name: "Виктор",
        surname: "Цой"
    });

    xhr.open("GET", '/get', true)
    xhr.setRequestHeader('Content-type', 'application/json; charset=utf-8');

  
    document.write(xhr.send(json));


});




