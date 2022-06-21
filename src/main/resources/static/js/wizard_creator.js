class school
{
    constructor(name)
    {
        this.name = name
    }
}
const chronomancer = new school("Chronomancer")
const elementalist = new school("Elementalist")
const enchanter = new school("Enchanter")
const illusionist = new school("Illusionist")
const necromancer = new school("Necromancer")
const sigilist = new school("Sigilist")
const soothsayer = new school("Soothsayer")
const summoner = new school("Summoner")
const thaumaturge = new school("Thaumaturge")
const witch = new school("Witch")
let schoolObj = {chronomancer, elementalist, enchanter, illusionist, necromancer, sigilist, soothsayer, summoner, thaumaturge, witch}

const inputSchool = document.getElementById("input-school")
const inputMove = document.getElementById("input-move")
const inputFight = document.getElementById("input-fight")
const inputShoot = document.getElementById("input-shoot")
const inputArmour = document.getElementById("input-armour")
const inputWill = document.getElementById("input-will")
const inputHealth = document.getElementById("input-health")
const inputXp = document.getElementById("input-xp")
const inputLevel =document.getElementById("input-level")
const inputTreasury =document.getElementById("input-treasury")


document.getElementById("school-select").addEventListener("change",schoolSwitch)
function schoolSwitch()
{
    let schoolVal = document.getElementById("school-select").value.toLowerCase()
    inputSchool.setAttribute("value",schoolObj[schoolVal].name)
}

inputMove.setAttribute("value","6")
inputFight.setAttribute("value","+2")
inputShoot.setAttribute("value","+0")
inputArmour.setAttribute("value","10")
inputWill.setAttribute("value","+4")
inputHealth.setAttribute("value","14")
inputXp.setAttribute("value","0")
inputLevel.setAttribute("value","0")
inputTreasury.setAttribute("value","300")