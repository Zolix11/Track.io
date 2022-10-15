const bodyParser = require('body-parser');
const express = require('express');
const https = require('https');
const fs = require('fs');

const adminRoutes = require('./routes/admin');
const challangeRoutes = require('./routes/challenges');
const userdetRoutes = require('./routes/userdetails');
const userworkRoutes = require('./routes/userworkout');

const options = {
  key: fs.readFileSync('key.pem'),
  cert: fs.readFileSync('cert.pem')
};

const app = express();

app.use('/', (req, res, next)=>{
  console.log("incoming request");
  next();
});

app.post('/', bodyParser.urlencoded({extended: false}));

app.post('/signup', (req, res, next) =>{
    res.status(200).send("OK");
});

app.post('/login', (req, res, next)=>{
  var name = req.body.name;
  var passw = req.body.passw

  if(name === "KisJano" && passw === "asd123456"){
    res.status(200).send("OK");
  }else{
    res.status(400).send("Authentication failed");
  }
});

app.use('/userdetails', userdetRoutes);
app.use('/userWorkout', userworkRoutes);
app.use('/challanges', challangeRoutes)
app.use('/admin', adminRoutes);

https.createServer(options, app).listen(443);