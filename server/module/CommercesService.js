exports.services = function(app){	

	app.get('/commerces', function(req, res) {
		res.sendFile(__dirname +'/data/commerces.json');
	});
}
