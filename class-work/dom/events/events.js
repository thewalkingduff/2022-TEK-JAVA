let para = document.createElement("p");
para.innerHTML = "This is a new paragraph";
document.body.appendChild(para);

var uselessElemen= document.querySelector('#delMe');
      uselessElemen.remove(); 
      
const btn = document.getElementById("btn")

btn.addEventListener("click", clickMe);

      function clickMe() {
        const list = document.getElementById("underordered-list");
        const li = document.createElement("li");
        li.innerHTML = "New Element";
        list.appendChild(li);
      }