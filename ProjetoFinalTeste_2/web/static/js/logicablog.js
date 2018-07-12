
function Logar(){
    var login  = document.getElementById('email').value
    var senha = document.getElementById('pwd').value
    var div = document.getElementById('qlqcoisa')
    if(login === 'william' && senha==='william'){
        window.alert('william logado');
        div.style.display='none';
    }else{
        window.alert('usuario ou senha invalido')
    }   
}

//uso do addEventListener
function mudarCor(id){
    p = document.getElementById(id);
    p.style.color = '#B22222';    
}

function voltaCor(id){
    p = document.getElementById(id);
    p.style.color = '#777';   
}
//closure funcao da cor externa
window.onload=function(){
    var x = document.getElementById('demo1');
    x.addEventListener("mouseover", function(){mudarCor('demo1');}, false);
    x.addEventListener("mouseout", function(){voltaCor('demo1');}, false);
    var x = document.getElementById('demo2');
    x.addEventListener("mouseover", function(){mudarCor('demo2');}, false);
    x.addEventListener("mouseout", function(){voltaCor('demo2');}, false);
    var x = document.getElementById('demo3');
    x.addEventListener("mouseover", function(){mudarCor('demo3');}, false);
    x.addEventListener("mouseout", function(){voltaCor('demo3');}, false);
    var x = document.getElementById('demo4');
    x.addEventListener("mouseover", function(){mudarCor('demo4');}, false);
    x.addEventListener("mouseout", function(){voltaCor('demo4');}, false);
};

$(function(){
   $("#for-block1").click(function(){
       window.confirm("CONFIRMAR CADASTRO");
       window.alert("VERIFIQUE SEU EMAIL PARA CONFIRMAR SEU CADASTRO");
     
   });
 
   $("#for-block2").click(function(){$("#block2").show();});
 
   $("#for-block3").click(function(){$("#block3").toggle();});
 
   $("#fadeout-block1").click(function(){$("#block1").show().hide("slow");});
 
   $("#fadein-block2").click(function(){$("#block2").hide().show("slow");});});