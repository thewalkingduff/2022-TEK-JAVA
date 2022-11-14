function mydropbox() {
    var mylist = document.getElementById("myList");
    document.getElementById("favourite").value = mylist.options[mylist.selectedIndex].text;
    }

    console.log(document.title);
    document.title = "This is a new title";
    console.log(document.title);

    const listItems = document.getElementsByClassName("list-item");
    console.log(typeof listItems);
    for(i in listItems) {
        console.log(listItems[i].innerHTML);
    }

    const header = document.getElementById("page-title-css");
    const redButton = document.getElementById("toggle-red")
    redButton.addEventListener("click", () => {
        header.classList.toggle("red-background");
    })
    

    const listItem1 = document.getElementById("item-1").parentElement;
    console.log("name " + listItem1.getAttribute("name"));
    console.log(listItem1.getAttribute("custom-attr"));

    const unorderedList = document.getElementById("unordered-list");
    const li = document.createElement("li");
    li.appendChild(document.createTextNode("Item 5 created by appendChild"));
    unorderedList.appendChild(li);

    const item2 = document.getElementById("item-2");
    unorderedList.removeChild(item2);

    const emailInput = document.getElementById("emailId")
    const submitButton = document.getElementById("submit-button")
    const form = document.getElementById("form");
    submitButton.addEventListener(("click"), (e) => {
        e.preventDefault();
        console.log(emailInput.value)
        console.log("form submitted")
    })

   
   
    