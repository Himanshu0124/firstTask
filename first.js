function chooseTable()
{
    var a = document.getElementById("inputtextTable").value;
    if(a == 1){
        document.getElementById("firstTable").innerHTML = "Booked SuccessFully";
         document.getElementById("firstTable").style.color = "red";
    }
    else if(a == 2){
        document.getElementById("secondTable").innerHTML = "Booked SuccessFully";
         document.getElementById("secondTable").style.color = "red";
    }
    else if(a == 3){
        document.getElementById("thirdTable").innerHTML = "Booked SuccessFully";
         document.getElementById("thirdTable").style.color = "red";
    }
    else if(a == 4){
        document.getElementById("fourTable").innerHTML = "Booked SuccessFully";
         document.getElementById("fourTable").style.color = "red";
    }
    else if(a == 5){
        document.getElementById("fiveTable").innerHTML = "Booked SuccessFully";
         document.getElementById("fiveTable").style.color = "red";
    }
    else if(a == 6){
        document.getElementById("sixTable").innerHTML = "Booked SuccessFully";
         document.getElementById("sixTable").style.color = "red";
    }
    else if(a == 7){
        document.getElementById("sevenTable").innerHTML = "Booked SuccessFully";
         document.getElementById("sevenTable").style.color = "red";
    }
    else if(a == 8){
        document.getElementById("eightTable").innerHTML = "Booked SuccessFully";
         document.getElementById("eightTable").style.color = "red";
    }
    else
    {
        alert("Please Book Table in Correct Sequence");
    }


}