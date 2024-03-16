function IMC() {
    let m = document.getElementById("mass").value;
    let h = document.getElementById("height").value;
    let imc = m / h**2;
    let s;
    if (imc < 18.5) s = "magro";
    else if (imc < 25) s = "normal";
    else if (imc < 30) s = "sobrepeso";
    else if (imc < 40) s = "obeso";
    else s = "gravemente obeso";
    alert(`Seu IMC é ${imc.toFixed(2)}
Você é ${s}.`);
}
function passw() {
    let passw = document.getElementById("passw").value;
    if (passw.includes('0')) alert("Senha inválida, senhas não podem incluir 0.");
    else alert("Senha válida.");
}
function media() {
    let n1 = parseFloat(document.getElementById("n1").value);
    let n2 = parseFloat(document.getElementById("n2").value);
    alert (`a média é ${(n1 + n2)/2}`)
}
function divisores() { //consegui aplicar o jeito legal que quis :3
    let n = parseInt(document.getElementById("n").value);
    let str = "Os divisores deste número são: ";
    for (let i = 1; i < n/2 + 1; i++) if (n % i == 0) str += i + ", ";
    str = str.slice(0, -2);
    str += ` e ${n}.`;
    alert(str);
}
function crescente() {
    let n = [];
    for (let i = 0; i < 3; i++) n.push(document.getElementById(`x${i + 1}`).value);
    n.sort(function(a, b){return a - b});
    alert (`Crescente: ${n}.
O maior é ${n[n.length - 1]}.`);
}
function euAmoNotasMmmmmmMelhoresExercíciosComCertezaNão1000000ésimaVezEba() {
    let n = [];
    for (let i = 0; i < 3; i++) n.push(parseFloat(document.getElementById(`y${i + 1}`).value));
    let med = (n[0] + n[1] + n[2])/3;
    str = `Sua média é ${med.toFixed(2)}, você está `;
    if (med < 5) alert(str+"reprovado.");
    else if (med < 7) alert(str+"de recuperação");
    else alert(str+"aprovado");
}
function circulo() {
    const pi = Math.PI;
    let r = parseFloat(document.querySelector("#r").value); //queryselecor dessa vez poiorque não
    alert(`A área é de ~${(pi * r**2).toFixed(2)}`);
}
function manoQueSaco() { //essa vai ser longa
    let ht = parseInt(document.getElementById("ht").value);
    let vh = parseInt(document.getElementById("vh").value);
    let pd = parseInt((document.getElementById("pd").value))/100;
    alert(`Horas trabalhadas: ${ht}h;
Salário bruto: R$${(ht * vh).toFixed(2)};
Desconto: R$${(ht * vh * pd).toFixed(2)};
Salário líquido: R$${(ht * vh * (1 - pd)).toFixed(2)}`);
}
function nome() {
let nome = document.getElementById("name").value;
let snome = document.getElementById("surname").value;
alert ("Nome completo: "+nome+" "+snome);
}
function volume() {
    let c = parseFloat(document.getElementById("c").value);
    let l = parseFloat(document.getElementById("l").value);
    let h = parseFloat(document.getElementById("h").value);
    alert (`O Volume é ${c * l * h}.`);
}
function login() { //ISSO DAQUI TA SALVO POR FAVOR NÃO MUDAR FOI UM SACO FAZER
    let n = document.getElementById("id").value; //!!
    if (localStorage.getItem("saldo["+n+"]") == null) localStorage.setItem("saldo["+n+"]", "0"); //!!
    let saldo = parseFloat(localStorage.getItem("saldo["+n+"]")); //!!
    document.getElementById("saldo").innerHTML = "Saldo: R$"+saldo.toFixed(2)+"."; //!!
    if (saldo < 0) document.getElementById("msgBad").innerHTML = " Conta estourada.";
    else document.getElementById("msgBad").innerHTML = "";
}
function conta() { //decidi exagerar nesse
    let n = document.getElementById("id").value;
    let saldo = parseFloat(localStorage.getItem("saldo["+n+"]"));
    let op = document.getElementById("op").value;
    let val = parseFloat(document.getElementById("val").value);
    if (op == "dep") saldo += val;
    else saldo -= val;
    localStorage.setItem("saldo["+n+"]", saldo);
    document.getElementById("saldo").innerHTML = "Saldo: R$"+saldo.toFixed(2)+".";
    if (saldo < 0) document.getElementById("msgBad").innerHTML = " Conta estourada.";
    else document.getElementById("msgBad").innerHTML = "";
}
function aumento() {
    let sal = parseFloat(document.getElementById("sal").value);
    let p;
    if (sal < 1500) p = 15;
    else if (sal < 1750) p = 12;
    else if (sal < 2000) p = 10;
    else if (sal < 3000) p = 7;
    else p = 5;
    alert (`Seu aumento será de R$${(sal * p / 100).toFixed(2)}.`);
}
function futebol() {
    let str = document.getElementById("nam").value;
    let age = parseInt(document.getElementById("age").value);
    let cat;
    if (age < 5) {
        alert("idade invalida");
        return;
    }
    else if (age <= 10) cat = "infantil";
    else if (age <= 15) cat = "juvenil";
    else if (age <= 20) cat = "junior";
    else if (age <= 25) cat = "profissional";
    else {
        alert("idade invalida");
        return;
    }
    alert(`A categoria de ${str} é ${cat}.`);
}
function venda() {
    let val = parseFloat(document.getElementById("sale").value);
    let pra = document.getElementById("pra").value;
    let pag = document.getElementById("pag").value;
    let p = -8;
    switch(pra) {
        case "0":
            p -= 10;
            break;
        case "3": 
            p -= 5;
            break;
        case "9": 
            p += 5;
            break;
    }
    if (pag = "cred") p += 1;
    alert(`o valor total de sua conta é R$${(val * (1 + p/100)).toFixed(2)}`);
}
function estado() {
    let c = (document.getElementById("est").value).charAt(0).toLowerCase();
    let str;
    switch(c) {
        case 's':
            str = "solteiro";
            break;
        case 'c':
            str = "casado";
            break;
        case 'd':
            str = "divordciado";
            break;
        case 'v':
            str = "viuvo";
            break;
        default:
            str = "inválido, tente novamente";
            break;
    }
    alert(`seu estado civil é ${str}.`);
}
function local() { //código deveras eficiente com certeza (eu amo else if)
    let val = parseFloat(document.getElementById("val2").value);
    let cod = parseInt(document.getElementById("cod").value);
    let str;
    if (cod < 1) {
        alert("código inválido");
        return;
    } else if (cod == 1) str = "Sul";
    else if (cod == 2) str = "Norte";
    else if (cod == 3) str = "Leste";
    else if (cod == 4) str = "Oeste";
    else if (cod <= 6) str = "Nordeste";
    else if (cod <= 9) str = "Sudeste";
    else if (cod <= 20) str = "Centro-Oeste";
    else if (cod < 25) {
        alert("código inválido");
        return;
    } else if (cod <= 35) str = "Nordeste";
    else {
        alert("código inválido");
        return;
    }
    alert(`R$${val.toFixed(2)} - ${str}`);
}
function calculadora() {
    /*pogger*/ let x = parseFloat(document.getElementById("x").value);
    let y = parseFloat(document.getElementById("y").value);
    let op = document.getElementById("calc").value;
    alert (`o resultado de sua operação é ${eval(x+op+y).toFixed(2)}.`);

    //funny: (tecnicamente esse código funciona exatamente como o acima, só que é tudo só um alert) 

    //alert (`o resultado de sua operação é ${eval(parseFloat(document.getElementById("x").value)+document.getElementById("calc").value+parseFloat(document.getElementById("y").value)).toFixed(2)}.`);

    //Código de acordo com o exercicio:
    
    /*
    let r;
    switch(op) {
        case "+":
            r = x+y;
        case "-":
            r = x-y;
        case "*":
            r = x*y;
        case "/":
            r = x/y;
        case "**":
            r = x**y;
        case "%":
            r = x%y;
    }
    alert (`o resultado de sua operação é ${r.toFixed(2)}.`);
    */
}
function estacoes() {
    let dat = document.getElementById("dat").value;
    let m = parseInt(dat.slice(3, 5));
    let str;
    if (m > 0 && m <= 3) str = "Verão";
    else if (m <= 6) str = "Outono";
    else if (m <= 9) str = "Inverno";
    else if (m <= 12) str = "Primaveira";
    else {
        alert("mês inválido");
        return;
    }
    alert(`"A estação do ano correspondente ao mês ${m} é ${str}"`);
}
function dia() {
    let d = parseInt(document.getElementById("dia").value);
    let str;
    switch(d) {
        case 1:
            str = "o domingo";
            break;
        case 2:
            str = "a segunda-feira";
            break;
        case 3:
            str = "a terça-feira";
            break;
        case 4:
            str = "a quarta-feira";
            break;
        case 5:
            str = "a quinta-feira";
            break;
        case 6:
            str = "a sexta-feira";
            break;
        case 7:
            str = "o sábado";
            break;
        default:
            alert("dia inválido.");
            return;
    }
    alert(`o ${d}° dia da semana é ${str}.`);
}
function decrescente() {
    let n = [];
    for (let i = 0; i < 3; i++) n.push(document.getElementById(`z${i + 1}`).value);
    n.sort(function(a, b){return b - a});
    alert (`decrescente: ${n}.`);
}