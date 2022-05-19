// JavaScript e DOM
// objeto document
console.log(document);

// Acessar informações
console.clear();
console.log(document.domain);
console.log(document.URL);
console.log(document.title);
console.log(document.head);
console.log(document.body);

// Alterar o título
document.title = 123;
// Criar um elemento <h1>
let heading = document.createElement('H1');
heading.innerHTML = 'Olá alunos!';
document.body.appendChild(heading);
heading.style.borderBottom = 'solid 3px #000';

let section = document.createElement('section');
document.body.appendChild(section);
let h1 = document.createElement('h1');
h1.innerHTML = 'Titulo 1';
let p = document.createElement('p');
p.innerHTML = 'Lorem ipsum dolor sit ratione aspernatur excepturi asperiores atque ut voluptate cupiditate culpa?';
section.appendChild(h1);
section.appendChild(p);
