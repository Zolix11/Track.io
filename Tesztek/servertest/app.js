const bodyParser = require('body-parser');
const express = require('express');
const https = require('https');
const fs = require('fs');

const options = {
  key: fs.readFileSync('key.pem'),
  cert: fs.readFileSync('cert.pem')
};

const app = express();

app.use('/btn', (req, res, next) =>{
    console.log('Incoming request');

    res.status(200).json([{
        "userId": 10,
        "id": 10,
        "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
        "body": "GET request megérkezett a Track.io szerverre"
      }])
})

app.post('/posts', bodyParser.urlencoded({extended: false}))

app.post('/posts', (req, res, next)=>{
  console.log(req.body.name)

  res.status(200).json({
    "userId": 2,
    "id": 2,
    "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
    "body": "POST request megérkezett a Track.io szerverre"
  })
})

https.createServer(options, app).listen(443);