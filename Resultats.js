


function loadMatch(){
  
  var tour=document.getElementById("tour1");
  
  tour.innerHTML="<p id = 'tour1' ><strong>Tour 1</strong><p/>";
  
 for (var i = 1; i < 65; i++) {    

    tour.innerHTML= tour.innerHTML + `
      <table class ="`+i+`">                 
           <thead> Match ` +i+`<thead/>
                 <body><body/>   
                    <tr>
                        <td><input id = "nomA`+i+`" name="nom1"   style = "width:150px" placeholder="nom1" /></td>
                        <td><input id = "scoreA`+i+`" name="score1"  style = "width:50px" placeholder="score1" /></td>
                    </tr> 
                    <tr>
                        <td><input id = "nomB`+i+`" name="nom2"  style = "width:150px" placeholder="nom2" /></td>
                        <td><input id = "scoreB`+i+`" name="score2"  style = "width:50px" placeholder="score2" /></td>
                    </tr>
                </table>
                `
 }  
 
 tour=document.getElementById("tour2");
 tour.innerHTML="<p id = 'tour2' ><strong>Tour 2</strong><p/>";
  
 for (var i = 65; i < 97; i++) {    

    tour.innerHTML= tour.innerHTML + `
      <table class ="`+i+`">                 
           <thead> Match ` +i+`<thead/>
                 <body><body/>   
                    <tr>
                        <td><input id = "nomA`+i+`" name="nom1"   style = "width:150px" placeholder="nom1" /></td>
                        <td><input id = "scoreA`+i+`" name="score1"  style = "width:50px" placeholder="score1" /></td>
                    </tr> 
                    <tr>
                        <td><input id = "nomB`+i+`" name="nom2"  style = "width:150px" placeholder="nom2" /></td>
                        <td><input id = "scoreB`+i+`" name="score2"  style = "width:50px" placeholder="score2" /></td>
                    </tr>
                </table>
                `
 }  
 
  tour=document.getElementById("tour3");
 tour.innerHTML="<p id = 'tour3' ><strong>Tour 3</strong><p/>";
  
 for (var i = 97; i < 113; i++) {    

    tour.innerHTML= tour.innerHTML + `
      <table class ="`+i+`">                 
           <thead> Match ` +i+`<thead/>
                 <body><body/>   
                    <tr>
                        <td><input id = "nomA`+i+`" name="nom1"   style = "width:150px" placeholder="nom1" /></td>
                        <td><input id = "scoreA`+i+`" name="score1"  style = "width:50px" placeholder="score1" /></td>
                    </tr> 
                    <tr>
                        <td><input id = "nomB`+i+`" name="nom2"  style = "width:150px" placeholder="nom2" /></td>
                        <td><input id = "scoreB`+i+`" name="score2"  style = "width:50px" placeholder="score2" /></td>
                    </tr>
                </table>
                `
 }  
 
   tour=document.getElementById("tour4");
 tour.innerHTML="<p id = 'tour4' ><strong>Huitièmes</strong><p/>";
  
 for (var i = 113; i < 121; i++) {    

    tour.innerHTML= tour.innerHTML + `
      <table class ="`+i+`">                 
           <thead> Match ` +i+`<thead/>
                 <body><body/>   
                    <tr>
                        <td><input id = "nomA`+i+`" name="nom1"   style = "width:150px" placeholder="nom1" /></td>
                        <td><input id = "scoreA`+i+`" name="score1"  style = "width:50px" placeholder="score1" /></td>
                    </tr> 
                    <tr>
                        <td><input id = "nomB`+i+`" name="nom2"  style = "width:150px" placeholder="nom2" /></td>
                        <td><input id = "scoreB`+i+`" name="score2"  style = "width:50px" placeholder="score2" /></td>
                    </tr>
                </table>
                `
 }  
 
  
   tour=document.getElementById("tour5");
 tour.innerHTML="<p id = 'tour5' ><strong>Quarts</strong><p/>";
  
 for (var i = 121; i < 125; i++) {    

    tour.innerHTML= tour.innerHTML + `
      <table class ="`+i+`">                 
           <thead> Match ` +i+`<thead/>
                 <body><body/>   
                    <tr>
                        <td><input id = "nomA`+i+`" name="nom1"   style = "width:150px" placeholder="nom1" /></td>
                        <td><input id = "scoreA`+i+`" name="score1"  style = "width:50px" placeholder="score1" /></td>
                    </tr> 
                    <tr>
                        <td><input id = "nomB`+i+`" name="nom2"  style = "width:150px" placeholder="nom2" /></td>
                        <td><input id = "scoreB`+i+`" name="score2"  style = "width:50px" placeholder="score2" /></td>
                    </tr>
                </table>
                `
 }
 
    tour=document.getElementById("tour6");
 tour.innerHTML="<p id = 'tour6' ><strong>Demies</strong><p/>";
  
 for (var i = 125; i < 127; i++) {    

    tour.innerHTML= tour.innerHTML + `
      <table class ="`+i+`">                 
           <thead> Match ` +i+`<thead/>
                 <body><body/>   
                    <tr>
                         <td><input id = "nomA`+i+`" name="nom1"   style = "width:150px" placeholder="nom1" /></td>
                        <td><input id = "scoreA`+i+`" name="score1"  style = "width:50px" placeholder="score1" /></td>
                    </tr> 
                    <tr>
                        <td><input id = "nomB`+i+`" name="nom2"  style = "width:150px" placeholder="nom2" /></td>
                        <td><input id = "scoreB`+i+`" name="score2"  style = "width:50px" placeholder="score2" /></td>
                    </tr>
                </table>
                `
 }
 
     tour=document.getElementById("tour7");
 tour.innerHTML="<p id = 'tour7' ><strong>Finale</strong><p/>";
  
 for (var i = 127; i < 128; i++) {    

    tour.innerHTML= tour.innerHTML + `
      <table class ="`+i+`">                 
           <thead> Match ` +i+`<thead/>
                 <body><body/>   
                    <tr>
                         <td><input id = "nomA`+i+`" name="nom1"   style = "width:150px" placeholder="nom1" /></td>
                        <td><input id = "scoreA`+i+`" name="score1"  style = "width:50px" placeholder="score1" /></td>
                    </tr> 
                    <tr>
                        <td><input id = "nomB`+i+`" name="nom2"  style = "width:150px" placeholder="nom2" /></td>
                        <td><input id = "scoreB`+i+`" name="score2"  style = "width:50px" placeholder="score2" /></td>
                    </tr>
                </table>
                `
 }
    
}
loadMatch();

