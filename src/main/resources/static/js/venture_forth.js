const sHealth1 = document.getElementById("soldier-health1");
const sHealth2 = document.getElementById("soldier-health2");
const sHealth3 = document.getElementById("soldier-health3");
const sHealth4 = document.getElementById("soldier-health4");
const sHealth5 = document.getElementById("soldier-health5");
const sHealth6 = document.getElementById("soldier-health6");
const sHealth7 = document.getElementById("soldier-health7");
const sHealth8 = document.getElementById("soldier-health8");
const aHealth = document.getElementById("apprentice-health");
const wHealth = document.getElementById("wizard-health");
const wizXp = document.getElementById("wizard-xp");

document.getElementById("wHealthUpOne").addEventListener("click",function(){wHealth.textContent = parseInt(wHealth.textContent) +1;});
document.getElementById("wHealthDownOne").addEventListener("click",function(){wHealth.textContent = parseInt(wHealth.textContent) -1;});
document.getElementById("wHealthUpFive").addEventListener("click",function(){wHealth.textContent = parseInt(wHealth.textContent) +5;});
document.getElementById("wHealthDownFive").addEventListener("click",function(){wHealth.textContent = parseInt(wHealth.textContent) -5;});

document.getElementById("wXpUpFive").addEventListener("click",function(){wizXp.textContent = parseInt(wizXp.textContent) +5;});
document.getElementById("wXpUpTen").addEventListener("click",function(){wizXp.textContent = parseInt(wizXp.textContent) +10;});
document.getElementById("wXpDownFive").addEventListener("click",function(){wizXp.textContent = parseInt(wizXp.textContent) -5;});
document.getElementById("wXpDownTen").addEventListener("click",function(){wizXp.textContent = parseInt(wizXp.textContent) -10;});

document.getElementById("aHealthUpOne").addEventListener("click",function(){aHealth.textContent = parseInt(aHealth.textContent) +1;});
document.getElementById("aHealthDownOne").addEventListener("click",function(){aHealth.textContent = parseInt(aHealth.textContent) -1;});
document.getElementById("aHealthUpFive").addEventListener("click",function(){aHealth.textContent = parseInt(aHealth.textContent) +5;});
document.getElementById("aHealthDownFive").addEventListener("click",function(){aHealth.textContent = parseInt(aHealth.textContent) -5;});

document.getElementById("sHealthUpOne1").addEventListener("click",function(){sHealth1.textContent = parseInt(sHealth1.textContent) +1;});
document.getElementById("sHealthUpOne2").addEventListener("click",function(){sHealth2.textContent = parseInt(sHealth2.textContent) +1;});
document.getElementById("sHealthUpOne3").addEventListener("click",function(){sHealth3.textContent = parseInt(sHealth3.textContent) +1;});
document.getElementById("sHealthUpOne4").addEventListener("click",function(){sHealth4.textContent = parseInt(sHealth4.textContent) +1;});
document.getElementById("sHealthUpOne5").addEventListener("click",function(){sHealth5.textContent = parseInt(sHealth5.textContent) +1;});
document.getElementById("sHealthUpOne6").addEventListener("click",function(){sHealth6.textContent = parseInt(sHealth6.textContent) +1;});
document.getElementById("sHealthUpOne7").addEventListener("click",function(){sHealth7.textContent = parseInt(sHealth7.textContent) +1;});
document.getElementById("sHealthUpOne8").addEventListener("click",function(){sHealth8.textContent = parseInt(sHealth8.textContent) +1;});

document.getElementById("sHealthDownOne1").addEventListener("click",function(){sHealth1.textContent = parseInt(sHealth1.textContent) -1;});
document.getElementById("sHealthDownOne2").addEventListener("click",function(){sHealth2.textContent = parseInt(sHealth2.textContent) -1;});
document.getElementById("sHealthDownOne3").addEventListener("click",function(){sHealth3.textContent = parseInt(sHealth3.textContent) -1;});
document.getElementById("sHealthDownOne4").addEventListener("click",function(){sHealth4.textContent = parseInt(sHealth4.textContent) -1;});
document.getElementById("sHealthDownOne5").addEventListener("click",function(){sHealth5.textContent = parseInt(sHealth5.textContent) -1;});
document.getElementById("sHealthDownOne6").addEventListener("click",function(){sHealth6.textContent = parseInt(sHealth6.textContent) -1;});
document.getElementById("sHealthDownOne7").addEventListener("click",function(){sHealth7.textContent = parseInt(sHealth7.textContent) -1;});
document.getElementById("sHealthDownOne8").addEventListener("click",function(){sHealth8.textContent = parseInt(sHealth8.textContent) -1;});

document.getElementById("sHealthUpFive1").addEventListener("click",function(){sHealth1.textContent = parseInt(sHealth1.textContent) +5;});
document.getElementById("sHealthUpFive2").addEventListener("click",function(){sHealth2.textContent = parseInt(sHealth2.textContent) +5;});
document.getElementById("sHealthUpFive3").addEventListener("click",function(){sHealth3.textContent = parseInt(sHealth3.textContent) +5;});
document.getElementById("sHealthUpFive4").addEventListener("click",function(){sHealth4.textContent = parseInt(sHealth4.textContent) +5;});
document.getElementById("sHealthUpFive5").addEventListener("click",function(){sHealth5.textContent = parseInt(sHealth5.textContent) +5;});
document.getElementById("sHealthUpFive6").addEventListener("click",function(){sHealth6.textContent = parseInt(sHealth6.textContent) +5;});
document.getElementById("sHealthUpFive7").addEventListener("click",function(){sHealth7.textContent = parseInt(sHealth7.textContent) +5;});
document.getElementById("sHealthUpFive8").addEventListener("click",function(){sHealth8.textContent = parseInt(sHealth8.textContent) +5;});

document.getElementById("sHealthDownFive1").addEventListener("click",function(){sHealth1.textContent = parseInt(sHealth1.textContent) -5;});
document.getElementById("sHealthDownFive2").addEventListener("click",function(){sHealth2.textContent = parseInt(sHealth2.textContent) -5;});
document.getElementById("sHealthDownFive3").addEventListener("click",function(){sHealth3.textContent = parseInt(sHealth3.textContent) -5;});
document.getElementById("sHealthDownFive4").addEventListener("click",function(){sHealth4.textContent = parseInt(sHealth4.textContent) -5;});
document.getElementById("sHealthDownFive5").addEventListener("click",function(){sHealth5.textContent = parseInt(sHealth5.textContent) -5;});
document.getElementById("sHealthDownFive6").addEventListener("click",function(){sHealth6.textContent = parseInt(sHealth6.textContent) -5;});
document.getElementById("sHealthDownFive7").addEventListener("click",function(){sHealth7.textContent = parseInt(sHealth7.textContent) -5;});
document.getElementById("sHealthDownFive8").addEventListener("click",function(){sHealth8.textContent = parseInt(sHealth8.textContent) -5;});