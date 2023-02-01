// 1. GET request using fetch()
fetch("http://localhost:8080/rest/vins")
    // Converting received data to JSON
    .then((response) => response.json())
    .then((json) => {

        // 2. Create a variable to store HTML table headers
        let li = `<thead><tr><th>Nom</th><th>Millésime</th><th>Pétillant</th><th>Quantité</th> <th>Couleur</th><th>Région</th></tr></thead><tbody>`;

        // 3. Loop through each data and add a table row
        json.forEach((vin) => {
            li += `<tr>
        <td>${vin.nom}</td>
        <td>${vin.millesime} </td>
        <td>${vin.petillant}</td>
        <td>${vin.quantite}</td>
        <td>${vin.couleur.nom}</td>
        <td>${vin.region.nom}</td>
    </tr>`;
        });

        // 4. DOM Display result
        document.getElementById("vins").innerHTML = li;

        const compare = function(ids, asc){
            return function(row1, row2){
                const tdValue = function(row, ids){
                    return row.children[ids].textContent;
                }
                const tri = function(v1, v2){
                    if (v1 !== '' && v2 !== '' && !isNaN(v1) && !isNaN(v2)){
                        return v1 - v2;
                    }
                    else {
                        return v1.toString().localeCompare(v2);
                    }
                    return v1 !== '' && v2 !== '' && !isNaN(v1) && !isNaN(v2) ? v1 - v2 : v1.toString().localeCompare(v2);
                };
                return tri(tdValue(asc ? row1 : row2, ids), tdValue(asc ? row2 : row1, ids));
            }
        }

        const tbody = document.querySelector('tbody');
        const thx = document.querySelectorAll('th');
        const trxb = tbody.querySelectorAll('tr');
        thx.forEach(function(th){
            th.addEventListener('click', function(){
                let classe = Array.from(trxb).sort(compare(Array.from(thx).indexOf(th), this.asc = !this.asc));
                classe.forEach(function(tr){
                    tbody.appendChild(tr)
                });
            })
        });
    });


