let teams = ["CSK", 'GT', 'MI', 'RR', 'RCB', 'KKR', 'DC'];
let menu = document.querySelectorAll(".menu");
let scores = document.querySelectorAll(".score");
let button = document.querySelector("button");

let regexForRun=/[0-9][0-9]+\/[0-9]+$/



teams.map((team) => {
    menu[0].innerHTML += `<option value=${team} >${team}</option>`;
})

menu[0].addEventListener("change", () => {
    menu[1].innerHTML=`<option selected disabled>select</option>`;;
     teams.map((team)=>{
            if(menu[0].value!=team)
                 menu[1].innerHTML += `<option value=${team}>${team}</option>`;
    })
})




scores[0].addEventListener("keyup", () => {
    if (menu[0].selectedIndex != 0 && scores[0].value != "") {
        let score2 = document.querySelector("#score2");
        score2.disabled = false;
        menu[1].disabled = false;
    }
})




button.addEventListener("click", () => {

    if (scores[0].value == "" || scores[1].value == "") {
        alert("both scores required");
        return;
    }
    else if(!regexForRun.test(scores[0].value) || !regexForRun.test(scores[1].value))
    {
        alert("Invalid score format ");
        return;
    }
    if(menu[0].selectedIndex==0 || menu[1].selectedIndex==0)
    {
        alert("Select team name");
        return;
    }

   
   




    let wicket1 = scores[0].value.split("/")[1];
    let wicket2 = scores[1].value.split("/")[1];
    let score1 = scores[0].value.split("/")[0];
    let score2 = scores[1].value.split("/")[0];
    if (parseInt(wicket1) > 10 || parseInt(wicket2) > 10) {
        alert("wicket is invalid");
        return;
    }

    if (parseInt(score1) == parseInt(score2)) {
        alert("Match tie");
        return;
    }

    if (parseInt(score1) > parseInt(score2)) {
       
          alert(`Team 1 won by ${parseInt(score1)-parseInt(score2)} run/s `)
    }
    else {
        if(parseInt(score2)-parseInt(score1)>7)
        {
          alert("This situation is not possible, since if team2 wins the max possibility it can win by it 7 runs only even  we consider the last ball as no ball having six ");
          return;
        }
        alert(`Team 2 won by ${10-parseInt(wicket2)} wickets `);
    }
})
