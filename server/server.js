var express = require('express');
var http = require('http');
var app = express();

require('./module/CommercesService.js').services(app);

var server = http.createServer(app);
server.listen(5000);
console.log("server listen on port 5000");