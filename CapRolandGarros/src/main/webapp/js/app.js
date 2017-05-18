

function getAllCustomers() {
    var customers = [
        {id: 1, name: "areva"},
        {id: 2, name: "renault"},
        {id: 3, name: "sanofi"},
        {id: 4, name: "total"},
        {id: 5, name: "edf"}
    ];
    return customers;
}

function getAllProjects() {
    var projects = [
        {id: 1, title: "jojo", customer_id: 1},
        {id: 2, title: "joujou", customer_id: 1},
        {id: 3, title: "jojo", customer_id: 2},
        {id: 4, title: "bof", customer_id: 3}
    ];
    return projects;
}


var times = JSON.parse(localStorage.getItem("times"));
if (!times) {
    times = [];
} else {
    for (var i = 0; i < times.length; i++) {
        var time = times[i];
        time.timeStart = new Date(time.timeStart);
        time.timeEnd = new Date(time.timeEnd);
    }
}



/*
 var times =[
 {id:1,project_id:"1",timeStart: new Date(2017,3,5,10,55,21),timeEnd: new Date(2017,3,5,10,55,22)},
 {id:2,project_id:"2",timeStart: new Date(2017,2,5,10,55,21),timeEnd: new Date(2017,3,5,10,55,24)},
 {id:3,project_id:"2",timeStart: new Date(2017,1,5,10,55,21),timeEnd: new Date(2017,3,5,10,55,26)},
 {id:4,project_id:"4",timeStart: new Date(2017,0,5,10,55,21),timeEnd: new Date(2017,3,5,10,55,28)}
 ];
 */
function getCustomerProjects(id) {
    var projects = getAllProjects();
    var customerProjects = [];
    for (var i = 1; i < projects.length; i++) {
        var project = projects [i];
        if (project.customer_id == id) {
            customerProjects.push(project);
        }

    }
    return customerProjects;
}

function getProject(id) {
    var projects = getAllProjects();
    return projects.filter(function (project) {
        return project.id == id;
    })[0];
}


for (var i = 0; i < getAllCustomers.length; i++) {
    var customer = customers[i];
    console.log(customer);
}

function getCustomer(id) {
    var customers = getAllCustomers();
    return customers.filter(function (customer) {
        return customer.id == id;
    })[0];
}

/*
 console.groupEnd();
 for (var i = 0;i<getAllProjects.length;i++){
 var project = projects[i];
 console.log(project);
 }
 console.groupEnd();
 for (var i = 0;i<getAllTimes.length;i++){
 var time = times[i];
 console.log(time);
 }
 console.groupEnd();
 /*
 var count = 0;
 var counter = function(){
 count++;
 console.log(count);
 if (count>=10){
 clearInterval(interval);
 }
 }
 var interval = setInterval(counter,1000);//puis dans la console clearInterval(interval)
 */
function loadCustomers() {
    var customers = getAllCustomers();
    var select = document.getElementById("selectCustomer");
    for (var i = 0; i < customers.length; i++) {
        var customer = customers[i];
        var option = document.createElement("option");
        var optionText = document.createTextNode(customer.name);
        option.appendChild(optionText);
        select.appendChild(option);
        option.setAttribute("value", customer.id); //ajoute une valeur à chaque option   
    }
    select.addEventListener("change", loadProjects); //ajoute un eventListener
}
loadCustomers();

function loadProjects() {
    //console.log(this.value);

    var myNode = document.getElementById("selectProject");
    //select.innerHTML="";//prend tout le code HTML mais je dois mal le coder

    while (myNode.firstChild) {
        myNode.removeChild(myNode.firstChild);
    }

    var projects = getAllProjects();
    var select = document.getElementById("selectProject");
    for (var i = 0; i < projects.length; i++) {
        var project = projects[i];
        var option = document.createElement("option");
        if (project.customer_id == this.value) {
            var optionText = document.createTextNode(project.title);
            option.appendChild(optionText);
            select.appendChild(option);
            option.setAttribute("value", project.id);
        }
    }
}

/*//exemple de récupération de code
 var input = document.createElement("input");
 
 input.setAttribute("id","input");
 
 document.getElementById("times").appendChild(input)
 
 input.addEventListener("keypress",change);
 
 function change(event){
 console.log(event.keyCode);
 if(event.keyCode==13){
 alert("vous avez tapez : " +this.value)//this correspond à input
 this.value="";
 }
 }
 */
var timer = null;

var finActivite = null;

function stopDefAction(evt) {
    evt.preventDefault();
    if (timer) {

        var finActivite = new Date();
        times.unshift({id: times.length,
            timeStart: timer,
            timeEnd: new Date(),
            project_id: document.getElementById("selectProject").value
        });
        localStorage.setItem("times", JSON.stringify(times));
        loadTimes();

        timer = null;
        pathbtn.className = "btn btn-success";
        this.querySelector(".fa").className = "fa fa-play";
        this.querySelector(".btn-label").innerText = "Demarrer";
        clearInterval(timerInterval);
        document.getElementById("timer").innerText = "00:00:00";

    } else {
        timer = new Date();
        pathbtn.className = "btn btn-danger";
        this.querySelector(".fa").className = "fa fa-stop";//comme le selecteur css
        this.querySelector(".btn-label").innerText = "Stop";
        timerInterval = setInterval(refreshTimer, 1000);

    }
}
var pathbtn = document.getElementById("btnRecord");//chemin du boutton

pathbtn.addEventListener(
        "click", stopDefAction
        );



function refreshTimer() {
    var spanTimer = document.getElementById("timer");
    var now = new Date();
    var diff = new Date(now - timer);
    spanTimer.innerText = (diff.getHours() - 1) + ":" + diff.getMinutes() + ":" + diff.getSeconds();

}

function loadTimes() {
    var tbody = document.getElementById("times").querySelector("tbody");
    tbody.innerHTML = "";
    for (var i = 0; i < times.length; i++) {
        var time = times[i];
        var project = getProject(time.project_id);
        var customer = getCustomer(project.customer_id);
        var tr = document.createElement("tr");

        //Client
        var tdClient = document.createElement("td");
        tdClient.innerText = customer.name;
        tr.appendChild(tdClient);

        tbody.appendChild(tr);

        //projet
        var tdProjet = document.createElement("td");
        tdProjet.innerText = project.title;
        tr.appendChild(tdProjet);

        tbody.appendChild(tr);


        //début
        var tddebut = document.createElement("td");
        tddebut.innerText = time.timeStart;
        tr.appendChild(tddebut);

        tbody.appendChild(tr);

        //début
        var tdfin = document.createElement("td");
        tdfin.innerText = time.timeEnd;
        tr.appendChild(tdfin);

        tbody.appendChild(tr);

        //début
        var tddebut = document.createElement("td");
        var tps = new Date(time.timeEnd - time.timeStart);
        tddebut.innerText = tps.getHours() + ":" + tps.getMinutes() + ":" + tps.getSeconds();
        tr.appendChild(tddebut);

        tbody.appendChild(tr);
        
        
         //action
         var tdAction = $('<td><a href="#" class="btn btn-danger" data-id="'+ time.id+ '"><i class ="fa fa-trash"></i></a></td>');
        
        $(tr).append(tdAction);

        tbody.appendChild(tr);

    }

}



loadTimes();

$("#times").on("click",".btn-danger", function(event){
$(this).closest('tr').fadeOut();
var id=$(this).data("id");
times = times.filter((time)=> time.id != id);
localStorage.setItem("times", JSON.stringify(times));
console.log(id);
});








