class soldier
{
    constructor(id, type, move, fight, shoot, armour, will, health, cost, notes, specialist)
    {
        this.id = id
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
const thug = new soldier(1,"Thug", "6","+2","+0","10","-1","10","0",["Hand Weapon"],false)
const thief = new soldier(2,"Thief", "7","+1","+0","10","+0","10","0",["Dagger"],false)
const warhound = new soldier(3,"War Hound", "8","+1","+0","10","-2","8","10",["Animal"],false)
const infantryman = new soldier(4,"Infantryman", "6","+3","+0","11","+0","10","50",["Two-Handed Weapon", " Light Armour"],false)
const manatarms = new soldier(5,"Man-at-Arms", "6","+3","+0","12","+1","12","75",["Hand Weapon"," Shield"," Light Armour"],false)
const apothecary = new soldier(6,"Apothecary", "6","+1","+0","10","+3","12","75",["Staff"," Healing Potion"],false)
//specialist soldiers
const archer = new soldier(7,"Archer", "6","+1","+2","11","+0","10","75",["Bow"," Quiver"," Dagger"," Light Armour"],true)
const crossbowman = new soldier(8,"Crossbowman", "6","+1","+2","11","+0","10","75",["Crossbow"," Quiver"," Dagger"," Light Armour"],true)
const treasurehunter = new soldier(9,"Treasure Hunter", "7","+3","+0","11","+2","12","100",["Hand Weapon"," Dagger"," Light Armour"],true)
const tracker = new soldier(10,"Tracker", "7","+1","+2","11","+1","12","100",["Staff"," Bow"," Quiver"," Light Armour"],true)
const knight = new soldier(11,"Knight", "5","+4","+0","13","+1","12","125",["Hand Weapon"," Dagger"," Shield"," Heavy Armour"],true)
const templar = new soldier(12,"Templar", "5","+4","+0","12","+1","12","125",["Two-Handed Weapon", " Heavy Armour"],true)
const ranger = new soldier(13,"Ranger", "7","+2","+2","11","+2","12","125",["Bow"," Quiver"," Hand Weapon"," Light Armour"],true)
const barbarian = new soldier(14,"Barbarian", "6","+4","+0","10","+3","14","125",["Two-Handed Weapon", " Dagger"],true)
const marksman = new soldier(15,"Marksman", "5","+2","+2","12","+1","12","125",["Crossbow"," Quiver"," Hand Weapon"," Heavy Armour"],true)

//When the person presses the "soldier-submit" button. Take the value of "soldier-select" and build a table with the information contained within

let soldierObj ={thug,thief,warhound, infantryman, manatarms, apothecary, archer, crossbowman, treasurehunter, tracker, knight, templar, ranger, barbarian, marksman}

document.getElementById("soldier-select-view").addEventListener("change",soldierSelectChange)
const inputType = document.getElementById("input-type")
const inputCost = document.getElementById("input-cost")
const inputMove = document.getElementById("input-move")
const inputFight = document.getElementById("input-fight")
const inputShoot = document.getElementById("input-shoot")
const inputArmour = document.getElementById("input-armour")
const inputWill = document.getElementById("input-will")
const inputHealth = document.getElementById("input-health")
const inputNotes = document.getElementById("input-notes")
const inputSpecialist = document.getElementById("input-specialist")

// Generates a small table NOT connected to the DB, but then takes those values and adds them to the DB
function soldierSelectChange() {

    let soldierVal = document.getElementById("soldier-select-view").value.toLowerCase().replace(/\s/g, '')
    document.getElementById("type-id").textContent=soldierObj[soldierVal].type
    inputType.setAttribute("value",soldierObj[soldierVal].type)
    document.getElementById("cost-id").textContent=soldierObj[soldierVal].cost
    inputCost.setAttribute("value",soldierObj[soldierVal].cost)
    document.getElementById("move-id").textContent=soldierObj[soldierVal].move
    inputMove.setAttribute("value",soldierObj[soldierVal].move)
    document.getElementById("fight-id").textContent=soldierObj[soldierVal].fight
    inputFight.setAttribute("value",soldierObj[soldierVal].fight)
    document.getElementById("shoot-id").textContent=soldierObj[soldierVal].shoot
    inputShoot.setAttribute("value",soldierObj[soldierVal].shoot)
    document.getElementById("armour-id").textContent=soldierObj[soldierVal].armour
    inputArmour.setAttribute("value",soldierObj[soldierVal].armour)
    document.getElementById("will-id").textContent=soldierObj[soldierVal].will
    inputWill.setAttribute("value",soldierObj[soldierVal].will)
    document.getElementById("health-id").textContent=soldierObj[soldierVal].health
    inputHealth.setAttribute("value",soldierObj[soldierVal].health)
    document.getElementById("notes-id").textContent=soldierObj[soldierVal].notes
    inputNotes.setAttribute("value",soldierObj[soldierVal].notes)



    console.log(inputType.value)
    let specialistBool =false
    if(soldierObj[soldierVal].specialist===true)
    {
        specialistBool= "Yes"
    }else specialistBool = "No"
    inputSpecialist.value = specialistBool
    document.getElementById("specialist-id").textContent=specialistBool
}