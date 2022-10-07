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
        "body": "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"
      }])
})

app.post('/posts', bodyParser.urlencoded({extended: false}))

app.post('/posts', (req, res, next)=>{
  console.log(req.body.name)

  res.status(200).json({
    "userId": 2,
    "id": 2,
    "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
    "body": "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"
  })
})

const server = http.createServer(app);

server.listen(3000);