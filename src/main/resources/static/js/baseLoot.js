class resource
{
    constructor(type, effect, cost)
    {
        this.type = type
        this.effect = effect
        this.cost = cost
    }
}

const kennel = new resource("Kennel","Allows a wizard to keep one war hound or wolf (Animal Companion) in their warband above their normal soldier limit. Thus, a wizard may bring eight soldiers plus one war hound/wolf to each game.","400gc")
const giantCauldron = new resource("Giant Cauldron","Confers a +1 to Casting Rolls for Brew Potion","250gc")
const enchanterWorkshop = new resource("Enchanter's Workshop","Confers a +1 to Casting Rolls for Animate Construct and Embed Enchantment","400gc")
const crystalBall = new resource("Crystal Ball","Confers a +1 to Castings Rolls for Reveal Secret","250gc")
const scriptorium = new resource("Scriptorium","Confers a +1 to Casting Rolls for Write Scroll","200gc")
const celestialTelescope = new resource("Celestial Telescope","Aids the wizard in divining the future. Once per game they may add +5 to an Initiative Roll before the dice have been rolled.","250gc")
const summoningCircle = new resource("Summoning Circle","A Summoning Circle allows the wizard to attempt to summon a demon before a game, effectively adding an Out of Game (B) option to the Summon Demon and Control Demon spells (see pages 133 and 116). The wizard first attempts to cast Summon Demon, followed by Control Demon. If both spells are successful, a demon joins the warband as a temporary member per the rules for Summon Demon. This demon does not count towards the warband's maximum size. The wizard may not cast Control Demon or Summon Demon while this demon is in play.","300gc")
const carrierPigeons = new resource("Carrier Pigeons","Carrier Pigeons allow a wizard to more easily get messages to their agents outside Frostgrave. Soldiers hired by the wizard cost 10gc less.","50gc")
<<<<<<< HEAD
const arcanCandle = new resource("Arcane Candle","Confers a +1 to Casting Rolls for Control Demon spells cast Out of Game","100gc")
const summoningCandle = new resource("Summoning Candle","Confers a +1 to Casting Rolls for Summon Demon spells cast Out of Game","100gc")
const sarcophagusOfHealing = new resource("Sarcophagus of Healing","The wizard does not have to miss a game, or pay a fee, when they are Badly Wounded, and pays 10gc less if they have any Niggling Injuries","300gc")

let resourceObj = {kennel, giantCauldron,enchanterWorkshop,crystalBall,scriptorium,celestialTelescope,summoningCircle,carrierPigeons,arcanCandle,summoningCandle,sarcophagusOfHealing}
=======
const arcaneCandle = new resource("Arcane Candle","Confers a +1 to Casting Rolls for Control Demon spells cast Out of Game","100gc")
const summoningCandle = new resource("Summoning Candle","Confers a +1 to Casting Rolls for Summon Demon spells cast Out of Game","100gc")
const sarcophagusOfHealing = new resource("Sarcophagus of Healing","The wizard does not have to miss a game, or pay a fee, when they are Badly Wounded, and pays 10gc less if they have any Niggling Injuries","300gc")

let resourceObj = {kennel, giantCauldron,enchanterWorkshop,crystalBall,scriptorium,celestialTelescope,summoningCircle,carrierPigeons,arcaneCandle,summoningCandle,sarcophagusOfHealing}
>>>>>>> 23d8b0d975b91acbe40e5e1c5bbd0ea4a7d8295d



let baseSelect = document.getElementById("base-select")
baseSelect.addEventListener("change", function(e)
{
    baseVal = e.target.value
    let baseDesc = document.getElementById("baseDesc")
    if(baseVal == "inn")
    {baseDesc.textContent="This old inn has plenty of room to house soldiers and their gear. The wizard may keep an extra soldien in their warband. This soldier can be a specialist. However, this extra soldier cannot be used in a game and must remain in the base. Even with an inn, a wizard is still limited to eight soldiers in a game, with a maximum of four specialists. The wizard may change which soldier is left in the inn each game, which is useful if a soldier must miss a game due to injury."
    }else if (baseVal =="temple")
    {baseDesc.textContent="The ruins of this once-holy building still project an aura of calm. Spellcasters receive a +3 bonus to any castings of Miraculous Cure. Furthermore, roll a die after each game: on a 16+ they gain a free porion of healing (page 91)."
    }else if (baseVal =="crypt")
    {baseDesc.textContent="It's not the most comfortable place to sleep, but it is full of 'supplies'. Spellcasters receive a +2 bonus on all Raise Zombie and Animate Skull spells, regardless if the spell is cast during a game or Out of Game."
    }else if (baseVal =="tower")
    {baseDesc.textContent="This half-ruined spire allows the wizard to get closer to the heavens and to clear their mind. The tower grants a +2 bonus to all Casting Rolls for Reveal Secret and Awareness"
    }else if (baseVal =="treasury")
    {baseDesc.textContent="This treasury has remained relatively untouched and many of its vaults are still sealed. After each game, teh warband may attempt to open a vault. Roll one die. If the result is 2-16 add that many gold crowns to the warband's treasury. If a 17-18 is rolled add 100gc to that number. If a 19-20 is rolled, the warband finds a treasure - determine the nature of this treasure in the same way as rolling for a treasure token secured during the game."
    }else if (baseVal =="brewery")
    {   baseDesc.textContent="There is still some life left in those old casks, and the warband takes full advantage. All soldiers start each game with +1 Will. Furthermore, the warband gains an additional 20gc after each game through the sale of excess stock."
    }else if (baseVal =="library")
    {baseDesc.textContent="This is one of the many libraries scattered throughout the city. The volumes contained within this one have fallen to the ravages of weather and time. A few valuable texts have survived, however. After each game the warband may roll one die. On a 15-18, they find a random scroll. On a 19-20 they discover a random grimoire."
    }else 
    {baseDesc.textContent="A mostly intact residence of a wizard from long ago. It is still filled with their notes and experiments. A wizard gains 20 exoerience points after each game from what they learn in the house. This does not count against the 300 experience point maximum for each game."
    }
})

document.getElementById("upgradeButton").addEventListener("click",addUpgrade)

function addUpgrade()
{
    let resourceVal = document.getElementById("base-resource").value
    let tbody = document.getElementById("base-resource-table-body")

    let row =tbody.insertRow(-1)
    let cell = row.insertCell(0)
    let cell1 = row.insertCell(1)
    let cell2 = row.insertCell(2)
    cell.innerHTML = resourceObj[resourceVal].type
    cell1.innerHTML = resourceObj[resourceVal].effect
    cell2.innerHTML = resourceObj[resourceVal].cost
}