class soldier
{
    constructor(type, move, fight, shoot, armour, will, health, cost, notes, specialist)
    {
        this.type = type
        this.move = move
        this.fight = fight
        this.shoot = shoot
        this.armour = armour
        this.will = will
        this.health = health
        this.cost = cost
        this.notes = notes
        this.specialist = specialist
    }

}
//standard soldiers
const thug = new soldier("Thug", "6\"","+2","+0","10","-1","10","0",["Hand Weapon"],false)
const thief = new soldier("Thief", "7\"","+1","+0","10","+0","10","0",["Dagger"],false)
const warHound = new soldier("War Hound", "8\"","+1","+0","10","-2","8","10",["Animal"],false)
const infantryman = new soldier("Infantryman", "6\"","+3","+0","11","+0","10","50",["Two-Handed Weapon", " Light Armour"],false)
const manAtArms = new soldier("Man-at-Arms", "6\"","+3","+0","12","+1","12","75",["Hand Weapon"," Shield"," Light Armour"],false)
const apothecary = new soldier("Apothecary", "6\"","+1","+0","10","+3","12","75",["Staff"," Healing Potion"],false)
//specialist soldiers
const archer = new soldier("Archer", "6\"","+1","+2","11","+0","10","75",["Bow"," Quiver"," Dagger"," Light Armour"],true)
const crossbowman = new soldier("Crossbowman", "6\"","+1","+2","11","+0","10","75",["Crossbow"," Quiver"," Dagger"," Light Armour"],true)
const treasureHunter = new soldier("Treasure Hunter", "7\"","+3","+0","11","+2","12","100",["Hand Weapon"," Dagger"," Light Armour"],true)
const tracker = new soldier("Tracker", "7\"","+1","+2","11","+1","12","100",["Staff"," Bow"," Quiver"," Light Armour"],true)
const knight = new soldier("Knight", "5\"","+4","+0","13","+1","12","125",["Hand Weapon"," Dagger"," Shield"," Heavy Armour"],true)
const templar = new soldier("Templar", "5\"","+4","+0","12","+1","12","125",["Two-Handed Weapon", " Heavy Armour"],true)
const ranger = new soldier("Ranger", "7\"","+2","+2","11","+2","12","125",["Bow"," Quiver"," Hand Weapon"," Light Armour"],true)
const barbarian = new soldier("Barbarian", "6\"","+4","+0","10","+3","14","125",["Two-Handed Weapon", " Dagger"],true)
const marksman = new soldier("Marksman", "5\"","+2","+2","12","+1","12","125",["Crossbow"," Quiver"," Hand Weapon"," Heavy Armour"],true)

//When the person presses the "soldier-submit" button. Take the value of "soldier-select" and build a table with the information contained within 

let soldierObj ={thug,thief,warHound, infantryman, manAtArms, apothecary, archer, crossbowman, treasureHunter, tracker, knight, templar, ranger, barbarian, marksman}

document.getElementById("soldier-submit").addEventListener("click",onClick)

//sets max number of soldiers that can be added
let clicks = 0
let maxClicks = 8
function onClick()
{
    if (clicks<maxClicks)
    {
        clicks +=1
        addSoldier()
    }
}

function addSoldier()
{
    let soldierVal = document.getElementById("soldier-select").value

    let table = document.createElement("table");
    let tbody = document.createElement("tbody");
    table.setAttribute("class","table")
    table.appendChild(tbody)

    document.getElementById("soldier-table-div").appendChild(table);
    //number of rows
    for (let i=0; i<5; i++)
    {
        let row = document.createElement("tr")
        //number of cells in those rows
        for(let j =0; j<7; j++)
        {
            let cell = document.createElement("td")
            row.appendChild(cell) 
        }
        tbody.appendChild(row)
        
    }
    let specialistBool =false
    if(soldierObj[soldierVal].specialist===true)
    {
        specialistBool= "Yes"
    }else specialistBool = "No"
    //table information
    table.rows[0].cells[0].innerHTML="Type"
    table.rows[0].cells[1].innerHTML=soldierObj[soldierVal].type
    table.rows[0].cells[2].innerHTML="Cost"
    table.rows[0].cells[3].innerHTML=soldierObj[soldierVal].cost
    table.rows[0].cells[4].innerHTML=""
    table.rows[0].cells[5].innerHTML=""
    table.rows[0].cells[6].innerHTML=""
    table.rows[1].cells[0].innerHTML="Move"
    table.rows[1].cells[1].innerHTML="Fight"
    table.rows[1].cells[2].innerHTML="Shoot"
    table.rows[1].cells[3].innerHTML="Armour"
    table.rows[1].cells[4].innerHTML="Will"
    table.rows[1].cells[5].innerHTML="Health"
    table.rows[1].cells[6].innerHTML="Specialist"
    table.rows[2].cells[0].innerHTML=soldierObj[soldierVal].move
    table.rows[2].cells[1].innerHTML=soldierObj[soldierVal].fight
    table.rows[2].cells[2].innerHTML=soldierObj[soldierVal].shoot
    table.rows[2].cells[3].innerHTML=soldierObj[soldierVal].armour
    table.rows[2].cells[4].innerHTML=soldierObj[soldierVal].will
    table.rows[2].cells[5].innerHTML=soldierObj[soldierVal].health
    table.rows[2].cells[6].innerHTML= specialistBool
    table.rows[3].cells[0].innerHTML="Items"
    table.rows[3].cells[1].innerHTML=soldierObj[soldierVal].notes
    table.rows[3].cells[1].setAttribute("colspan","6")
    table.rows[3].cells[2].innerHTML=""
    table.rows[3].cells[3].innerHTML=""
    table.rows[3].cells[4].innerHTML=""
    table.rows[3].cells[5].innerHTML=""
    table.rows[3].cells[6].innerHTML=""
    table.rows[4].cells[0].innerHTML="Current Health"
    table.rows[4].cells[0].setAttribute("colspan","2")
    table.rows[4].cells[1].className="currHealth table-active"
    table.rows[4].cells[1].setAttribute=("style","font-size: 150%")
    table.rows[4].cells[1].innerHTML=soldierObj[soldierVal].health
    table.rows[4].cells[2].innerHTML="<button>+1</button>"
    table.rows[4].cells[3].innerHTML="<button>-1</button>"
    table.rows[4].cells[4].innerHTML=""
    table.rows[4].cells[5].innerHTML=""
    table.rows[4].cells[6].innerHTML=""
    
    //increment an decrement current health
    let currHealth = parseInt(soldierObj[soldierVal].health)
    let currHealthMax = parseInt(soldierObj[soldierVal].health)
    
    table.rows[4].cells[2].addEventListener("click", function(){
        if (currHealth <currHealthMax)
        {
        currHealth = currHealth+1
        table.rows[4].cells[1].innerHTML=currHealth
        }
    })
    table.rows[4].cells[3].addEventListener("click", function(){
        if (currHealth <=currHealthMax)
        {
        currHealth = currHealth-1
        table.rows[4].cells[1].innerHTML=currHealth
        }
    })
}
let wizMove = document.getElementById("wizMove")
let wizFight = document.getElementById("wizFight")
let wizShoot = document.getElementById("wizShoot")
let wizArmour = document.getElementById("wizArmour")
let wizWill = document.getElementById("wizWill")
let wizHealth = document.getElementById("wizHealth")
let wizCurrHealthVal = document.getElementById("wizCurrHealth")
let wizTable = document.getElementById("wizard")
let wizExp = wizard.rows[1].cells[7]
let appMove = document.getElementById("appMove")
let appFight = document.getElementById("appFight")
let appShoot = document.getElementById("appShoot")
let appArmour = document.getElementById("appArmour")
let appWill = document.getElementById("appWill")
let appHealth = document.getElementById("appHealth")
let appCurrHealthVal = document.getElementById("appCurrHealth")

//these listen for someone to input fields an dupdates the apprentice fields
wizMove.addEventListener('input', updateMove)
wizFight.addEventListener('input', updateFight)
wizShoot.addEventListener('input', updateShoot)
wizArmour.addEventListener('input', updateArmour)
wizWill.addEventListener('input', updateWill)
wizHealth.addEventListener('input', updateHealth)

function updateHealth(e)
{
    wizCurrHealthVal.textContent = e.target.value
    let wizCurrHealth = parseInt(wizCurrHealthVal.textContent)
    let wizCurrHealthMax = parseInt(wizCurrHealthVal.textContent)
    wizard.rows[2].cells[8].addEventListener("click",function()
    {
        if(wizCurrHealth<wizCurrHealthMax)
        {
        wizCurrHealth = wizCurrHealth +1 
        wizard.rows[2].cells[7].innerHTML = wizCurrHealth
        }
    })
    wizard.rows[2].cells[9].addEventListener("click",function()
    {
        if(wizCurrHealth<=wizCurrHealthMax)
        {
        wizCurrHealth = wizCurrHealth -1 
        wizard.rows[2].cells[7].innerHTML = wizCurrHealth
        }
    })
    appHealth.textContent = parseInt(e.target.value)-2
    appCurrHealthVal.textContent = parseInt(e.target.value)-2
    let appCurrHealth = parseInt(appCurrHealthVal.textContent)
    let appCurrHealthMax = parseInt(appCurrHealthVal.textContent)
    apprentice.rows[2].cells[7].addEventListener("click",function()
    {
        if(appCurrHealth<appCurrHealthMax)
        {
        appCurrHealth = appCurrHealth +1 
        apprentice.rows[2].cells[6].innerHTML = appCurrHealth
        }
    })
    apprentice.rows[2].cells[8].addEventListener("click",function()
    {
        if(appCurrHealth<=appCurrHealthMax)
        {
        appCurrHealth = appCurrHealth -1 
        apprentice.rows[2].cells[6].innerHTML = appCurrHealth
        }
    })
}
function updateMove(e)
{
    appMove.textContent = e.target.value
}
function updateFight(e)
{
    appFight.textContent = "+" + (parseInt(e.target.value)-2)
}
function updateShoot(e)
{
    appShoot.textContent = e.target.value
}
function updateArmour(e)
{
    appArmour.textContent = e.target.value
}
function updateWill(e)
{
    appWill.textContent = "+" +(parseInt(e.target.value)-2)
}

let wizFloor = 0
wizCurrExp = parseInt(wizExp.textContent)
console.log(wizCurrExp)
wizard.rows[1].cells[8].addEventListener("click",function()
{
    if( wizCurrExp>=wizFloor)
    {
        wizCurrExp = wizCurrExp +10
        wizard.rows[1].cells[7].innerHTML = wizCurrExp
    }
})
wizard.rows[1].cells[9].addEventListener("click",function()
{
    if( wizCurrExp>=wizFloor)
    {
        wizCurrExp = wizCurrExp +5
        wizard.rows[1].cells[7].innerHTML = wizCurrExp
    }
})

wizard.rows[1].cells[10].addEventListener("click",function()
{
    if( wizCurrExp>wizFloor)
    {
        wizCurrExp = wizCurrExp -5
        wizard.rows[1].cells[7].innerHTML = wizCurrExp
    }
})

wizard.rows[1].cells[11].addEventListener("click",function()
{
    if( wizCurrExp>wizFloor+5)
    {
        wizCurrExp = wizCurrExp -10
        wizard.rows[1].cells[7].innerHTML = wizCurrExp
    }
})