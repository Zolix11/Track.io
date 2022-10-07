const bodyParser = require('body-parser');
const express = require('express');
const http = require('http');

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

const server = http.createServer(app);

server.listen(80);