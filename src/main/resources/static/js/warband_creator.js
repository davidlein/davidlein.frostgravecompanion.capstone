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