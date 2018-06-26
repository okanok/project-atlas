function postSettings() {
    var xhttp = new XMLHttpRequest();
    xhttp.open("POST", "/settings/postAll", true);
    xhttp.setRequestHeader("Content-type", "application/json");
    xhttp.onload = function (e) {
      if (xhttp.readyState === 4) {
          if (xhttp.status === 200) {
              location.reload()
          }
      }
    };
    xhttp.onerror = function () {
        console.log(xhttp.statusText)
    };
    xhttp.send('{"test": "test"}');
}